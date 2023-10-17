import { CommonService } from './../../services/common.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { format } from 'date-fns';

@Component({
  selector: 'app-accessed',
  templateUrl: './accessed.component.html',
  styleUrls: ['./accessed.component.scss']
})
export class AccessedComponent implements OnInit {
  form: FormGroup;
  location: any;
  locationJs: any;
  dateTime = new Date();
  dateTimeFormated: string = "";

  constructor(private CommonService: CommonService, private formBuilder: FormBuilder) {
    this.form = this.formBuilder.group({
      companyName: [null],
      cnpj: [null],
      address: [null],
      numberr: [null],
      cep: [null],
      city: [null],
      state: [null],
      login: [null],
      ip: [null],
      latitude: [null],
      longitude: [null],
      dateTime: [null]
    });

  }

  ngOnInit() {

    this.dateTimeFormated = format(this.dateTime, "dd/MM/yyyy HH:mm:ss")
   

    this.CommonService.getLocation().subscribe((response) => {
      console.log(response);
      this.location = response;
    }) 

    navigator.geolocation.getCurrentPosition((position) => {
      console.log(position);
      this.locationJs = position.coords;
    })

  }

  onSubmit() {

  }

  onCancel() {

  }

}
