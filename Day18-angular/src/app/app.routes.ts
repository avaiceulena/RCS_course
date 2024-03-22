import { Routes } from '@angular/router';
import { MainComponent } from './main/main.component';
import { AboutMeComponent } from './about-me/about-me.component';
import { FunnyPictureComponent } from './funny-picture/funny-picture.component';


export const routes: Routes = [
    {path: 'main', component: MainComponent},
    {path: 'about-me', component: AboutMeComponent},
    {path: 'funny-picture', component: FunnyPictureComponent},
    {path: '', redirectTo: '/main', pathMatch: 'full' },
];
