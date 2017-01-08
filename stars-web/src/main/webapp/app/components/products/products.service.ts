import {Injectable} from '@angular/core';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';
import {RestService} from "../../rest.service";
import {Product} from "../../models/product.model";
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
}
