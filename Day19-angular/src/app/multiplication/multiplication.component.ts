import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-multiplication',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './multiplication.component.html',
  styleUrl: './multiplication.component.css'
})
export class MultiplicationComponent {
  num1: number = 0;
  num2: number = 0;
  result: number = 0;
  selectedOperation: string = 'multiply';

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
