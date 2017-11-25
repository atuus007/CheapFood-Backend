"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var core_1 = require("@angular/core");
var foodsubmitComponent = (function () {
    function foodsubmitComponent() {
    }
    foodsubmitComponent.prototype.onSubmit = function (form) {
        if (form.valid) {
            console.log(form.value);
        }
    };
    return foodsubmitComponent;
}());
foodsubmitComponent = __decorate([
    core_1.Component({
        selector: 'foodsubmit',
        templateUrl: "./foodsubmit.html",
    })
], foodsubmitComponent);
exports.foodsubmitComponent = foodsubmitComponent;
//# sourceMappingURL=app.foodsubmitComponent.js.map