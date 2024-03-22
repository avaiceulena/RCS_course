import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-division',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './division.component.html',
  styleUrl: './division.component.css'
})
export class DivisionComponent {
  num1: number = 0;
  num2: number = 0;
  result: number = 0;
  selectedOperation: string = 'divide';

  performAddition(): void {
    switch (this.selectedOperation) {
      case 'add':
        this.result = this.num1 + this.num2;
        break;
      case 'subtract':
        this.result = this.num1 - this.num2;
        break;
      case 'multiply':
        this.result = this.num1 * this.num2;
        break;
      case 'divide':
        this.result = this.num1 / this.num2;
        break;
    }
  }
}
