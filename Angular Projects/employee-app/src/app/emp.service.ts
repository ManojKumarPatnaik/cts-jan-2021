import { Injectable } from '@angular/core';
import { employees } from './fake';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class EmpService {
  baseUri = "http://localhost:3000/employees";
  constructor(private http : HttpClient) { }

  fetchEmployees() : Observable<any> {
    
    //return employees;
    return this.http.get(this.baseUri);

  }
  storeEmployee(employee : any) : Observable<any> { 
    return this.http.post(this.baseUri, employee);
  }

  deleteEmployee(empId : number) : Observable<any> {
    let uri = `${this.baseUri}/${empId}`; // employees/100
    return this.http.delete(uri);
  }

  fetchUsers() : Observable<any> {
    let uri = "https://jsonplaceholder.typicode.com/users";
    return this.http.get(uri);
  }

}
