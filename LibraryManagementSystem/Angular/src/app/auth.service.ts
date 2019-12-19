import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  baseURL = 'http://localhost:8081/librarysystem';
  header = new HttpHeaders({'content-type':'application/json'});

  isALoggedIn = false;
  isLLoggedIn = false;
  isSLoggedIn = false;
  home = true;
  constructor(private http: HttpClient) { }

  isAdminLoggedIn() {
    if (this.isALoggedIn) {
      return true;
    }
    return false;
  }

  isLibrarianLoggedIn() {
    if (this.isLLoggedIn) {
      return true;
    }
    return false;
  }

  isStudentLoggedIn() {
    if (this.isSLoggedIn) {
      return true;
    }
    return false;
  }

}
