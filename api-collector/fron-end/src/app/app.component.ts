import { Component, OnInit } from '@angular/core';
import { AuthService } from './services/auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'Computer Systems';
  userLogin: string = '';

  showMenu: boolean = false;
  

  constructor(private authService: AuthService){
    this.userLogin = authService.getUserLogin();
  }

  ngOnInit(): void {
    this.authService.showMenuEmmitter.subscribe(
      show => this.showMenu = show
    );   
  }

}
