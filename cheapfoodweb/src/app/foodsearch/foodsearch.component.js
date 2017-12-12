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
var foodSubmitService_1 = require("../shared/foodSubmitService");
var FoodsearchComponent = (function () {
    function FoodsearchComponent(foodService) {
        this.foodService = foodService;
        this.foodresult = [];
        this.foodresult2 = [];
        this.ingRes = [];
    }
    FoodsearchComponent.prototype.ngOnInit = function () {
    };
    FoodsearchComponent.prototype.keres = function () {
        var _this = this;
        this.foodService.findfoodByName(this.search).subscribe(function (foods) {
            _this.foodresult2 = foods;
            console.log("Res: ");
            console.log(foods);
        }, function (error) { console.log(error); });
        //this.name=this.foodresult.getName();
        // console.log("===================================7");
        console.log("AAA: ");
        console.log(this.foodresult2);
        // console.log("===================================7");
    };
    FoodsearchComponent.prototype.keresHozzavalo = function (i, index) {
        /*
        console.log("id: "+i+" index: "+index);
        this.foodService.getIngredientsById(i).subscribe(
          ingrediens => { this.ingRes = ingrediens;},
          error => {console.log(<any>error);}
        );
        this.selectedRow=index;
        */
    };
    return FoodsearchComponent;
}());
FoodsearchComponent = __decorate([
    core_1.Component({
        selector: 'app-foodsearch',
        templateUrl: './foodsearch.component.html',
    }),
    __metadata("design:paramtypes", [foodSubmitService_1.FoodSubmitService])
], FoodsearchComponent);
exports.FoodsearchComponent = FoodsearchComponent;
//# sourceMappingURL=foodsearch.component.js.map