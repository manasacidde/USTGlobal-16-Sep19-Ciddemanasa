import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parentmobile',
  templateUrl: './parentmobile.component.html',
  styleUrls: ['./parentmobile.component.css']
})
export class ParentmobileComponent implements OnInit {
  selectedMobile;
  Mobiles = [
    {
      imgurl : 'https://cdn.pixabay.com/photo/2016/11/10/16/18/android-1814600__340.jpg',
      name : 'Asus Zenfone 5'
    },
    {
      imgurl : 'https://cdn.pixabay.com/photo/2017/01/06/13/50/smartphone-1957740__340.jpg',
      name : 'Samsung galaxy s5'
    },
    {
      imgurl : 'https://cdn.pixabay.com/photo/2016/12/09/11/33/smartphone-1894723__340.jpg',
      name : 'Iphone 5'
    },
    {
      imgurl : 'https://cdn.pixabay.com/photo/2013/07/12/18/39/smartphone-153650__340.png',
      name : 'IPhone 4'
    }
  ];

  constructor() { }

  ngOnInit() {
  }
  sendMobiles(mobile) {
    this.selectedMobile = mobile;
    console.log(mobile);
  }

}
