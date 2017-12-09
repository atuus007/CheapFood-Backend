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
        this.valami = [];
    } //pipa
    foodsubmitComponent.prototype.ngOnInit = function () {
        //this.hozzavalokszama = Array(10).fill(0).map((x, i) => i + 1);
        this.foodForm = this._fb.group({
            name: ['', [forms_1.Validators.required, forms_1.Validators.minLength(5)]],
            ingredientsList: this._fb.array([])
        }); //pipa
        this.addHozzavalok(); //pipa
        console.log("ngOnInit " + this.foodForm);
    };
    foodsubmitComponent.prototype.initHozzavalok = function () {
        console.log("initHozzavalok " + this.foodForm);
        return this._fb.group({
            name: ['', [forms_1.Validators.required]],
            mennyiseg: ['', [forms_1.Validators.required]],
            atlagar: ['', [forms_1.Validators.required]],
            mennyisegfajta: ['']
        });
    };
    foodsubmitComponent.prototype.addHozzavalok = function () {
        var control = this.foodForm.controls['ingredientsList'];
        var hozzvCtrl = this.initHozzavalok();
        console.log("addHozzavalok: " + this.foodForm);
        control.push(hozzvCtrl);
        console.log("addHozzavalok: " + control.length);
        console.log("control: " + control);
    };
    foodsubmitComponent.prototype.deleteHozzavalok = function (i) {
        /*
        const control = <FormArray>this.foodForm.controls['ingredientsList'];
        
        console.log("Deleted: " + i);
        control.removeAt(i);
    */
    };
    foodsubmitComponent.prototype.save = function () {
        //alert(model.value['name']);
        //alert(model.controls['addresses'].value['street']);
        //console.log("MODEL: "+model);
        //console.log("save: " + this.foodForm);
        //alert("AAA: "+model.hozzavalok[0]);
        //let json=JSON.parse(model);
        //console.log(model);
        console.log("==============================================================");
        console.log("form: " + this.foodForm.get('name').value);
        console.log(this.foodForm.get('ingredientsList').value);
        //this.myFood.name=this.foodForm.get('name').value;
        //console.log("foodname: "+this.myFood.name);
        //this.myFood.ingredientsList=this.foodForm.get('ingredientsList').value;
        //console.log(this.myFood.name);
        //console.log(this.myFood.ingredientsList[0].ingName+" "+this.myFood.ingredientsList[0].atlagar+" "+this.myFood.ingredientsList[0].mennyiseg);
        this.valami = this.foodForm.get('ingredientsList').value;
        console.log(this.valami[0].name + " " + this.valami[0].atlagar + " " + this.valami[0].mennyiseg);
        //console.log(this.valami[1].name+" "+this.valami[1].atlagar);
        // this.myFood.name
        console.log("==============================================================");
        //  alert("AAA: "+model.value['name']);
        //  alert("CCC: "+model.value['addresses'][0]);
        //  alert("BBB: "+this.myForm.value['name']);
        ///////////////////////////
        //console.log(this.searchForm.get('properties').at(0).value);
        ////////////////////////
        //alert("save: " + this.foodForm);
        //alert("save:foodname: " + this.foodForm.get('name'));
        //alert("save:fdasdfadsdfdas " + this.foodForm.get('ingredientsList').get('name'));
        //alert("this.foodForm.value['name']: "+this.foodForm.value['name']);
        //alert("this.foodForm.value['ingredientsList'] "+this.foodForm.value['ingredientsList']);
        //alert("this.foodForm.value['ingredientsList'] "+this.foodForm.value['ingredientsList'].value());
        /*
        this._foodService.createFood(this.foodsList2)
        .subscribe(   res=>{
          console.log(res);
          },
          err=>{
              console.log("Error occured");
          });
        /*this._foodService.getFood()
        .subscribe(foods => { this.foodsList3 = foods;},
                   error => this.errorMessage=<any>error
        );
        console.log("Result "+this.foodsList3.length);
        */
    };
    foodsubmitComponent.prototype.getFoods = function () {
        /*
             this._foodService.getFood()
             .subscribe(foods => { this.foodsList = foods;},
                        error => this.errorMessage=<any>error
             );
             console.log("AAA: "+this.foodsList.length);
             //console.log(this.foodsList[0].name);
             //console.log(this.foodsList[0].mennyiseg);
           }
           */
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