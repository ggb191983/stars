import {Component, OnInit} from "@angular/core";
import {Router, ActivatedRoute} from "@angular/router";
import {ProductService} from "../../services/products.service";


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
    private route: ActivatedRoute,
    private router: Router,
    private productService: ProductService) { }

  getProducts(): void {
    this.productService.getAll().then(products => this.productsList = products);
  }

  ngOnInit(): void {
    let id = +this.route.snapshot.params['id'] | null;
    if (id == null) {
      this.getProducts();
    } else {
      this.productService.getProductsByCategory(id).then(products => this.productsList = products);
    }
  }

  onSelect(product: any): void {
    this.selectedProduct = product;
  }

  gotoDetail(): void {
    this.router.navigate(['/detail', this.selectedProduct.id]);
  }
}
