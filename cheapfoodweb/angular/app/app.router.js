"use strict";
var router_1 = require("@angular/router");
var app_contentAreaComponent_1 = require("./contentArea/app.contentAreaComponent");
var app_keszitokComponent_1 = require("./keszitok/app.keszitokComponent");
var app_etelekComponent_1 = require("./etelek/app.etelekComponent");
var router = [
    { path: 'etelek', component: app_etelekComponent_1.etelekComponent },
    { path: 'keszitok', component: app_keszitokComponent_1.keszitokComponent },
    { path: '', component: app_contentAreaComponent_1.contentAreaComponent }
];
exports.routes = router_1.RouterModule.forRoot(router);
//# sourceMappingURL=app.router.js.map