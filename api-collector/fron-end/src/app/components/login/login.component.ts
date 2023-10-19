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
export class LoginComponent {

  public user: User = new User();
  itemToSave: any = {};
  form: FormGroup;

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
