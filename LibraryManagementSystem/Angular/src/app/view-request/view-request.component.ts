import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-request',
  templateUrl: './view-request.component.html',
  styleUrls: ['./view-request.component.css']
})
export class ViewRequestComponent implements OnInit {
  requests: any;

  constructor(private http: HttpClient,private service: AuthService,private router:Router) {
    this.getRequest();
   }

  ngOnInit() {
  }

  getRequest() {
    this.http.get(`${this.service.baseURL}/library/librarian/viewRequest`).subscribe(response => {
      this.requests = response;
      console.log(this.requests);
      
    });
  }
  accept(request){
    this.router.navigate(['/issue']);
  }

}
