import { Injectable } from '@angular/core';
import { HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  baseURL = 'http://localhost:8083';
  header = new HttpHeaders({'content-type':'application/json'});

  constructor() { }
}
