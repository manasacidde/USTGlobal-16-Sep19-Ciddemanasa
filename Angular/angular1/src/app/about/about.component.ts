import { Component } from "@angular/core";
import { HttpClient } from '@angular/common/http';



@Component({
    selector : 'app-about',
    templateUrl : './about.component.html',
    styleUrls : ['./about.component.css']
})



export class AboutComponent {
    news;
    constructor(private http : HttpClient) {
        this.getNews();
    }
    getNews(){
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=625dd2244a43424faf9724226c48f286').subscribe(data => {
        this.news = data.articles;   
        console.log(data);
        }, err => {
            console.log(err);
        }, ()=> {
            console.log('news got successfully');
        })
    }
}
