import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-animal-listing',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './animal-listing.component.html',
  styleUrl: './animal-listing.component.css'
})
export class AnimalListingComponent{

  animals: Animal[] = [
    {
      number: 1,
      name: 'Buddy',
      age: 2,
      species: 'Dog',
      pictureLink: 'https://images.pexels.com/photos/1851164/pexels-photo-1851164.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1'
    },
    {
      number: 2,
      name: 'Whiskers',
      age: 1,
      species: 'Cat',
      pictureLink: 'https://images.pexels.com/photos/1741205/pexels-photo-1741205.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1'
    },
    {
      number: 3,
      name: 'Charlie',
      age: 3,
      species: 'Dog',
      pictureLink: 'https://images.pexels.com/photos/2253275/pexels-photo-2253275.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1'
    },
    {
      number: 4,
      name: 'Mittens',
      age: 2,
      species: 'Cat',
      pictureLink: 'https://images.pexels.com/photos/96938/pexels-photo-96938.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1'
    },
    {
      number: 5,
      name: 'Max',
      age: 4,
      species: 'Parrot',
      pictureLink: 'https://images.pexels.com/photos/2317904/pexels-photo-2317904.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1'
    },
    {
      number: 6,
      name: 'Luna',
      age: 1,
      species: 'Rabbit',
      pictureLink: 'https://images.pexels.com/photos/4001296/pexels-photo-4001296.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1'
    },
    {
      number: 7,
      name: 'Rocky',
      age: 2,
      species: 'Hamster',
      pictureLink: 'https://images.pexels.com/photos/15373308/pexels-photo-15373308/free-photo-of-cute-hamster-feeding-in-a-mug.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1'
    }
  ];

  sequenceNumber: number = 0;
  newAnimalName: string = '';
  errorMessage: boolean = false;
  

  updateAnimalName(){
    if(this.sequenceNumber > 0 && this.sequenceNumber < this.animals.length){
      this.animals[this.sequenceNumber - 1].name = this.newAnimalName;
      this.errorMessage = false;
    } else {
      this.errorMessage = true;
    }
  }
}

export interface Animal {
  number: number;
  name: string;
  age: number;
  species: string;
  pictureLink: string;
}