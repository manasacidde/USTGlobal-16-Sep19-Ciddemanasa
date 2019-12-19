import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddBookComponent } from './add-book/add-book.component';
import { DisplayBooksComponent } from './display-books/display-books.component';
import { DeleteStudentComponent } from './delete-student/delete-student.component';
import { HomeComponent } from './home/home.component';

import { RequestBookComponent } from './request-book/request-book.component';
import { ViewRequestComponent } from './view-request/view-request.component';
import { SearchBookComponent } from './search-book/search-book.component';
import { RegisterComponent } from './register/register.component';
import { AddComponent } from './add/add.component';
import { IssuebookComponent } from './issuebook/issuebook.component';
import { DeleteLibrarianComponent } from './delete-librarian/delete-librarian.component';
import { LoginComponent } from './login/login.component';





const routes: Routes = [
  
  {path: 'add-book', component: AddBookComponent},
  {path: 'display-book', component: DisplayBooksComponent},
  {path: 'delete-student', component: DeleteStudentComponent},
  {path: '', component:HomeComponent},
  {path: 'login', component:LoginComponent},
  {path: 'request', component:RequestBookComponent},
  {path: 'view-request', component:ViewRequestComponent},
  {path: 'search-book', component:SearchBookComponent},
  {path: 'register', component:RegisterComponent},
  {path: 'add-student', component:AddComponent},
  {path:'issue',component:IssuebookComponent},
  {path:'deletelibrarian',component:DeleteLibrarianComponent}



  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
