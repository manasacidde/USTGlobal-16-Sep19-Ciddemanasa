import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';
import { BookResponse } from 'bookresponse';

@Component({
  selector: 'app-display-books',
  templateUrl: './display-books.component.html',
  styleUrls: ['./display-books.component.css']
})
export class DisplayBooksComponent implements OnInit {
  books: BookResponse;

  constructor(private http: HttpClient,private service: AuthService) {
    this.getData();
   }

  ngOnInit() {
  }

  getData()  {
    this.http.get<BookResponse>(`${this.service.baseURL}/library/librarian/getBooks`).subscribe(response => {
      this.books = response;
      console.log(this.books);
    });
  }

  delete(book) {
    this.http.delete(`${this.service.baseURL}/library/librarian/${book.bid}`).subscribe(response => {
      if (response) {
        alert('Book Deleted Successfully');
        console.log(response);
        this.getData();
      } else {
        alert('Failed to Delete Book');
      }
      console.log(response);
      this.getData();
    }, err => {
      console.log(err);
    });
  }

}
