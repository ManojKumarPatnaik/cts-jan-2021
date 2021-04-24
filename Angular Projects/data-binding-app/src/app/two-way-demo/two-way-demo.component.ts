import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-two-way-demo',
  templateUrl: './two-way-demo.component.html',
  styleUrls: ['./two-way-demo.component.css']
})
export class TwoWayDemoComponent {
  user : string = "test";
  pass : string = "test1234"
  handleSubmit(loginValues : any) : void {
    console.log(loginValues);
    this.user = "Raj"
  }
}
