import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tdf-demo',
  templateUrl: './tdf-demo.component.html',
  styleUrls: ['./tdf-demo.component.css']
})
export class TdfDemoComponent {

  handleSubmit(values : any) : void {
    console.log(values);
  }
}
