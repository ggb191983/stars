import {Component, OnInit} from "@angular/core";
import {Router} from "@angular/router";
import {ProductService} from "../../../services/products.service";


@Component({
  moduleId: module.id,
  selector: 'filter',
  templateUrl: 'filter.component.html',
  styleUrls: [ 'filter.component.css' ]
})

export class FilterComponent {
  productsList: any[];
  selectedProduct: any;

  constructor(
    private router: Router,
    private productService: ProductService) { }

  gotoDetail(): void {
    this.router.navigate(['/detail', this.selectedProduct.id]);
  }
}
