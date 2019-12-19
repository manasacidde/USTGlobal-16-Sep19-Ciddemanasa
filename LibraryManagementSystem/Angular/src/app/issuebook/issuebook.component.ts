import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-issuebook',
  templateUrl: './issuebook.component.html',
  styleUrls: ['./issuebook.component.css']
})
export class IssuebookComponent implements OnInit {

  constructor(private http: HttpClient,private service: AuthService,private router:Router) { }
  issue(issueBookForm: NgForm){
    this.http.post(`${this.service.baseURL}/library/librarian/bookissue`,issueBookForm.value,{headers: this.service.header}
    ).subscribe(response=>{
      issueBookForm.reset();
      if(response){
        alert('book issued' );
        this.router.navigate(['/'])
      }else{
        alert('failed to issue book');
      }

    })

  }

  ngOnInit() {
  }

}
