import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

  constructor(private http: HttpClient,private service: AuthService,private router: Router) { }

  ngOnInit() {
  }
  
  addBook(addBookForm: NgForm) {
    this.http.post(`${this.service.baseURL}/library/librarian/create`, addBookForm.value).subscribe(response => {
      if (response) {
        alert('Book Added');
        this.router.navigate(['/']);
      } else {
        alert('Failed to add Book');
      }});
  }

}
