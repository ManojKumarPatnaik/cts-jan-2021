import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent  {
  productsList : string[] = ["Laptops", "Mobiles", "Notepads"];
  
  parentCounter : number = 0;

  takeAllClicks(input : number) {
    this.parentCounter = this.parentCounter + input;
  }
}
