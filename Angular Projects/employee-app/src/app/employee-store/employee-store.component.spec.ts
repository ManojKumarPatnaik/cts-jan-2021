import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeStoreComponent } from './employee-store.component';

describe('EmployeeStoreComponent', () => {
  let component: EmployeeStoreComponent;
  let fixture: ComponentFixture<EmployeeStoreComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmployeeStoreComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeStoreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
