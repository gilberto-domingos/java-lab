import { Injectable } from '@angular/core';
import { Accessed } from '../models/accessed';

@Injectable({
  providedIn: 'root'
})
export class DataAccessedService {

  constructor() { }


  save(record: Accessed){
    console.log(record);
  }

}
