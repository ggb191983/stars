import {Component, OnInit} from "@angular/core";
import {Router} from "@angular/router";
import {ProductService} from "../../../services/products.service";


@Component({
  moduleId: module.id,
  selector: 'details-panel',
  templateUrl: 'details-panel.component.html',
  styleUrls: [ 'details-panel.component.css' ]
})

export class DetailsPanelComponent {
  productsList: any[];
  selectedProduct: any;

  constructor(private router: Router) { }

  gotoDetail(): void {
    this.router.navigate(['/detail', this.selectedProduct.id]);
  }
}
