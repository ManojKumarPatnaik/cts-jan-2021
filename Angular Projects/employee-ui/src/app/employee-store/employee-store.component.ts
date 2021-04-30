import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-store',
  templateUrl: './employee-store.component.html',
  styleUrls: ['./employee-store.component.css']
})
export class EmployeeStoreComponent implements OnInit {

  constructor(
    private form : FormBuilder, 
    private service : EmployeeService
    ) { }
  employee : any | undefined = undefined;
  employeeForm = this.form.group({
    name : [], salary : []
  });
  ngOnInit(): void {
  }
  handleSubmit() : void{
    this.service.storeEmployee(this.employeeForm.value)
    .subscribe(success => this.employee = success);
  }
}
