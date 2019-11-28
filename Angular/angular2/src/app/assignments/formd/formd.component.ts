import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-formd',
  templateUrl: './formd.component.html',
  styleUrls: ['./formd.component.css']
})
export class FormdComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  loginData(form: NgForm) {
    console.log(form.value);
  }

}
