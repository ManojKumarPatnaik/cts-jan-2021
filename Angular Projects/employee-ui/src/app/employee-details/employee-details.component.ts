import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {
  employee : undefined | any = undefined;
  message : undefined | string = undefined;
  constructor(private service : EmployeeService) { }

  ngOnInit(): void {
  }

  searchEmployee(id : number): void {
    this.service.getEmployee(id)
    .subscribe((success) => {
      this.employee = success;
      this.message = undefined;
    }, (err) => {
      this.message = err.error.msg;
      this.employee = undefined;
    });
  }


}
