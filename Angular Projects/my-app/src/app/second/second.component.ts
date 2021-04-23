import { Component } from '@angular/core';

@Component({
    selector : 'second-app',
    template : `<div>{{message}}</div>`
})
export class SecondComponent {
    message = "A second component message";
}