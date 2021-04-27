import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { UsersService } from '../users.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(
    private form : FormBuilder, 
    private service: UsersService,
    private router : Router
    ) { }
  loginForm = this.form.group({
    id : [], password : []
  });
  ngOnInit(): void {
    sessionStorage.clear();
  }
  authenticate() : void {
    let id = this.loginForm.value.id;
    if(this.loginForm.value.password == 'Admin') {
      this.service.fetch(id).subscribe(
        success => {
          sessionStorage.setItem('userKey', id);
          this.router.navigate(["/success", id]);
        }, err => {
          alert('Invalid Credentials');
          this.loginForm.reset();
          this.router.navigate(["/login"]);
        }
      );
    } else {
      alert('Invalid Credentials');
      this.loginForm.reset();
      this.router.navigate(["/login"]);
    }
    
  }

}
