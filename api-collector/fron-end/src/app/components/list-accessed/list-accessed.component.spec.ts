import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListAccessedComponent } from './list-accessed.component';

describe('ListAccessedComponent', () => {
  let component: ListAccessedComponent;
  let fixture: ComponentFixture<ListAccessedComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListAccessedComponent]
    });
    fixture = TestBed.createComponent(ListAccessedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
