import { DataAccessedService } from './../../services/data-accessed.service';
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
  locationJs: any = { latitude: null, city: null, region: null, country_name: null, longitude: null, ip: null };
  dateTime = new Date();
  dateTimeFormated: string = "";

  constructor(private CommonService: CommonService, private formBuilder: FormBuilder,
    service: DataAccessedService) {

    this.form = this.formBuilder.group({
      companyName: [null],
      cnpj: [null],
      address: [null],
      numberr: [null],
      cep: [null],
      city: [null],
      state: [null],
      country_name: [null],
      login: [null],
      ip: [null],
      latitude: [null],
      longitude: [null],
      dateTime: [null]
    });

  }
  //country_name
  ngOnInit() {

    this.dateTimeFormated = format(this.dateTime, "dd/MM/yyyy HH:mm:ss")


    this.CommonService.getLocation().subscribe((response) => {
      console.log(response);
      this.location = response;
    })

    navigator.geolocation.getCurrentPosition((position) => {
      console.log(position);
      if (position && position.coords) {
        this.locationJs = position.coords;


        const cityControl = this.form?.get('city');
        const regionControl = this.form?.get('region');        
        const country_nameControl = this.form?.get('country_name');
        const latitudeControl = this.form?.get('latitude');   
        const longitudeControl = this.form?.get('longitude');   
        const ipControl = this.form?.get('ip');   

        if (cityControl) {
          cityControl.setValue(this.location.city);
        }

        if (regionControl) {
          regionControl.setValue(this.location.region);
        }

        if (country_nameControl) {
          country_nameControl.setValue(this.location.country_name);
        }

        if (latitudeControl) {
          latitudeControl.setValue(this.locationJs.latitude);
        }

        if (longitudeControl) {
          longitudeControl.setValue(this.locationJs.longitude);
        }

        if (ipControl) {
          ipControl.setValue(this.location.ip);
        }
        
      }
    });




  }

  onSubmit() {
    console.log('enviado', this.form.value);

  }

  onCancel() {

  }

}
