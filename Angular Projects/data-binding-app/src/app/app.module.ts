import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { EventDemoComponent } from './event-demo/event-demo.component';
import { PropertyBindingDemoComponent } from './property-binding-demo/property-binding-demo.component';

@NgModule({
  declarations: [
    AppComponent,
    EventDemoComponent,
    PropertyBindingDemoComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
