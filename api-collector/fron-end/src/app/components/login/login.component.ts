import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/services/auth.service';
import { DataAccessedService } from 'src/app/services/data-accessed.service';
import { User } from 'src/app/models/user';
import { FormBuilder, FormGroup } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { catchError, tap } from 'rxjs/operators';
import { Router } from '@angular/router';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  hide = true;
  public user: User = new User();
  itemToSave: any = {};
  form: FormGroup;
  email: string = '';
  data: any;

  constructor(
    private formBuilder: FormBuilder,
    private authService: AuthService,
    private dataAccessedService: DataAccessedService,
    private router: Router,
    private snackBar: MatSnackBar,
  ) {

    this.form = this.formBuilder.group({
      username: [null],
      password: [null]
    });

  }

  ngOnInit() {
    this.authService.showMenuEmmitter.emit(false);

    const login = 'domingoshot@hotmail.com';
    this.getItemByLogin(login);
  }



  /*  getItemByLogin(login: string) {
      this.authService.getItemByLogin(login)
        .subscribe((data: any) => {
          if (data.length > 0) { 
            const email = data[0].login;
            console.log("Email:", email);
          } else {
            console.log("Nenhum dado encontrado.");
          }
        });
    } */

  getItemByLogin(login: string) {
    this.authService.getItemByLogin(login)
      .subscribe((data: any) => {
        if (data.length > 0) {
          const email = data[0].login;
          console.log("Email:", email);
          console.log("Todos os dados", data)
        } else {
          console.log("Nenhum dado encontrado.");
        }


      });


  }


  onSubmit() {
    this.authService.onSubmit(this.user);
  }

  onCancel() {

  }

  private onSuccess() {
    this.snackBar.open("Salvo com sucesso !", '', { duration: 3000 });
  }

  private onError() {
    this.snackBar.open("Erro ao salvar.", '', { duration: 5000 });
  }

  register() {
    this.router.navigate(['/register'])
  }

}
