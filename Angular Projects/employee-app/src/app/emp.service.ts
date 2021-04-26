import { Injectable } from '@angular/core';
import { employees } from './fake';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class EmpService {

  constructor(private http : HttpClient) { }

  fetchEmployees() : any {
    return employees;
  }

  fetchUsers() : Observable<any> {
    let uri = "https://jsonplaceholder.typicode.com/users";
    return this.http.get(uri);
  }

}
