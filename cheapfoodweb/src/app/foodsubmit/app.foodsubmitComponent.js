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
var forms_1 = require("@angular/forms");
var foodsubmitComponent = (function () {
    function foodsubmitComponent(_fb) {
        this._fb = _fb;
        this.hozzavalokszama = [];
    }
    foodsubmitComponent.prototype.ngOnInit = function () {
        //this.hozzavalokszama = Array(10).fill(0).map((x, i) => i + 1);
        this.foodForm = this._fb.group({
            nev: ['', [forms_1.Validators.required]],
            hozzavalok: this._fb.array([])
        });
        this.addHozzavalok();
    };
    foodsubmitComponent.prototype.initHozzavalok = function () {
        return this._fb.group({
            osszetevok: [''],
            mennyiseg: [''],
            mennyisegselect: ['']
        });
    };
    foodsubmitComponent.prototype.addHozzavalok = function () {
        var control = this.foodForm.controls['hozzavalok'];
        var hozzvCtrl = this.initHozzavalok();
        control.push(hozzvCtrl);
        console.log("AAAAAAA: " + control.length);
    };
    foodsubmitComponent.prototype.deleteHozzavalok = function (i) {
        var control = this.foodForm.controls['hozzavalok'];
        console.log("Deleted: " + i);
        control.removeAt(i);
    };
    foodsubmitComponent.prototype.getFoods = function () {
    };
    return foodsubmitComponent;
}());
foodsubmitComponent = __decorate([
    core_1.Component({
        selector: 'foodsubmit',
        templateUrl: "./foodsubmit.html",
    }),
    __metadata("design:paramtypes", [forms_1.FormBuilder])
], foodsubmitComponent);
exports.foodsubmitComponent = foodsubmitComponent;
//# sourceMappingURL=app.foodsubmitComponent.js.map