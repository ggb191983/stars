import {Injectable} from '@angular/core';
import {Http, Headers, RequestOptions} from "@angular/http";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';
import {KeycloakService} from "../../keycloak.service";

export class Hero {
  constructor(public id: number, public name: string) { }
}

@Injectable()
export class ProductService {
  private baseUrl: string = 'https://localhost:8443/stars-web/api';
  constructor(private http : Http){
  }

  getAll() :  Promise<any[]>
  {

    let headers = new Headers();
    headers.set('Access-Control-Allow-Origin', '*');
    headers.set('Access-Control-Allow-Methods', 'GET, POST, PATCH, PUT, DELETE, OPTIONS');
    headers.set('Access-Control-Allow-Headers', 'Origin, Content-Type, X-Auth-Token');
    headers.set('Authorization', 'Bearer ' + KeycloakService.auth.authz.token);
    let products = this.http
    .get(`${this.baseUrl}/products`, {
        headers: headers
      })
      .map(response => response.json())
      .toPromise();
    return products;
  }

  getProduct(id: number | string) : Promise<any>
  {
    let product = this.http.get(`${this.baseUrl}/products`)
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
