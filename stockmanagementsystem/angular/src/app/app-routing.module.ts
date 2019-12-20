import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddproductComponent } from './addproduct/addproduct.component';
import { SearchnameComponent } from './searchname/searchname.component';
import { SearchcompanyComponent } from './searchcompany/searchcompany.component';
import { SearchcategoryComponent } from './searchcategory/searchcategory.component';
import { DisplayAllComponent } from './display-all/display-all.component';
import { UpdateComponent } from './update/update.component';
import { HomeComponent } from './home/home.component';


const routes: Routes = [
  {path:'addproduct',component:AddproductComponent},
  {path:'name',component:SearchnameComponent},
  {path:'company',component:SearchcompanyComponent},
  {path:'category',component:SearchcategoryComponent},
  {path:'displayall',component:DisplayAllComponent},
  {path:'update',component:UpdateComponent},
  {path:'',component:HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
