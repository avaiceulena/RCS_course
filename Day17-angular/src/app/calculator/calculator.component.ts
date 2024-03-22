import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-calculator',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css'],
})
export class CalculatorComponent implements OnInit {
  number1: number | null = null;
  number2: number | null = null;
  sum: number | null = null;

  calculateSum() {
    if (this.number1 !== null && this.number2 !== null) {
      this.sum = parseInt(this.number1.toString()) + parseInt(this.number2.toString());
    } else {
      this.sum = null;
    }
  }

  constructor() {}
  
  ngOnInit(): void {
      
  }

  demoOut(): void{
    console.log(this.sum);
  }
}
