import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parentmovie',
  templateUrl: './parentmovie.component.html',
  styleUrls: ['./parentmovie.component.css']
})
export class ParentmovieComponent implements OnInit {
  selectedMovie;
  Movies = [
    {
      imgurl : 'https://cdn.pixabay.com/photo/2017/06/29/00/10/movie-poster-2452656__340.jpg',
      name : 'Adventure'
    },
    {
      imgurl : 'https://cdn.pixabay.com/photo/2016/03/21/20/01/chaplin-1271422__340.jpg',
      name : 'Charlie Chaplin'
    },
    {
      imgurl : 'https://cdn.pixabay.com/photo/2019/04/08/16/27/spiderman-4112322__340.jpg',
      name : 'Spider Man'
    },
    {
      imgurl : 'https://cdn.pixabay.com/photo/2019/05/25/12/30/iron-man-4228269__340.jpg',
      name : 'Ironman'
    }
  ];

  constructor() { }

  ngOnInit() {
  }
  sendMovies(movie) {
    this.selectedMovie=movie;
    console.log(movie);
  }

}
