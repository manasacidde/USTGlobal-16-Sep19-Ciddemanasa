import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-add-student',
  templateUrl: './add-student.component.html',
  styleUrls: ['./add-student.component.css']
})
export class AddStudentComponent implements OnInit {

  constructor(private http: HttpClient, private router: Router,private service: AuthService) { }

  ngOnInit() {
  }
  register(form: NgForm) {
    console.log(form.value);
    this.http.post(`${this.service.baseURL}/library/librarian/user`, form.value).subscribe(response => {
      form.reset();
      if (response) {
        alert('Student Added');
        this.router.navigate(['/']);
      } else {
        alert('Failed to add Student');
      }});
  }


}
