import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AccessedsRoutingModule } from './accesseds-routing.module';
import { DataAccessedService } from 'src/app/services/data-accessed.service';





@NgModule({
  declarations: [

  ],
  imports: [
    CommonModule,
    AccessedsRoutingModule,

  ],
  providers: [
    DataAccessedService
  ]
})
export class AccessedsModule { }
