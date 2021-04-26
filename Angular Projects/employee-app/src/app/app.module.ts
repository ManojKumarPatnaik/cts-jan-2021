import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { HttpClientModule } from '@angular/common/http';
import { UserDetailsComponent } from './user-details/user-details.component';
import { EmployeeStoreComponent } from './employee-store/employee-store.component';
import { ReactiveFormsModule } from '@angular/forms';
import { EmpDeleteComponent } from './emp-delete/emp-delete.component';
@NgModule({
  declarations: [
    AppComponent,
    EmployeeDetailsComponent,
    UserDetailsComponent,
    EmployeeStoreComponent,
    EmpDeleteComponent
  ],
  imports: [
    BrowserModule, HttpClientModule, ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
