import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FunnyPictureComponent } from './funny-picture.component';

describe('FunnyPictureComponent', () => {
  let component: FunnyPictureComponent;
  let fixture: ComponentFixture<FunnyPictureComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FunnyPictureComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FunnyPictureComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
