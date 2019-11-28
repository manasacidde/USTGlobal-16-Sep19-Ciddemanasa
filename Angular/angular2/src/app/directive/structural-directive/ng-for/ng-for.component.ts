import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
  Products = [
    {
      img: 'https://cdn.pixabay.com/photo/2016/12/19/08/39/mobile-phone-1917737__340.jpg',
      name: 'mobile',
      price: 20000

    },
    {
      img: 'https://cdn.pixabay.com/photo/2014/05/02/21/50/home-office-336378__340.jpg',
      name: 'laptop',
      price: 30000
    }
  ];

  constructor() { }

  ngOnInit() {
  }

}
