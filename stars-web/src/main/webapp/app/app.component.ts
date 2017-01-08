import { Component } from '@angular/core';

@Component({
  selector: 'my-app',
  template: `
            <!--<alert type="success">hello</alert>-->            
            <main-menu></main-menu>
            <products-list>Loading products...</products-list>
            <offers></offers>
            <categories></categories>
`,
  styles: [ "styles.css", "../node_modules/bootstrap/dist/css/bootstrap.min.css" ],
})
export class AppComponent  {
}
