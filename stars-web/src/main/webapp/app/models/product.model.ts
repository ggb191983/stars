import {Cart} from "./cart.model";

/**
 * Created by Battlehammer on 07/01/2017.
 */

export class Product {
  id : number;
  name : string;
  description : string;
  price : number;
  cart : Cart;
}
