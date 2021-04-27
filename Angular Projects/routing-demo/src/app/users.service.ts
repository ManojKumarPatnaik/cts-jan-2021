import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class UsersService {
  baseUri : string = 'http://localhost:3000/users';
  
  constructor(private httpClient : HttpClient) { }

  storeUsers(userForm : any) : Observable<any> {
    return this.httpClient.post(this.baseUri, userForm);
  }

  login(id : number) : Observable<any> {
    return this.httpClient.get(`${this.baseUri}/${id}`);
  }

  fetchUsers() : Observable<any> {
    return this.httpClient.get(this.baseUri);
  }

}
