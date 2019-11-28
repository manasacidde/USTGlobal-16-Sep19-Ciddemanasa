import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-propertybinding',
  templateUrl: './propertybinding.component.html',
  styleUrls: ['./propertybinding.component.css']
})
export class PropertybindingComponent implements OnInit {
  name = 'cream';
  imgurl = 'https://cdn.pixabay.com/photo/2019/09/26/15/46/girl-4506318_960_720.jpg';
  address = 'Hanumanth nagar,Bangalore';
  colorName = 'blue';
  isActive:boolean = false;
  colSpanValue:number = 2;
  constructor() {}

  ngOnInit() {
    setInterval(() => {
      this.colorName = 'red';
      this.isActive = !this.isActive;
    }, 2000)
  }

}
