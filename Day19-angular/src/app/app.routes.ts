import { Routes } from '@angular/router';
import { AdditionComponent } from './addition/addition.component';
import { SubtractionComponent } from './subtraction/subtraction.component';
import { MultiplicationComponent } from './multiplication/multiplication.component';
import { DivisionComponent } from './division/division.component';

export const routes: Routes = [
    { path: '', redirectTo: '/addition', pathMatch: 'full' },
    { path: 'addition', component: AdditionComponent },
    { path: 'subtraction', component: SubtractionComponent },
    { path: 'multiplication', component: MultiplicationComponent },
    { path: 'division', component: DivisionComponent },
];
