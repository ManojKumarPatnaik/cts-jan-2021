import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TwoWayDemoComponent } from './two-way-demo.component';

describe('TwoWayDemoComponent', () => {
  let component: TwoWayDemoComponent;
  let fixture: ComponentFixture<TwoWayDemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TwoWayDemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TwoWayDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
