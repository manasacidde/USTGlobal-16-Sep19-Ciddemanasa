import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {

  constructor(private http: HttpClient,private service: AuthService,private router: Router) { }

  ngOnInit() {
  }

  addProduct(addProductForm: NgForm) {
    this.http.post(`${this.service.baseURL}/addproduct`, addProductForm.value).subscribe(response => {
      if (response) {
        alert('Product Added');
        this.router.navigate(['/']);
      } else {
        alert('Failed to add ');
      }});
  }

}
