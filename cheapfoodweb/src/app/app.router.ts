import{ ModuleWithProviders } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { headerComponent } from './header/app.headerComponent';
import { navComponent } from './nav/app.navComponent';
import { contentAreaComponent } from './contentArea/app.contentAreaComponent';
import { footerComponent } from './footer/app.footerComponent';
import { keszitokComponent } from './keszitok/app.keszitokComponent';
import { etelekComponent } from './etelek/app.etelekComponent';
import { foodlist200Component } from './etelek/foodlist200/app.foodlist200Component';
import { foodlist400Component } from './etelek/foodlist400/app.foodlist400Component';
import { foodlist600Component } from './etelek/foodlist600/app.foodlist600Component';
import { foodlist800Component } from './etelek/foodlist800/app.foodlist800Component';
import { foodsubmitComponent } from './foodsubmit/app.foodsubmitComponent';

 const router: Routes = [
{ path: 'etelek' , component: etelekComponent},
    { path: 'keszitok' , component: keszitokComponent},
    { path: '' , component: contentAreaComponent},
    { path: 'etelek/f2' , component: foodlist200Component},
    { path: 'etelek/f4' , component: foodlist400Component},
    { path: 'etelek/f6' , component: foodlist600Component},
    { path: 'etelek/f8' , component: foodlist800Component},
    { path: 'foodsubmit' , component: foodsubmitComponent}


];
export const routes: ModuleWithProviders = RouterModule.forRoot(router);
