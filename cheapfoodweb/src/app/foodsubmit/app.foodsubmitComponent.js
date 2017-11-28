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
        this.foodsList = [];
        //newFoodForm= new ngForm;
        /*constructor(nev: string, osszetevok: string, mennyiseg: string,
           ar: number) {
           this.nev = nev;
           this.osszetevok = osszetevok;
           this.mennyiseg = mennyiseg;
           this.ar = ar;
         }
         onSubmit(form: newFoodForm) {
            if (form.valid) {
              console.log(form.value);
            }
        
        
        
          onSubmit(form: newFoodForm) {
            if (form.valid) {
              console.log(form.value);
            }
          }*/
    }
    foodsubmitComponent.prototype.onSubmit = function () {
        console.log("SSS: " + this.nev + " " + this.osszetevok + " " + this.mennyiseg + " " + this.mennyisegselect + " " + this.ar);
        this.foodsList.push({ "nev": this.nev, "osszetevok": this.osszetevok, "mennyiseg": this.mennyiseg, "mennyisegselect": this.mennyisegselect, "ar": this.ar });
        console.log("SSS: " + this.nev + " " + this.osszetevok + " " + this.mennyiseg + " " + this.mennyisegselect + "  " + this.ar + " tomb: " + this.foodsList.length);
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