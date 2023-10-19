import { Component, OnInit } from '@angular/core';
import { DataAccessedService } from 'src/app/services/data-accessed.service';
import { MatTableDataSource } from '@angular/material/table';
import { Accessed } from 'src/app/models/accessed';



@Component({
  selector: 'app-list-accessed',
  templateUrl: './list-accessed.component.html',
  styleUrls: ['./list-accessed.component.scss']
})
export class ListAccessedComponent implements OnInit {

  accesseds: any[] = [];

  displayedColumns: string[] = ['id', 'login', 'company_name', 'cnpj', 'city', 'region',
    'country_name', 'ip', 'latitude', 'longitude', 'dateTime', 'network', 'version', 'org'];
  dataSource = new MatTableDataSource<Accessed>([]);

  

  constructor(private dataService: DataAccessedService) { }

  ngOnInit(): void {
    this.dataService.getAllItems().subscribe((data: any) => {
      this.accesseds = data;
      console.log('Itens recuperados do serviço:', this.accesseds);
    });

  }

}





