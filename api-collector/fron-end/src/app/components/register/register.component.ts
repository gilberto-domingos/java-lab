import { Component, OnInit } from '@angular/core';
import { RegisterService } from 'src/app/services/register.service';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Location } from '@angular/common';
import { format } from 'date-fns';
import { MatSnackBar } from '@angular/material/snack-bar';
import { catchError, tap } from 'rxjs/operators';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {
  hide = true;
  users: any[] = [];
  roleUser: string = "USER";
  itemToSave: any = {};
  dateTime = new Date();
  dateTimeFormated: string = "";

  form: FormGroup;

  constructor(private formBuilder: FormBuilder, private registerService: RegisterService,
    private snackBar: MatSnackBar, private location: Location
  ) {
    this.form = this.formBuilder.group({
      login: [null],
      password: [null],
      role: [this.itemToSave.roleUser],
      name: [null],
      cnpj: [null],
      address: [null],
      num: [null],
      neighborhood: [null],
      cep: [null],
      city: [null],
      region: [null],
      dateTime: [this.itemToSave.dateTimeFormated],
    });
  }

  salvarItem(item: any): void {
    this.registerService.createItem(item)
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

  ngOnInit(): void {
    this.dateTimeFormated = format(this.dateTime, "dd/MM/yyyy HH:mm:ss");    

    this.getAllRegisters();

    const cnpj = '945.876.876-72'; 
    this.getItemByCnpj(cnpj);
  }

  getAllRegisters(){
    this.registerService.getAllItems().subscribe((data: any) => {
      this.users = data;       
      console.log("REGISTRADOS", data)
    });
  }

  getItemByCnpj(cnpj: string) {
    this.registerService.getItemByCnpj(cnpj)
      .subscribe((data: any) => {        
        console.log("Item por CNPJ:", data);
      });
  }

  onSubmit() {

    if (this.form.valid) {
      const formData = this.form.value;

      this.salvarItem(formData);
    }
  }

  onCancel() {
    this.location.back();
  }

  private onSuccess() {
    this.snackBar.open("Salvo com sucesso !", '', { duration: 3000 });
  }

  private onError() {
    this.snackBar.open("Erro ao salvar.", '', { duration: 5000 });
  }


}
