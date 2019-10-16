import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';

import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { MoviesComponent } from './movies/movies.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ReactiveFormComponent,
    LoginComponent,
    MoviesComponent  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path:'login', component:LoginComponent},
      {path:'addmovie', component:ReactiveFormComponent} ,
       {path: 'movies', component:MoviesComponent} 
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
