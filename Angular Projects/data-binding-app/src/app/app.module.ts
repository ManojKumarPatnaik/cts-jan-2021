import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { EventDemoComponent } from './event-demo/event-demo.component';
import { PropertyBindingDemoComponent } from './property-binding-demo/property-binding-demo.component';
import { TwoWayDemoComponent } from './two-way-demo/two-way-demo.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { TdfDemoComponent } from './tdf-demo/tdf-demo.component';
import { MdfDemoComponent } from './mdf-demo/mdf-demo.component';
@NgModule({
  declarations: [
    AppComponent,
    EventDemoComponent,
    PropertyBindingDemoComponent,
    TwoWayDemoComponent,
    TdfDemoComponent,
    MdfDemoComponent
  ],
  imports: [
    BrowserModule, FormsModule, ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
