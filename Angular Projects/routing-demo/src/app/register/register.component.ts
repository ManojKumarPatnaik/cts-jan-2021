import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { UsersService } from '../users.service';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(
    private form: FormBuilder, 
    private service : UsersService,
    private router : Router
    ) { }
  userForm = this.form.group({
    id : [], name : [], dob : [], phone : []
  });

  ngOnInit(): void {
  }

  store() : void{
    this.service.storeUsers(this.userForm.value)
    .subscribe((success) => {
      this.router.navigate(["/login"])
    });
  } 

}
