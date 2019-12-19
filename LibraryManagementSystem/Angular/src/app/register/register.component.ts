import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private http: HttpClient, private router: Router, private service: AuthService) { }

  ngOnInit() {
  }
  register(form: NgForm) {
    console.log(form.value);
    this.http.post(`${this.service.baseURL}/library/admin/create`, form.value).subscribe(response => {
      form.reset();
      if (response) {
        alert('Librarian added');
        this.router.navigate(['/']);
      } else {
        alert('Failed to add Librarian');
      }});
  }

}
