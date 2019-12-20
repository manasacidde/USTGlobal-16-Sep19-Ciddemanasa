import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
import { ProductResponse } from 'ProductResponse';

@Component({
  selector: 'app-searchname',
  templateUrl: './searchname.component.html',
  styleUrls: ['./searchname.component.css']
})
export class SearchnameComponent implements OnInit {
  Data: ProductResponse;

  constructor(private http: HttpClient, private router: Router, private service: AuthService) {

   }

  ngOnInit() {
  }

  get(form: NgForm) {
    console.log(form.value);
    this.http.get<ProductResponse>(`${this.service.baseURL}/getname/${form.value.name}`, {headers: this.service.header})
      .subscribe(response => {
        console.log('response=',response);
        if (response != null) {
          alert(' product found');
        } else {
          alert('No product Present for that name ' + form.value.name);
        }
        this.Data = response;
        
      });
  }

}
