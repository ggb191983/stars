import {Component} from "@angular/core";


@Component({
  moduleId: module.id,
  selector: 'price-filter',
  templateUrl: 'price-filter.component.html',
  styleUrls: [ 'price-filter.component.css' ]
})

export class PriceFilterComponent {
  selectedProduct: any;

  constructor() { }

}
