import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
import { ProductResponse } from 'ProductResponse';

@Component({
  selector: 'app-searchcategory',
  templateUrl: './searchcategory.component.html',
  styleUrls: ['./searchcategory.component.css']
})
export class SearchcategoryComponent implements OnInit {
  Data: ProductResponse;

  constructor(private http: HttpClient, private router: Router, private service: AuthService) { }

  ngOnInit() {
  }

  get(formcategory: NgForm) {
    console.log(formcategory.value);
    this.http.get<ProductResponse>(`${this.service.baseURL}/getcategory/${formcategory.value.category}`, {headers: this.service.header})
      .subscribe(response => {
        console.log('response=',response);
        if (response != null) {
          alert(' product found');
        } else {
          alert('No product of that category')
        }
        this.Data = response;
        
      });
  }

}
