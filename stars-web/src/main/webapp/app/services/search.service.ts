import {Injectable} from '@angular/core';
import {Http, Headers, RequestOptions} from "@angular/http";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';;
import {RestService} from "./rest.service";

@Injectable()
export class SearchService extends RestService<any> {

  constructor(http: Http){
    super('/search', http);
  }

  getAll() : Promise<any[]>
  {
    return super.getAll();
  }
}
