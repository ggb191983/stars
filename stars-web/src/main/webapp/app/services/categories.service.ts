import {Injectable} from '@angular/core';
import {Http, Headers, RequestOptions} from "@angular/http";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';
import {Category} from "../models/category.model";
import {RestService} from "./rest.service";

@Injectable()
export class CategoriesService extends RestService<Category> {

  constructor(http: Http){
    super('/category', http);
  }

  getAll() : Promise<Category[]>
  {
    return super.getAll();
  }
}
