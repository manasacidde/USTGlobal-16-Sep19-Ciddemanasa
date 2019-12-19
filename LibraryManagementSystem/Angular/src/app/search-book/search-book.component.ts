import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';
import { BookResponse } from 'bookresponse';

@Component({
  selector: 'app-search-book',
  templateUrl: './search-book.component.html',
  styleUrls: ['./search-book.component.css']
})
export class SearchBookComponent implements OnInit {

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

}
