import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-formc',
  templateUrl: './formc.component.html',
  styleUrls: ['./formc.component.css']
})
export class FormcComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  loginData(form: NgForm) {
    console.log(form.value);
  }
  


}
