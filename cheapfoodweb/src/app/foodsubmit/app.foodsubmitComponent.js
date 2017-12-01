"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require("@angular/core");
// import { FoodSubmit }from './foodsubmit'
var foodSubmitService_1 = require("./foodSubmitService");
var foodsubmitComponent = (function () {
    function foodsubmitComponent(_foodService) {
        this._foodService = _foodService;
        this.foodsList = [];
        this.foodsList3 = [];
        this.foodsList2 = {
            "id": 12,
            "name": "KURVAAA ANyadat",
            "mennyiseg": 20,
            "mennyisegfajta": 1
        };
    }
    foodsubmitComponent.prototype.ngOnInit = function () {
        /*
        this._foodService.getFood()
        .subscribe(foods => { this.foodsList = foods;},
                   error => this.errorMessage=<any>error
        );*/
    };
    foodsubmitComponent.prototype.onSubmit = function () {
        var _this = this;
        console.log("SSS: " + this.nev + " " + this.osszetevok + " " + this.mennyiseg + " " + this.mennyisegselect + " " + this.ar);
        this._foodService.createFood(this.foodsList2);
        this._foodService.getFood()
            .subscribe(function (foods) { _this.foodsList3 = foods; }, function (error) { return _this.errorMessage = error; });
        console.log("Result " + this.foodsList3.length);
    };
    foodsubmitComponent.prototype.getFoods = function () {
        var _this = this;
        this._foodService.getFood()
            .subscribe(function (foods) { _this.foodsList = foods; }, function (error) { return _this.errorMessage = error; });
        console.log("AAA: " + this.foodsList.length);
        //console.log(this.foodsList[0].name);
        //console.log(this.foodsList[0].mennyiseg);
    };
    return foodsubmitComponent;
}());
foodsubmitComponent = __decorate([
    core_1.Component({
        selector: 'foodsubmit',
        templateUrl: "./foodsubmit.html",
    }),
    __metadata("design:paramtypes", [foodSubmitService_1.FoodSubmitService])
], foodsubmitComponent);
exports.foodsubmitComponent = foodsubmitComponent;
//# sourceMappingURL=app.foodsubmitComponent.js.map