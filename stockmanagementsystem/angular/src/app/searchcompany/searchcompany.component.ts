import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';
import { ProductResponse } from 'ProductResponse';

@Component({
  selector: 'app-searchcompany',
  templateUrl: './searchcompany.component.html',
  styleUrls: ['./searchcompany.component.css']
})
export class SearchcompanyComponent implements OnInit {
  Data: ProductResponse;

  constructor(private http: HttpClient, private router: Router, private service: AuthService) { }

  ngOnInit() {
  }

  get(formcompany: NgForm) {
    console.log(formcompany.value);
    this.http.get<ProductResponse>(`${this.service.baseURL}/getcompany/${formcompany.value.company}`, {headers: this.service.header})
      .subscribe(response => {
        console.log('response=',response);
        if (response != null) {
          alert(' product found');
        } else {
          alert('No product Present for that company ');
        }
        this.Data = response;
      });
  }

}
