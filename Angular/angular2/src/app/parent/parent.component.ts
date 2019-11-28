import { Component, OnInit } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;
  Cars = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg',
      name : 'bmw'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629__340.png',
      name : 'audi'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
      name : 'safari'
    },
    {
      imgUrl : 'https://image.shutterstock.com/image-photo/saintpetersburg-russia-september-16-2017-260nw-1017684391.jpg',
      name : 'benz'
    }
  ];

  constructor() { }

  ngOnInit() {
  }
  sendCar(car){
    this.selectedCar = car;
    // console.log(car);
  }
}
