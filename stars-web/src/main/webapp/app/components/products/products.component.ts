import {Component, OnInit} from "@angular/core";
import {Router} from "@angular/router";
import {ProductService} from "./products.service";
import {KeycloakService} from "../../keycloak.service";


@Component({
  moduleId: module.id,
  selector: 'products-list',
  templateUrl: 'products.component.html',
  styleUrls: [ 'products.component.css' ]
})

export class ProductListComponent implements OnInit {
  productsList: any[];
  selectedProduct: any;

  constructor(
    private router: Router,
    private productService: ProductService) { }

  getProducts(): void {
    this.productService.getAll().then(products => this.productsList = products);
    //console.log(KeycloakService.auth.authz.token);
  }

  ngOnInit(): void {
    this.getProducts();
  }

  onSelect(product: any): void {
    this.selectedProduct = product;
  }

  gotoDetail(): void {
    this.router.navigate(['/detail', this.selectedProduct.id]);
  }
}
