"use strict";
var FoodSubmit = (function () {
    function FoodSubmit(n, ingList) {
        this.name = n;
        this.ingredientsList = ingList;
    }
    FoodSubmit.prototype.setName = function (n) {
        this.name = n;
    };
    FoodSubmit.prototype.setIngredients = function (ing) {
        this.ingredientsList = ing;
    };
    FoodSubmit.prototype.getName = function () {
        return this.name;
    };
    FoodSubmit.prototype.getIngredientsList = function () {
        return this.ingredientsList;
    };
    return FoodSubmit;
}());
exports.FoodSubmit = FoodSubmit;
var HozzavaloSubmit = (function () {
    function HozzavaloSubmit() {
    }
    return HozzavaloSubmit;
}());
exports.HozzavaloSubmit = HozzavaloSubmit;
//# sourceMappingURL=foodsubmit.js.map