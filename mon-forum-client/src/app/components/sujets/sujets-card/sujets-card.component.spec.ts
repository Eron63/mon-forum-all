import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SujetsCardComponent } from './sujets-card.component';

describe('SujetsCardComponent', () => {
  let component: SujetsCardComponent;
  let fixture: ComponentFixture<SujetsCardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SujetsCardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SujetsCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
