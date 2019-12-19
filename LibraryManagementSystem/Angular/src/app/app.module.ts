import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {ReactiveFormsModule} from '@angular/forms'
import {HttpClientModule} from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AddStudentComponent } from './add-student/add-student.component';
import { AddBookComponent } from './add-book/add-book.component';
import { DisplayBooksComponent } from './display-books/display-books.component';
import { DeleteStudentComponent } from './delete-student/delete-student.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SearchBookComponent } from './search-book/search-book.component';
import { RequestBookComponent } from './request-book/request-book.component';
import { ViewRequestComponent } from './view-request/view-request.component';
import { RegisterComponent } from './register/register.component';
import { AddComponent } from './add/add.component';
import { IssuebookComponent } from './issuebook/issuebook.component';
import { DeleteLibrarianComponent } from './delete-librarian/delete-librarian.component';





@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AddStudentComponent,
    AddBookComponent,
    DisplayBooksComponent,
    DeleteStudentComponent,
    HomeComponent,
    LoginComponent,
    SearchBookComponent,
    RequestBookComponent,
    ViewRequestComponent,
    RegisterComponent,
    AddComponent,
    IssuebookComponent,
    DeleteLibrarianComponent,
  
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
