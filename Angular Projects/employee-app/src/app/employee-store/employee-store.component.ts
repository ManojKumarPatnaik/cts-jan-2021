import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-employee-store',
  templateUrl: './employee-store.component.html',
  styleUrls: ['./employee-store.component.css']
})
export class EmployeeStoreComponent implements OnInit {

  constructor(private form : FormBuilder, private service : EmpService) { }

  employeeForm = this.form.group({
    id : [], name : [], dob : []
  }); 
  message : undefined | any = undefined;
  ngOnInit(): void {
  }

  handleSubmit() {
    this.service.storeEmployee(this.employeeForm.value)
    .subscribe((success) => {
      this.message = success; 
      this.employeeForm.reset();
    });
  }

}
