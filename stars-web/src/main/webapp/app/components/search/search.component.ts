import {Component} from '@angular/core';
import {FormControl} from '@angular/forms';
import {Observable} from 'rxjs/Rx';
import 'rxjs/add/operator/startWith';
import {SearchService} from "../../services/search.service";

@Component({
  moduleId: module.id,
  selector: 'search-menu',
  templateUrl: 'search.component.html',
  styleUrls: ['search.component.css'],
})
export class SearchComponent {
  /*
  search : FormControl;
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
  }*/
}
