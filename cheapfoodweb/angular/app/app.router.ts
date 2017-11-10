/*import{ ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { headerComponent } from './header/app.headerComponent';
import { navComponent } from './nav/app.navComponent';
import { contentAreaComponent } from './contentArea/app.contentAreaComponent';
import { footerComponent } from './footer/app.footerComponent';
import { keszitokComponent } from './keszitok/app.keszitokComponent';

export const router: Routes= [
    { path: 'keszitok' , component: 'keszitokComponent'},
    //{ path: '', redirect to: 'keszitok', pathmatch: 'full'},
    //  { path: 'etelek', keszitok to: 'keszitokComponent'},

];

export const routes: ModuleWithProviders = RouterModule.forRoot(router);
*/
import{ ModuleWithProviders } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { headerComponent } from './header/app.headerComponent';
import { navComponent } from './nav/app.navComponent';
import { contentAreaComponent } from './contentArea/app.contentAreaComponent';
import { footerComponent } from './footer/app.footerComponent';
import { keszitokComponent } from './keszitok/app.keszitokComponent';
import { etelekComponent } from './etelek/app.etelekComponent';

 const router: Routes = [
{ path: 'etelek' , component: etelekComponent},
    { path: 'keszitok' , component: keszitokComponent},
    { path: '' , component: contentAreaComponent}
    //{ path: '', redirect to: 'keszitok', pathmatch: 'full'},
    //  { path: 'etelek', keszitok to: 'keszitokComponent'},

];
export const routes: ModuleWithProviders = RouterModule.forRoot(router);
