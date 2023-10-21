import { EventEmitter, Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../models/user';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private baseUrl = 'http://localhost:8080';

  private userAuthenticaded: boolean = false;
  private getUser: string = '';
  public showMenuEmmitter = new EventEmitter<boolean>();

  constructor(private router: Router,private http: HttpClient) { }

  onSubmit(user: User) {

    if (user.login === 'domingoshot@hotmail.com') {

      this.userAuthenticaded = true;

      this.showMenuEmmitter.emit(true);

      this.getUser = user.login;

      this.router.navigate(['/accessed'])

    } else {
      this.userAuthenticaded = false;

      this.showMenuEmmitter.emit(false);
    }
  }

  getUserLogin(): string {
    return this.getUser;
  }

  getItemByLogin(login: string) {
    return this.http.get(`${this.baseUrl}/api/users?email=${login}`); 
  }

}