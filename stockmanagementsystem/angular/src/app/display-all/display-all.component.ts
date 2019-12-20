import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-display-all',
  templateUrl: './display-all.component.html',
  styleUrls: ['./display-all.component.css']
})
export class DisplayAllComponent implements OnInit {
  products: any;

  constructor(private http: HttpClient,private router: Router,private service: AuthService) { 
    this.getProducts();

  }

  ngOnInit() {
  }

  getProducts() {
    this.http.get(`${this.service.baseURL}/getall`).subscribe(response => {
      this.products = response;
      console.log(this.products);
    });
  }
  Update(product){
    this.router.navigate(['/update']);
  }
  Add(Product){
    alert(' successfully added to cart');  }
  
}
