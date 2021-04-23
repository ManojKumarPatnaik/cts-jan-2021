import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { ThirdComponent } from './third/third.component';
import { PipeDemoComponent } from './pipe-demo/pipe-demo.component';
import { DirectiveDemoComponent } from './directive-demo/directive-demo.component'
@NgModule({
  declarations: [
    AppComponent, FirstComponent, SecondComponent, ThirdComponent, PipeDemoComponent, DirectiveDemoComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
