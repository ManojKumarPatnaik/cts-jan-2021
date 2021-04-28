import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-product-item',
  templateUrl: './product-item.component.html',
  styleUrls: ['./product-item.component.css']
})
export class ProductItemComponent {

  // <app-product-item [product] = "value"></app-product-item>
  @Input()
  product : string | undefined = undefined;
  // <app-product-item (eventEmitter) = "parentProps = $event">
  @Output()
  eventEmitter : EventEmitter<number> = new EventEmitter<number>();

  handleClick() {
    this.eventEmitter.emit(1);
  }
}
