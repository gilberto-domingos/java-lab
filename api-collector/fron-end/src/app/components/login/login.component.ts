import { DataAccessedService } from './../../services/data-accessed.service';
import { CommonService } from './../../services/common.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Location } from '@angular/common';
import { MatSnackBar } from '@angular/material/snack-bar';
import { catchError, tap } from 'rxjs/operators';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {

  itemToSave: any = {}; 
  form: FormGroup;
  

  constructor(private commonService: CommonService,
    private formBuilder: FormBuilder,
    private dataAccessedService: DataAccessedService,
    private snackBar: MatSnackBar,
    private locationll: Location) {

    this.form = this.formBuilder.group({
      username: [null],
      password: [null]      
    });

  }

  ngOnInit() {}


  salvarItem(item: any): void {
    this.dataAccessedService.createItem(item)
      .pipe(
        tap((data: any) => {
          this.onSuccess();
        }),
        catchError((error: any) => {
          this.onError();
          throw error;
        })
      )
      .subscribe();
  }


  onSubmit() {
    if (this.form.valid) {
      const formData = this.form.value; 

      this.salvarItem(formData);
    }
  }

  onCancel() {
    this.locationll.back();
  }

  private onSuccess() {
    this.snackBar.open("Salvo com sucesso !",'', { duration: 3000 });
  }

  private onError(){
    this.snackBar.open("Erro ao salvar.",'', {duration: 5000 });
  }

}
