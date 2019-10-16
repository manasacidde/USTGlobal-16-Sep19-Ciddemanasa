import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, NgForm } from '@angular/forms';
import { CustomValidation } from './custom.validation';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {
get text(){
  return this.form.get('text');
}
get text1(){
  return this.form.get('text1');
}
get text2(){
  return this.form.get('text2');
}
get text3(){
  return this.form.get('text3');
}

  form = new FormGroup({
    text : new FormControl('', [Validators.required, CustomValidation.unique]),
    text1 : new FormControl('', [Validators.required]),
    text2 : new FormControl('', [Validators.required]),
     text3 : new FormControl('', [Validators.required])
  });

  constructor() { }

  ngOnInit() {
  }
  loginData(form) {
    console.log(form);
  }

}
