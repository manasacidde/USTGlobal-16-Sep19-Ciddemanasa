import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-delete-librarian',
  templateUrl: './delete-librarian.component.html',
  styleUrls: ['./delete-librarian.component.css']
})
export class DeleteLibrarianComponent implements OnInit {
librarians:any;
  constructor(private http: HttpClient,private service: AuthService) { 
    this.getLibrarian();
  }

  ngOnInit() {
  }
  getLibrarian() {
    this.http.get(`${this.service.baseURL}/library/admin/displayLibrarian`).subscribe(response => {
      this.librarians = response;
      console.log(this.librarians);
    });
  }
  deleteLibrarian(librarian) {
    this.http.delete(`${this.service.baseURL}/library/admin/deleteLibrarian/${librarian.id}`).subscribe(resData => {
      if (resData) {
      alert('Librarian Deleted Successfully');
      console.log(resData);
      this.getLibrarian();
      } else {
        alert('Failed to Delete Librarian');
      }
    }, err => {
      console.log(err);
    });
  }

}
