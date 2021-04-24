import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
@Component({
  selector: 'app-mdf-demo',
  templateUrl: './mdf-demo.component.html',
  styleUrls: ['./mdf-demo.component.css']
})
export class MdfDemoComponent   {

  constructor(private form : FormBuilder) { }

  user = this.form.group({
    firstname : ['', Validators.required],
    lastname : ['', Validators.required]
  });

  handleSubmit() {
    console.log(this.user.value);
    //this.user.reset();
    this.user.setValue({firstname :"", lastname: "Hello"})
  }
}
