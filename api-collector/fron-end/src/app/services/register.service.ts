import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  private baseUrl = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  createItem(item: any) {
    return this.http.post(`${this.baseUrl}/api`, item);
  }
}
