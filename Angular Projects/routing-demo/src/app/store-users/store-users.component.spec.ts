import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StoreUsersComponent } from './store-users.component';

describe('StoreUsersComponent', () => {
  let component: StoreUsersComponent;
  let fixture: ComponentFixture<StoreUsersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StoreUsersComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StoreUsersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
