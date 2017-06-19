import { Component } from '@angular/core'

@Component({
  selector: 'my-app',
  template: `
            <!--<alert type="success">hello</alert>-->                    
            <a [routerLink]="['/Home']">Home</a>                                                   
            <div fxLayout="column" fxLayout.xs="column">                  
                <header fxLayout="row" fxLayout.xs="column">header</header>
                <main-menu></main-menu>                                       
                <router-outlet></router-outlet>                                                        
                <footer fxLayout="row" fxLayout.xs="column">footer</footer>            
            </div>
`,
  styles: ["../node_modules/bootstrap/dist/css/bootstrap.min.css"],
})
export class AppComponent  {
  public direction = "row";
  toggleDirection() {
    this.direction = (this.direction === "column") ? "row" : "column";
  }
}
