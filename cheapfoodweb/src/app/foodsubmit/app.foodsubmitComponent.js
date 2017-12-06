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
var foodsubmitComponent = (function () {
    function foodsubmitComponent(_foodService) {
        this._foodService = _foodService;
        this.edited = true;
        this.edited2 = true;
        this.edited3 = true;
        this.edited4 = true;
        this.gombeltunt = false;
        this.gombeltunt2 = true;
        this.gombeltunt3 = true;
        this.gombeltunt4 = true;
        this.maxingrediements = true;
        this.foodsList = [];
        this.foodsList3 = [];
        this.foodsList2 = {
            "name": "AAAAAAAAAAAA",
            "mennyiseg": 30,
            "mennyisegfajta": 3
        };
    }
    foodsubmitComponent.prototype.ngOnInit = function () {
        /*
        this._foodService.getFood()
        .subscribe(foods => { this.foodsList = foods;},
                   error => this.errorMessage=<any>error
        );*/
    };
    foodsubmitComponent.prototype.newIngredient = function () {
        console.log("2. Ingredient added");
        this.edited = false;
        return this.edited;
    };
    foodsubmitComponent.prototype.newIngredient2 = function () {
        console.log("3. Ingredient added");
        this.edited2 = false;
        return this.edited2;
    };
    foodsubmitComponent.prototype.newIngredient3 = function () {
        console.log("4. Ingredient added");
        this.edited3 = false;
        return this.edited3;
    };
    foodsubmitComponent.prototype.newIngredient4 = function () {
        console.log("5. Ingredient added");
        this.edited4 = false;
        return this.edited4;
    };
    foodsubmitComponent.prototype.buttonHide = function () {
        console.log("Gomb Eltuntetve");
        this.gombeltunt = true;
        return this.gombeltunt;
    };
    foodsubmitComponent.prototype.buttonHide2 = function () {
        console.log("Gomb Eltuntetve");
        this.gombeltunt2 = true;
        return this.gombeltunt2;
    };
    foodsubmitComponent.prototype.buttonHide3 = function () {
        console.log("Gomb Eltuntetve");
        this.gombeltunt3 = true;
        return this.gombeltunt3;
    };
    foodsubmitComponent.prototype.buttonHide4 = function () {
        console.log("Gomb Eltuntetve");
        this.gombeltunt4 = true;
        return this.gombeltunt4;
    };
    foodsubmitComponent.prototype.newbutt = function () {
        console.log("2.Gomb feljelent");
        this.gombeltunt2 = false;
        return this.gombeltunt2;
    };
    foodsubmitComponent.prototype.newbutt2 = function () {
        console.log("3.Gomb feljelent");
        this.gombeltunt3 = false;
        return this.gombeltunt3;
    };
    foodsubmitComponent.prototype.newbutt3 = function () {
        console.log("4.Gomb feljelent");
        this.gombeltunt4 = false;
        return this.gombeltunt4;
    };
    foodsubmitComponent.prototype.MaxIng = function () {
        console.log("Maximum összetevő elérve!");
        this.maxingrediements = false;
        return this.maxingrediements;
    };
    foodsubmitComponent.prototype.onSubmit = function () {
        if (!this.osszetevok2) {
            console.log("SSS: " + this.nev + " " + this.osszetevok + " " + this.mennyiseg + " " + this.mennyisegselect + " " + this.ar);
            this.foodsList.push();
        }
        else if (!this.osszetevok3) {
            console.log("SSS: " + this.nev + " " + this.osszetevok + " " + this.mennyiseg + " " + this.mennyisegselect + " " + this.osszetevok2 + " " + this.mennyiseg2 + " " + this.mennyisegselect2 + " " + this.ar);
            this.foodsList.push();
        }
        else if (!this.osszetevok4) {
            console.log("SSS: " + this.nev + " " + this.osszetevok + " " + this.mennyiseg + " " + this.mennyisegselect + " " + this.osszetevok2 + " " + this.mennyiseg2 + " " + this.mennyisegselect2 + " " + this.osszetevok3 + " " + this.mennyiseg3 + " " + this.mennyisegselect3 + " " + this.ar);
            this.foodsList.push();
        }
        else if (!this.osszetevok5) {
            console.log("SSS: " + this.nev + " " + this.osszetevok + " " + this.mennyiseg + " " + this.mennyisegselect + " " + this.osszetevok2 + " " + this.mennyiseg2 + " " + this.mennyisegselect2 + " " + this.osszetevok3 + " " + this.mennyiseg3 + " " + this.mennyisegselect3 + " " + this.osszetevok4 + " " + this.mennyiseg4 + " " + this.mennyisegselect4 + " " + this.ar);
            this.foodsList.push();
        }
        else if (this.osszetevok5) {
            console.log("SSS: " + this.nev + " " + this.osszetevok + " " + this.mennyiseg + " " + this.mennyisegselect + " " + this.osszetevok2 + " " + this.mennyiseg2 + " " + this.mennyisegselect2 + " " + this.osszetevok3 + " " + this.mennyiseg3 + " " + this.mennyisegselect3 + " " + this.osszetevok4 + " " + this.mennyiseg4 + " " + this.mennyisegselect5 + " " + this.osszetevok5 + " " + this.mennyiseg5 + " " + this.mennyisegselect5 + " " + this.ar);
            this.foodsList.push();
        }
        ////////////////////////////////
        this._foodService.createFood(this.foodsList2)
            .subscribe(function (res) {
            console.log(res);
        }, function (err) {
            console.log("Error occured");
        });
        /*this._foodService.getFood()
        .subscribe(foods => { this.foodsList3 = foods;},
                   error => this.errorMessage=<any>error
        );*/
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