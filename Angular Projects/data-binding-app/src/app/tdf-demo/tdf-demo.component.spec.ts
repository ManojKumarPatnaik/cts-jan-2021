import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TdfDemoComponent } from './tdf-demo.component';

describe('TdfDemoComponent', () => {
  let component: TdfDemoComponent;
  let fixture: ComponentFixture<TdfDemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TdfDemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TdfDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
