import { EventEmitter, Injectable } from '@angular/core';
import { User } from '../models/user';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private userAuthenticaded: boolean = false;
  private getUser: string = '';
  public showMenuEmmitter = new EventEmitter<boolean>();

  constructor(private router: Router) { }

  onSubmit(user: User) {

    if (user.login === 'Francisco Clenilson' && user.password === '222222') {

      this.userAuthenticaded = true;

      this.showMenuEmmitter.emit(true);

      this.getUser = user.login;

      this.router.navigate(['/list-accessed'])

    } else {
      this.userAuthenticaded = false;

      this.showMenuEmmitter.emit(false);
    }
  }

  getUserLogin(): string {
    return this.getUser;
  }

}