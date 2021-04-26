import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {

  emps : undefined | any = undefined;
  constructor(private service : EmpService) { }

  ngOnInit(): void {
  }
  fetchData() : void {
    this.emps = this.service.fetchEmployees();
  }

}
