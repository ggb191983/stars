import {NgModule}      from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {AppComponent}  from './app.component';
import {HttpModule, Http, XHRBackend, RequestOptions, JsonpModule} from '@angular/http';
import {MaterialModule} from '@angular/material';
import {CommonModule} from '@angular/common';


// import ng2-bootstrap alerts module
import {AlertModule} from 'ng2-bootstrap/ng2-bootstrap';
import {ProductService} from "./services/products.service";
import {CategoriesService} from "./services/categories.service";
import {CategoriesComponent} from "./components/categories/categories.component";
import {ProductListComponent} from "./components/products/products.component";
import {MainMenuComponent} from "./components/main-menu/main-menu.component";
import {HomeComponent} from "./components/home/home.component";
import {OffersComponent} from "./components/offers/offers.component";
import { KeycloakService } from './keycloak/keycloak.service';
import { KeycloakHttp, KEYCLOAK_HTTP_PROVIDER } from './keycloak/keycloak.http';
import {FlexLayoutModule} from "@angular/flex-layout";
//import {RegisterComponent} from "./components/register/register.component";
import { PageNotFoundComponent } from './not-found.component';
import {LoginComponent} from "./components/login/login.component";
import {CSSCarouselComponent} from "./components/carousel/carousel.component";
import {AppRoutingModule} from "./app-routing.module";
import {FilterComponent} from "./components/products/filter/filter.component";
import {DetailsPanelComponent} from "./components/products/details-panel/details-panel.component";
import {Collapse} from "./directives/collapse";
import {SortFilterComponent} from "./components/products/filter/sort-filter/sort-filter.component";
import {PriceFilterComponent} from "./components/products/filter/price-filter/price-filter.component";



@NgModule({
  imports:      [
                  AlertModule,
                  CommonModule,
                  BrowserModule,
                  HttpModule,
                  FormsModule,
                  ReactiveFormsModule,
                  JsonpModule,
                  AppRoutingModule,
                  MaterialModule,
                  FlexLayoutModule.forRoot()
                ],
  declarations: [ AppComponent, ProductListComponent, MainMenuComponent, OffersComponent, CategoriesComponent, LoginComponent, HomeComponent, PageNotFoundComponent, CSSCarouselComponent, FilterComponent, DetailsPanelComponent, Collapse, SortFilterComponent, PriceFilterComponent ],
  providers:    [ ProductService,  KeycloakService, CategoriesService, KEYCLOAK_HTTP_PROVIDER ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
