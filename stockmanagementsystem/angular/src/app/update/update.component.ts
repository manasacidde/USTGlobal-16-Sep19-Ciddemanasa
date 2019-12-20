import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  constructor(private http: HttpClient, private router: Router, private service: AuthService) { }

  ngOnInit() {
  }

  

  updateProduct(update: NgForm) {
    console.log(update.value);
    this.http.put(`${this.service.baseURL}/modifyproduct`, update.value,{headers: this.service.header}).subscribe(response => {
      if (response) {
        alert('Product updated');
        this.router.navigate(['/']);
      } else {
        alert('Failed to update');
      }});
  }
}
