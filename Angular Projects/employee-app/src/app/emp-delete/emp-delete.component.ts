import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-emp-delete',
  templateUrl: './emp-delete.component.html',
  styleUrls: ['./emp-delete.component.css']
})
export class EmpDeleteComponent implements OnInit {
  message : undefined | string = undefined;
  constructor(private service : EmpService) { }

  ngOnInit(): void {
  }
  remove(id : number) : void {
    this.service.deleteEmployee(id)
    .subscribe(
      s => this.message = `${id} deleted successfully`, 
      err => this.message = `Sorry ${id} not found`
      );

  }
}
