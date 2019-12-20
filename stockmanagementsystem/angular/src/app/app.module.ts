import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { SearchnameComponent } from './searchname/searchname.component';
import { SearchcompanyComponent } from './searchcompany/searchcompany.component';
import { SearchcategoryComponent } from './searchcategory/searchcategory.component';
import { DisplayAllComponent } from './display-all/display-all.component';
import { UpdateComponent } from './update/update.component';
import { HomeComponent } from './home/home.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AddproductComponent,
    SearchnameComponent,
    SearchcompanyComponent,
    SearchcategoryComponent,
    DisplayAllComponent,
    UpdateComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule,
    HttpClientModule
      
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
