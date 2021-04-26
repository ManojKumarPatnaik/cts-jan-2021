import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpDeleteComponent } from './emp-delete.component';

describe('EmpDeleteComponent', () => {
  let component: EmpDeleteComponent;
  let fixture: ComponentFixture<EmpDeleteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmpDeleteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EmpDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
