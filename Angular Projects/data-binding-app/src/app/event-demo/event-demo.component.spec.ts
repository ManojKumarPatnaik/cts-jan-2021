import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EventDemoComponent } from './event-demo.component';

describe('EventDemoComponent', () => {
  let component: EventDemoComponent;
  let fixture: ComponentFixture<EventDemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EventDemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EventDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
