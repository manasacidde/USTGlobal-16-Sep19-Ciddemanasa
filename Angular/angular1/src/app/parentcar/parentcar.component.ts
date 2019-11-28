import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parentcar',
  templateUrl: './parentcar.component.html',
  styleUrls: ['./parentcar.component.css']
})
export class ParentcarComponent implements OnInit {
selectedCar;
Cars = [{
  imgurl : 'https://cdn.pixabay.com/photo/2016/02/13/13/11/cuba-1197800__340.jpg',
  name : 'Maruthi',
  desc: 'Model : 1945',
  desc1 : 'The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm'
},
{
  imgurl: 'https://cdn.pixabay.com/photo/2015/05/28/23/12/auto-788747__340.jpg',
  name : 'Suzuki',
  desc : 'Model : 1885',
  desc1: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'
},
{
  imgurl: 'https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629__340.png',
  name : 'Lamborghini',
  desc: 'Model : 2010',
  desc1: 'The Lamborghini Swift has 1 Lamborghini Engine and 1 Lamborghini Engine on offer. The Diesel engine is 5000 cc while the Petrol engine is 5000 cc. Depending upon the variant and fuel type the Swift has a mileage of 3.0 to 5.0 kmpl. The Swift is a 5 seater Hatchback and has a length of 5000.'
},
{
  imgurl: 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
  name : 'Audi A3'
}
];
  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    this.selectedCar=car;
    console.log(car);
  }
}
