import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  baseUri : string = "http://54.209.23.89:8081/api";

  constructor(private httpClient : HttpClient) { }

  storeEmployee(formValues : any) : Observable<any> {
    let storeUri = `${this.baseUri}/employees`;
    return this.httpClient.post(storeUri, formValues);
  }

  getEmployee(id : number | string) : Observable<any> {
    let findUri = `${this.baseUri}/employees/${id}`;
    return this.httpClient.get(findUri);
  }
}
