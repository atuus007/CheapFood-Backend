"use strict";
var FoodSubmit = (function () {
    //implicit módon törtnéi a dolog
    function FoodSubmit(id, name, mennyiseg, mennyisegfajta) {
        this.id = id;
        this.name = name;
        this.mennyiseg = mennyiseg;
        this.mennyisegfajta = mennyisegfajta;
    }
    return FoodSubmit;
}());
exports.FoodSubmit = FoodSubmit;
//# sourceMappingURL=foodsubmit.js.map