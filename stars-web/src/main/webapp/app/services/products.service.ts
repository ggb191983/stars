import {Injectable} from '@angular/core';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';
import {RestService} from "./rest.service";
import {Product} from "../models/product.model";
import {Http} from '@angular/http';

@Injectable()
export class ProductService extends RestService<Product> {

  constructor(http: Http){
    super('/product', http);
  }

  getAll() : Promise<Product[]>
  {
    return super.getAll();
  }

  getProductsByCategory(categoryId : Number) : Promise<Product[]>
  {
    let products = this.http
      .get(`${this.baseUrl}${this.endPoint}/cat/${categoryId}`)
      .map(response => <Product[]>response.json())
      .do(data => console.log('data:' + JSON.stringify(data)))
      .toPromise();
    return products;
  }
}
