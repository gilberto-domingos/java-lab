import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { DataAccessedService } from 'src/app/services/data-accessed.service';
import { AuthService } from 'src/app/services/auth.service';
import { MatTableDataSource } from '@angular/material/table';
import { Accessed } from 'src/app/models/accessed';



@Component({
  selector: 'app-list-accessed',
  templateUrl: './list-accessed.component.html',
  styleUrls: ['./list-accessed.component.scss']
})
export class ListAccessedComponent implements OnInit {  
  
  accesseds: any[] = [];
  userLogin: string = '';


  displayedColumns: string[] = ['id', 'company_name', 'cnpj', 'ip', 'latitude', 'longitude', 'dateTime',
  'city', 'region', 'country_name', 'login', 'network', 'version', 'org'];
  dataSource = new MatTableDataSource<Accessed>([]);

  

  constructor(private dataService: DataAccessedService, private authService: AuthService,
    private router: Router) {
    this.userLogin = authService.getUserLogin();
   }

  ngOnInit(): void {

    this.authService.showMenuEmmitter.emit(true);

    this.userLogin = this.authService.getUserLogin();   

    this.dataService.getAllItems().subscribe((data: any) => {
      this.accesseds = data;     
    });

  }

  logout(){
    this.router.navigate(["/"])
  }  

}





