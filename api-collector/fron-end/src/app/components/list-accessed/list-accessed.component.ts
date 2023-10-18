import { Component, OnInit } from '@angular/core';
import { DataAccessedService } from 'src/app/services/data-accessed.service';


@Component({
  selector: 'app-list-accessed',
  templateUrl: './list-accessed.component.html',
  styleUrls: ['./list-accessed.component.scss']
})
export class ListAccessedComponent implements OnInit {
  
  items: any[] = [];
  
  constructor(private dataService: DataAccessedService){

  }
  
  ngOnInit(): void {
    this.dataService.getAllItems().subscribe((data: any) => {
      this.items = data;
      console.log("AQUI ESTÁ OS DADOS" + data)
    });
  }


 
}
