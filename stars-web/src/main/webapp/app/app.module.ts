import {NgModule}      from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {AppComponent}  from './app.component';
import {RouterModule, Routes}  from '@angular/router';
import {KeycloakHttp} from "./keycloak.http";
import {HttpModule, Http, XHRBackend, RequestOptions, JsonpModule} from '@angular/http';
import {MaterialModule} from '@angular/material';

// import ng2-bootstrap alerts module
import {AlertModule} from 'ng2-bootstrap/ng2-bootstrap';
import {ProductService} from "./components/products/products.service";
import {CategoriesService} from "./components/categories/categories.service";
import {CategoriesComponent} from "./components/categories/categories.component";
import {ProductListComponent} from "./components/products/products.component";
import {MainMenuComponent} from "./components/main-menu/main-menu.component"
import {OffersComponent} from "./components/offers/offers.component"
import {KeycloakService} from "./keycloak.service";

const routes: Routes = [
 // { path: '', redirectTo: '/products', pathMatch: 'full' },
  //{ path: 'dashboard',  component: DashboardComponent },
  //{ path: 'product/:id', component: ProductDetailComponent },
  { path: 'products',     component: ProductListComponent }
];

@NgModule({
  imports:      [
                  AlertModule,
                  BrowserModule,
                  HttpModule,
                  JsonpModule,
                  RouterModule.forRoot(routes),
                  MaterialModule.forRoot()
                ],
  declarations: [ AppComponent, ProductListComponent, MainMenuComponent, OffersComponent, CategoriesComponent ],
  providers:    [ ProductService,  KeycloakService, CategoriesService,
                  {
                    provide: Http,
                    useFactory:
                      (
                        backend: XHRBackend,
                        defaultOptions: RequestOptions,
                        keycloakService: KeycloakService
                      ) => new KeycloakHttp(backend, defaultOptions, keycloakService),
                    deps: [XHRBackend, RequestOptions, KeycloakService]
                  }
                ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
