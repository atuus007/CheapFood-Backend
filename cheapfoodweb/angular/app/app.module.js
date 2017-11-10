"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var core_1 = require("@angular/core");
var platform_browser_1 = require("@angular/platform-browser");
var app_router_1 = require("./app.router");
var app_component_1 = require("./app.component");
var app_headerComponent_1 = require("./header/app.headerComponent");
var app_navComponent_1 = require("./nav/app.navComponent");
var app_contentAreaComponent_1 = require("./contentArea/app.contentAreaComponent");
var app_footerComponent_1 = require("./footer/app.footerComponent");
var app_keszitokComponent_1 = require("./keszitok/app.keszitokComponent");
var app_etelekComponent_1 = require("./etelek/app.etelekComponent");
var AppModule = (function () {
    function AppModule() {
    }
    return AppModule;
}());
AppModule = __decorate([
    core_1.NgModule({
        imports: [platform_browser_1.BrowserModule, app_router_1.routes],
        declarations: [app_component_1.AppComponent,
            app_headerComponent_1.headerComponent,
            app_navComponent_1.navComponent,
            app_contentAreaComponent_1.contentAreaComponent,
            app_footerComponent_1.footerComponent,
            app_keszitokComponent_1.keszitokComponent,
            app_etelekComponent_1.etelekComponent],
        bootstrap: [app_component_1.AppComponent]
    })
], AppModule);
exports.AppModule = AppModule;
//# sourceMappingURL=app.module.js.map