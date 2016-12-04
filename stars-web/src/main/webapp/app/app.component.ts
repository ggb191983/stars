import { Component } from '@angular/core';

@Component({
  selector: 'my-app',
  template: `<h1>Hello {{name}}</h1>
            <alert type="success">hello</alert>
            <products-list>Loading ...</products-list>
`,
  styles: [ "styles.css", "../node_modules/bootstrap/dist/css/bootstrap.min.css" ],
})
export class AppComponent  {
  name = 'Angular';
}
