import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MdfDemoComponent } from './mdf-demo.component';

describe('MdfDemoComponent', () => {
  let component: MdfDemoComponent;
  let fixture: ComponentFixture<MdfDemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MdfDemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MdfDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
