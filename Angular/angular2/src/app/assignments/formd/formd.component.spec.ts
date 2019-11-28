import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FormdComponent } from './formd.component';

describe('FormdComponent', () => {
  let component: FormdComponent;
  let fixture: ComponentFixture<FormdComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FormdComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FormdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
