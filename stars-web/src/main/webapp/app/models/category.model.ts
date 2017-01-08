import {SubCategory} from "./subcategory.model";

/**
 * Created by Battlehammer on 07/01/2017.
 */

export class Category {
  id : number;
  name : string;
  description : string;
  subCategories : SubCategory[];
}
