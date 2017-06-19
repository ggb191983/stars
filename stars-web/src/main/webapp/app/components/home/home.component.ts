import { Component } from '@angular/core';
import { Http, Response } from '@angular/http';

@Component({
  moduleId: module.id,
  selector: 'home',
  templateUrl: 'home.component.html',
  styleUrls: ['home.component.css']
})
export class HomeComponent {
  http: Http;
  link = 'http://api.giphy.com/v1/gifs/search?api_key=dc6zaTOxFJmzC&q=';

  constructor(http: Http) {
    this.http = http;
  }

  performSearch(searchTerm: HTMLInputElement): void
  {
    var apiLink = this.link + searchTerm.value;
    this.http.request(apiLink)
      .subscribe((res: Response) => {
        console.log(res.json());
      });
  }
}
