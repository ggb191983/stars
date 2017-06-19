import {SubCategory} from "./subcategory.model";

/**
 * Created by Battlehammer on 07/01/2017.
 */

export class Category {
  id : number;
  name : string;
  description : string;
  categoryParent : string;

  constructor(category: any) {
    this.id = category.categoryId;
    this.name = category.name;
    this.description = category.description;
    this.categoryParent = category.category_parent;
  }
}
