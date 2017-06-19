import {Component} from '@angular/core';
import {Http, Response} from '@angular/http';
import {FormControl} from '@angular/forms';
import {Observable} from 'rxjs/Rx';
import 'rxjs/add/operator/startWith';

@Component({
  moduleId: module.id,
  selector: 'main-menu',
  templateUrl: 'main-menu.component.html',
  styleUrls: ['main-menu.component.css'],
})
export class MainMenuComponent {
  http: Http;
  link = 'http://api.giphy.com/v1/gifs/search?api_key=dc6zaTOxFJmzC&q=';
  search : FormControl;
  options = [
    'One',
    'Two',
    'Three'
  ];
  filteredOptions: Observable<string[]>;

  constructor(http: Http) {
    this.http = http
    this.search = new FormControl();
  }

  ngOnInit() {
    this.filteredOptions = this.search.valueChanges
      .startWith(null)
      .map(val => val ? this.filter(val) : this.options.slice());
  }

  filter(val: string): string[] {
    return this.options.filter(option => new RegExp(val, 'gi').test(option));
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
