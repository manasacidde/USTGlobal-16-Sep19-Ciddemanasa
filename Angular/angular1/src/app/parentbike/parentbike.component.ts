import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parentbike',
  templateUrl: './parentbike.component.html',
  styleUrls: ['./parentbike.component.css']
})
export class ParentbikeComponent implements OnInit {
selectedBike;
Bikes = [
  {
  imgurl : 'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
  name : 'bmw',
  desc :'Model : 1945',
  desc1 : 'The  Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'
},
{
  imgurl : 'https://cdn.pixabay.com/photo/2014/04/23/20/34/dirt-bike-330815__340.jpg',
  name : 'suzuki',
 desc : ' Model : 1885',
desc1 : 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'
},
{
  imgurl : 'https://cdn.pixabay.com/photo/2015/09/08/21/02/superbike-930715__340.jpg',
  name :  'kawasaki',
  desc : 'Model : 2010',
desc1 :'The Lamborghini Swift has 1 Lamborghini Engine and 1 Lamborghini Engine on offer. The Diesel engine is 5000 cc while the Petrol engine is 5000 cc. Depending upon the variant and fuel type the Swift has a mileage of 3.0 to 5.0 kmpl. The Swift is a 5 seater Hatchback and has a length of 5000.'
},
{
  imgurl : 'https://cdn.pixabay.com/photo/2016/01/19/16/46/motorcycle-1149389__340.jpg',
  name :  'Bugati',
  desc: 'Model : 2015',
 desc1 : 'The Petrol engine is 6498 cc. It is available with the Automatic transmission. Depending upon the variant and fuel type the Aventador has a mileage of 5.0 to 7.69 kmpl. The Aventador is a 2 seater Coupe and has a length of 4843 mm, width of 2273 mm and a wheelbase of 2700mm.'
}
];
  constructor() { }

  ngOnInit() {
  }
  sendBike(bike) {
    this.selectedBike = bike;
    console.log(bike);
  }

}
