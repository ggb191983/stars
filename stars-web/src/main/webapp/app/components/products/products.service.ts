import {Injectable} from '@angular/core';
import {Http, Headers, RequestOptions} from "@angular/http";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';

export class Hero {
  constructor(public id: number, public name: string) { }
}

@Injectable()
export class ProductService {
  private baseUrl: string = '/stars-web/api/';
  constructor(private http : Http){
  }

  getAll() :  Promise<any[]>
  {
    let products = this.http
    .get(`${this.baseUrl}/products`)
      .map(response => response.json())
      .toPromise();
    return products;
  }

  getProduct(id: number | string) : Promise<any>
  {
    let product = this.http.get(`${this.baseUrl}/products/${id}`)
      .map(response => response.json())
      .toPromise();
    return product;
  }

  addProduct(p : any) : Promise<any>
  {
    let headers = new Headers({ 'Content-Type': 'application/json' });
    let options = new RequestOptions({ headers: headers });
    let product = this.http.post(this.baseUrl, p, options)
      .map(response => response.json())
      .toPromise();
    return product;
  }
}
