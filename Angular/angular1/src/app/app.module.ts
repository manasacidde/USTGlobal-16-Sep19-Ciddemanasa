import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { TechComponent } from './tech/tech.component';
import { HomeComponent } from './home/home.component';
import { ParentcarComponent } from './parentcar/parentcar.component';
import { ChildcarComponent } from './childcar/childcar.component';
import { ParentbikeComponent } from './parentbike/parentbike.component';
import { ParentmovieComponent } from './parentmovie/parentmovie.component';
import { ChildbikeComponent } from './childbike/childbike.component';
import { ChildmovieComponent } from './childmovie/childmovie.component';
import { ParentlaptopComponent } from './parentlaptop/parentlaptop.component';
import { ChildlaptopComponent } from './childlaptop/childlaptop.component';
import { ParentmobileComponent } from './parentmobile/parentmobile.component';
import { ChildmobileComponent } from './childmobile/childmobile.component';
import { NavbarComponent } from './navbar/navbar.component';
import { CountriesComponent } from './countries/countries.component';
import { AboutComponent } from './about/about.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    TechComponent,
    HomeComponent,
    ParentcarComponent,
    ChildcarComponent,
    ParentbikeComponent,
    ParentmovieComponent,
    ChildbikeComponent,
    ChildmovieComponent,
    ParentlaptopComponent,
    ChildlaptopComponent,
    ParentmobileComponent,
    ChildmobileComponent,
    NavbarComponent,
    CountriesComponent,
    AboutComponent
  
  
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path : 'tech', component : TechComponent},
      {path : 'home', component : HomeComponent},
      {path : 'car', component : ParentcarComponent},
      {path : 'bike', component : ParentbikeComponent},
      {path : 'movie', component : ParentmovieComponent},
      {path : 'laptop', component : ParentlaptopComponent},
      {path : 'mobile', component : ParentmobileComponent},
      {path : 'about', component : AboutComponent}
    ])
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
