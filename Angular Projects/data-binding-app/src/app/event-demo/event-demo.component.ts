import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-demo',
  templateUrl: './event-demo.component.html',
  styleUrls: ['./event-demo.component.css']
})
export class EventDemoComponent  {

  name : undefined | string = undefined;

  handleClick(x : any) : void {
    this.name = x;
  }
}
