import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
import { BookResponse } from 'bookresponse';

@Component({
  selector: 'app-request-book',
  templateUrl: './request-book.component.html',
  styleUrls: ['./request-book.component.css']
})
export class RequestBookComponent implements OnInit {
  books: BookResponse;

  constructor(private http: HttpClient, private router: Router, private service: AuthService) { 
    this.getData() ;
  }
  
  ngOnInit() {
  }
  
  getData()  {
    this.http.get<BookResponse>(`${this.service.baseURL}/library/librarian/getBooks`).subscribe(response => {
      this.books = response;
      console.log(this.books);
    });
  }

  requestBook(book) {
    this.http.get(`${this.service.baseURL}/library/student/book/request/${book.bid}`)
    .subscribe(response => {
      console.log(response);
      if (response) {
        alert('Book requested Succefully');
      } else{
        alert('Book not requested Succefully');
      }
    });
  }
}
