import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directive-demo',
  templateUrl: './directive-demo.component.html',
  styleUrls: ['./directive-demo.component.css']
})
export class DirectiveDemoComponent {
  names : string[] = ["Alex", "Bruce", "Charles"];
  users : any = [
    {"name":"Alex", "age":35}, 
    {"name":"Bruce", "age":45}, 
    {"name":"Charles", "age":22}
  ];
  x : boolean = true;
  y : boolean = false;
  z : undefined = undefined;
  z1 : string | undefined = "Hi";
}
