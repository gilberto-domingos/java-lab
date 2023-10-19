import { Component } from '@angular/core';
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
export class RegisterComponent {

  form: FormGroup;

constructor(private formBuilder: FormBuilder, private registerService: RegisterService,
  private snackBar: MatSnackBar, private location: Location
  ){
  this.form = this.formBuilder.group({
    login: [null],
    company_name: [null],
    cnpj: [null],
    city: [null],
    region: [null],
    country_name: [null],
    ip: [null],
    latitude: [null],
    longitude: [null],
    dateTime: [null],
    network: [null],
    version: [null],
    org: [null]
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
  this.snackBar.open("Salvo com sucesso !",'', { duration: 3000 });
}

private onError(){
  this.snackBar.open("Erro ao salvar.",'', {duration: 5000 });
}


}
