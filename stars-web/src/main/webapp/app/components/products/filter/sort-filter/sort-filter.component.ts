import {Component} from "@angular/core";


@Component({
  moduleId: module.id,
  selector: 'sort-filter',
  templateUrl: 'sort-filter.component.html',
  styleUrls: [ 'sort-filter.component.css' ]
})

export class SortFilterComponent {
  selectedProduct: any;

  constructor() { }

}
