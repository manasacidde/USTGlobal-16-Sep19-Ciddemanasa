import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  get id(){
    return this.form.get('id');
  }
  get name(){
    return this.form.get('name');
  }
  get email(){
    return this.form.get('email');
  }
  get password(){
    return this.form.get('password');
  }
  form = new FormGroup({
    id : new  FormControl('',[Validators.required]),
    name : new FormControl('',[Validators.required,Validators.minLength(5)]),
    password : new FormControl('', [Validators.required,Validators.minLength(5)]),
    email : new FormControl('',[Validators.required,Validators.email,Validators.minLength(5)])
  })
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
