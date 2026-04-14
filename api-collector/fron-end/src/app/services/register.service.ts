import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  private baseUrl = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  createItem(item: any) {
    return this.http.post(`${this.baseUrl}/auth/register`, item);
  }

  getAllItems() {
    return this.http.get(`${this.baseUrl}/api/users`);
  }

  getItemById(id: number) {
    return this.http.get(`${this.baseUrl}/api/users${id}`);
  }  

  updateItem(id: number, item: any) {
    return this.http.put(`${this.baseUrl}/api/users${id}`, item);
  }

  deleteItem(id: number) {
    return this.http.delete(`${this.baseUrl}/api/users${id}`);
  }  

  getItemByCnpj(cnpj: string) {
    return this.http.get(`${this.baseUrl}/api/users?cnpj=${cnpj}`); 
  }
  

}
