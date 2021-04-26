import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {

  users : any | undefined = undefined;

  constructor(private service : EmpService) { }

  ngOnInit(): void {
  }

  fetchUsersData() : void {
    this.service.fetchUsers().subscribe((s) => this.users = s);
  }

}
