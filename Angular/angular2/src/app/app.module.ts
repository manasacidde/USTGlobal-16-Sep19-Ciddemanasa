import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';

import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DatabindingComponent } from './databinding/databinding.component';
import { PropertybindingComponent } from './databinding/propertybinding/propertybinding.component';

import { EventBindingComponent } from './databinding/event-binding/event-binding.component';
import { TwoWayComponent } from './databinding/two-way/two-way.component';
import { DirectiveComponent } from './directive/directive.component';
import { StructuralDirectiveComponent } from './directive/structural-directive/structural-directive.component';
import { NgIfComponent } from './directive/structural-directive/ng-if/ng-if.component';
import { NgForComponent } from './directive/structural-directive/ng-for/ng-for.component';
import { NgSwitchComponent } from './directive/structural-directive/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { FormaComponent } from './assignments/forma/forma.component';
import { FormbComponent } from './assignments/formb/formb.component';
import { FormcComponent } from './assignments/formc/formc.component';
import { FormdComponent } from './assignments/formd/formd.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';

import { NavbarComponent } from './navbar/navbar.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    LoginComponent,
    FooterComponent,
    DatabindingComponent,
    PropertybindingComponent,
    EventBindingComponent,
    TwoWayComponent,
    DirectiveComponent,
    StructuralDirectiveComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    CustomDirective,
    RegisterComponent,
    FormaComponent,
    FormbComponent,
    FormcComponent,
    FormdComponent,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    NavbarComponent
  
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: '', component: HomeComponent},
      {path: 'countries', component: AboutComponent},
      {path: 'help', component: HelpComponent},
      {path: 'property', component: PropertybindingComponent},
      {path: 'pro', component: EventBindingComponent},
      {path: 'binding', component: TwoWayComponent},
      {path: 'login', component: NgIfComponent},
      {path: 'ngfor', component: NgForComponent},
      {path: 'ngswitch', component : NgSwitchComponent},
      {path: 'register', component : RegisterComponent},
      {path: 'forma', component: FormaComponent},
      {path: 'formb', component: FormbComponent},
      {path:  'formc', component: FormcComponent},
      {path:  'formd', component: FormdComponent},
      {path:  'reactive', component: ReactiveFormComponent},
      {path:  'parent', component: ParentComponent},
      {path: 'comment-details', component: CommentDetailsComponent}


    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
