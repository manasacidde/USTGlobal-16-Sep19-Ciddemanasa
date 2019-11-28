import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parentlaptop',
  templateUrl: './parentlaptop.component.html',
  styleUrls: ['./parentlaptop.component.css']
})
export class ParentlaptopComponent implements OnInit {
  selectedLaptop;
  Laptops = [
    {
      imgurl : 'https://cdn.pixabay.com/photo/2014/09/27/13/44/notebook-463485__340.jpg',
      name : 'Asus ROG Gaming'
    },
    {
      imgurl : 'https://cdn.pixabay.com/photo/2015/07/26/17/29/mixer-861431__340.jpg',
      name : 'HP Pavillion'
    },
    {
      imgurl : 'https://cdn.pixabay.com/photo/2017/08/10/07/32/dell-2619501__340.jpg',
      name : 'Dell Vostro'
    },
    {
      imgurl : 'https://cdn.pixabay.com/photo/2014/05/02/21/49/home-office-336373__340.jpg',
      name : 'Apple Macbook air'
    }
  ];

  constructor() { }

  ngOnInit() {
  }
  sendLaptops(laptop) {
    this.selectedLaptop = laptop;
    console.log(laptop);
  }

}
