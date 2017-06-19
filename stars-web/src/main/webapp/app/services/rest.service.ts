import {Injectable} from '@angular/core';
import {Http, Headers, RequestOptions} from "@angular/http";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';

export abstract class RestService<T> {
  protected baseUrl: string = 'https://localhost:8443/stars-web/public';
  constructor(protected endPoint : string, protected http : Http){
  }

  getAll() : Promise<T[]>
  {
    let products = this.http
      .get(`${this.baseUrl}${this.endPoint}`)
      .map(response => <T[]>response.json())
      //.finally(() => this._loadingService.hideLoading())
      .do(data => console.log(JSON.stringify(data)))
      //.catch(this.handleError);
      .toPromise();
    return products;
  }

  /*
  get(id: number | string) : Promise<T>
  {
    let product = this.http.get(`${this.baseUrl}/category/${id}`)
      .map(response => response.json())
      .toPromise();
    return product;
  }

  add(p : T) : Promise<T>
  {
    let headers = new Headers({ 'Content-Type': 'application/json' });
    let options = new RequestOptions({ headers: headers });
    let product = this.http.post(this.baseUrl, p, options)
      .map(response => response.json())
      .toPromise();
    return product;
  }*/
}
