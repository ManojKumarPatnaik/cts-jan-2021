import { Injectable } from '@angular/core';
import { employees } from './fake'
@Injectable({
  providedIn: 'root'
})
export class EmpService {

  constructor() { }

  fetchEmployees() : any {
    return employees;
  }
  
}
