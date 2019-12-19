import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
import { LoginResponse } from 'loginresponse';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
type: any;
  constructor(private http: HttpClient, private router: Router,private service: AuthService) { }

  ngOnInit() {
  }
  login(form: NgForm) {
    this.http.post<LoginResponse>(
      `${this.service.baseURL}/library/login/${form.value.id}/${form.value.password}`,
      form.value, {headers: this.service.header}
    ).subscribe(response => {
        // console.log('response', response.type);
        // this.type = response.type;
        // console.log( this.type);
        if (response != null && response.type === 'librarian') {
           window.confirm(' Login success Welcome  ' + response.name);
           this.router.navigate(['/']);
           this.service.isLLoggedIn = true;
        } else if (response != null && response.type === 'student') {
           window.confirm(' Login success Welcome  ' + response.name);
           this.router.navigate(['/']);
           this.service.isSLoggedIn = true;
        }else if (response != null && response.type === 'admin') {
          window.confirm(' Login success Welcome  ' + response.name);
          this.router.navigate(['/']);
          this.service.isALoggedIn = true;
       }
        else {
          alert('Login Failed');
        }
      },err=>{
        console.log(err);
        if(err){
          alert('Login Failed');
        }
      });
  }
}



