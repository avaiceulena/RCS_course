import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-greeting',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './greeting.component.html',
  styleUrls: ['./greeting.component.css']
})

  export class GreetingComponent implements OnInit {

    userName: string = "";
    greeting: string = '';
  
    sayHello() {
      this.greeting = `Hello, ${this.userName}!`;
    }

    constructor() {}
  
    ngOnInit(): void {
        
    }
  
    demoOut(): void{
      console.log(this.userName);
    }
  
}
