import { Component, OnInit, Input } from '@angular/core';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {

  @Input() userLogin: string = '';
  
 
  constructor(private authService: AuthService){
    this.userLogin = this.authService.getUserLogin();
  }

ngOnInit(): void {
  this.userLogin;
}

}

