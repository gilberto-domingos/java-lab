import { CommonService } from './../../services/common.service';
import { Component, OnInit } from '@angular/core';
import { format } from 'date-fns';

@Component({
  selector: 'app-accessed',
  templateUrl: './accessed.component.html',
  styleUrls: ['./accessed.component.scss']
})
export class AccessedComponent implements OnInit{
  location:any;
  locationJs:any;
  dateTime = new Date();
  dateTimeFormated: string = '';

  constructor(private CommonService:CommonService){

  }

  ngOnInit(){

    this.dateTimeFormated = format(this.dateTime, "dd/MM/yyyy HH:mm:ss")
    console.log('Data e hora atual:' + this.dateTimeFormated)

    this.CommonService.getLocation().subscribe((response)=>{
      console.log(response);
      this.location = response;
    })


    navigator.geolocation.getCurrentPosition((position)=>{
      console.log(position);
      this.locationJs = position.coords;
    })

  }

}
