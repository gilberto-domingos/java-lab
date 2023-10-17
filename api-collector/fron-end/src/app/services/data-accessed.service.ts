import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Accessed } from '../models/accessed';
import { first, tap } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataAccessedService {

  private readonly API = 'api/accesseds'

  constructor(private httpClient: HttpClient) { }

  list(){
    return this.httpClient.get<Accessed[]>(this.API)
    .pipe(
      first(),
      tap(accesseds => console.log(accesseds))
    );
  }

  save(record: Accessed){
    return this.httpClient.post<Accessed>(this.API, record).pipe(first());
  }

}
