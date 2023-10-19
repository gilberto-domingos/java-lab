import { Accessed } from './../../models/accessed';
import { DataAccessedService } from './../../services/data-accessed.service';
import { CommonService } from './../../services/common.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Location } from '@angular/common';
import { format } from 'date-fns';
import { MatSnackBar } from '@angular/material/snack-bar';
import { catchError, tap } from 'rxjs/operators';

@Component({
  selector: 'app-accessed',
  templateUrl: './accessed.component.html',
  styleUrls: ['./accessed.component.scss']
})
export class AccessedComponent implements OnInit {

  itemToSave: any = {}; 
  form: FormGroup;
  location: any;
  locationJs: any = { latitude: null, city: null, region: null, country_name: null, longitude: null, ip: null };
  dateTime = new Date();
  dateTimeFormated: string = "";

  constructor(private commonService: CommonService,
    private formBuilder: FormBuilder,
    private dataAccessedService: DataAccessedService,
    private snackBar: MatSnackBar,
    private locationll: Location) {

    this.form = this.formBuilder.group({
      login: [null],
      company_name: [null],
      cnpj: [null],
      city: [null],
      region: [null],
      country_name: [null],
      ip: [null],
      latitude: [null],
      longitude: [null],
      dateTime: [this.itemToSave.dateTimeFormated],
      network: [null],
      version: [null],
      org: [null]
    });

  }

  ngOnInit() {

    this.dateTimeFormated = format(this.dateTime, "dd/MM/yyyy HH:mm:ss")

    this.commonService.getLocation().subscribe((response) => {
      console.log(response);
      this.location = response;

      const cityControl = this.form?.get('city');
      const regionControl = this.form?.get('region');
      const country_nameControl = this.form?.get('country_name');
      const ipControl = this.form?.get('ip');
      const networkControl = this.form?.get('network');
      const versionControl = this.form?.get('version');
      const orgControl = this.form?.get('org');

      if (cityControl) {
        cityControl.setValue(this.location.city);
      }

      if (regionControl) {
        regionControl.setValue(this.location.region);
      }

      if (country_nameControl) {
        country_nameControl.setValue(this.location.country_name);
      }


      if (ipControl) {
        ipControl.setValue(this.location.ip);
      }

      if (networkControl) {
        networkControl.setValue(this.location.network);
      }

      if (versionControl) {
        versionControl.setValue(this.location.version);
      }

      if (orgControl) {
        orgControl.setValue(this.location.org);
      }

    })

    navigator.geolocation.getCurrentPosition((position) => {
      console.log(position);
      if (position && position.coords) {
        this.locationJs = position.coords;

        const latitudeControl = this.form?.get('latitude');
        const longitudeControl = this.form?.get('longitude');

        if (latitudeControl) {
          latitudeControl.setValue(this.locationJs.latitude);
        }

        if (longitudeControl) {
          longitudeControl.setValue(this.locationJs.longitude);
        }

      }
    });
  }


  salvarItem(item: any): void {
    this.dataAccessedService.createItem(item)
      .pipe(
        tap((data: any) => {
          this.onSuccess();
        }),
        catchError((error: any) => {
          this.onError();
          throw error;
        })
      )
      .subscribe();
  }


  onSubmit() {
    if (this.form.valid) {
      const formData = this.form.value; 

      this.salvarItem(formData);
    }
  }

  onCancel() {
    this.locationll.back();
  }

  private onSuccess() {
    this.snackBar.open("Salvo com sucesso !",'', { duration: 3000 });
  }

  private onError(){
    this.snackBar.open("Erro ao salvar.",'', {duration: 5000 });
  }

}