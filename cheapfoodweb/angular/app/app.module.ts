import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { routes } from './app.router';
import { AppComponent }  from './app.component';
import { headerComponent } from './header/app.headerComponent';
import { navComponent } from './nav/app.navComponent';
import { contentAreaComponent } from './contentArea/app.contentAreaComponent';
import { footerComponent } from './footer/app.footerComponent';
import { keszitokComponent } from './keszitok/app.keszitokComponent';
import { etelekComponent } from './etelek/app.etelekComponent';


@NgModule({
  imports:      [ BrowserModule,routes ],
  declarations: [ AppComponent,
                  headerComponent,
                  navComponent,
                  contentAreaComponent,
                  footerComponent,
                  keszitokComponent,
                etelekComponent],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
