import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AnimalListingComponent } from './animal-listing.component';

describe('AnimalListingComponent', () => {
  let component: AnimalListingComponent;
  let fixture: ComponentFixture<AnimalListingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AnimalListingComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AnimalListingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
