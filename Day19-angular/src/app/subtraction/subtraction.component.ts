import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-subtraction',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './subtraction.component.html',
  styleUrl: './subtraction.component.css'
})
export class SubtractionComponent {
  num1: number = 0;
  num2: number = 0;
  result: number = 0;
  selectedOperation: string = 'subtract';

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
