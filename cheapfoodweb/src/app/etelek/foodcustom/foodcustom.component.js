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
var router_1 = require("@angular/router");
var FoodcustomComponent = (function () {
    function FoodcustomComponent(route, router) {
        this.route = route;
        this.router = router;
        this.display = 'block';
        this.position = 'absolute';
    }
    FoodcustomComponent.prototype.ngOnInit = function () {
        /*
        this.sub=this.route.queryParams.subscribe(
          (params:Params)=>{
            this.fsadfasdfas=params['min'];
            console.log(params);
            console.log(this.fsadfasdfas);
        });
    */
        //this.coustomfoods=this.route.paramMap.((params: ParamMap) =>this.fsadfasdfas=params.get()
        /*
            this.route.params
            .zip(this.route.data)
            .subscribe((value) => {
              this.id = value[0]["id"]; // get param
              this.data = value[1]; // get data value
            })
            */
        /*
        this.fsadfasdfas=this.route.params.subscribe(
         
    
          param=>{
          this.fsadfasdfas=param;
          console.log("param");
          console.log(param[0]['min']);
          //console.log(param.get('min'));
        }
        );*/
        console.log("=======================");
        console.log(this.fsadfasdfas);
    };
    FoodcustomComponent.prototype.ngOnDestroy = function () {
        this.sub.unsubscribe();
    };
    return FoodcustomComponent;
}());
__decorate([
    core_1.HostBinding('style.display'),
    __metadata("design:type", Object)
], FoodcustomComponent.prototype, "display", void 0);
__decorate([
    core_1.HostBinding('style.position'),
    __metadata("design:type", Object)
], FoodcustomComponent.prototype, "position", void 0);
FoodcustomComponent = __decorate([
    core_1.Component({
        selector: 'app-foodcustom',
        templateUrl: './foodcustom.component.html',
        styleUrls: ['./foodcustom.component.css']
    }),
    __metadata("design:paramtypes", [router_1.ActivatedRoute,
        router_1.Router])
], FoodcustomComponent);
exports.FoodcustomComponent = FoodcustomComponent;
//# sourceMappingURL=foodcustom.component.js.map