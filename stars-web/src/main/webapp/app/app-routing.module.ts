import {NgModule} from '@angular/core';
import {RouterModule,Routes}  from '@angular/router';
import {LoginComponent} from "./components/login/login.component";
import {ProductListComponent} from "./components/products/products.component";
import {HomeComponent} from "./components/home/home.component";
import {PageNotFoundComponent} from "./not-found.component";


const appRoutes: Routes = [
  // { path: '', redirectTo: '/products', pathMatch: 'full' },
  //{ path: 'dashboard',  component: DashboardComponent },
  //{ path: 'product/:id', component: ProductDetailComponent },
  { path: 'login', component: LoginComponent },
  //{ path: 'register', component: RegisterComponent },
  { path: 'category/:id', component: ProductListComponent },
  { path: 'products', component: ProductListComponent},
  //{ path: '',   redirectTo: '/products', pathMatch: 'full' },
  { path: '',  component: HomeComponent },
  { path: '**', component: PageNotFoundComponent }
];


@NgModule({
  imports: [
    RouterModule.forRoot(appRoutes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule {}
