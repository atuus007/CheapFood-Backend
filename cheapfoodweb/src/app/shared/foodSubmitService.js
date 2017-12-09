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
var http_1 = require("@angular/common/http");
//import { Http, Response, Headers, RequestOptions } from '@angular/http';
var Observable_1 = require("rxjs/Observable");
require("rxjs/add/observable/throw");
require("rxjs/add/operator/catch");
require("rxjs/add/operator/do");
//import { catchError, map, tap } from 'rxjs/operators';
var httpOptions = {
    headers: new http_1.HttpHeaders({ 'Content-Type': 'application/json' })
};
var FoodSubmitService = (function () {
    function FoodSubmitService(httpClient) {
        this.httpClient = httpClient;
        this._foodBaseUrl = 'http://localhost:8080/api/food';
        this._ingredientUrl = 'http://localhost:8080/api/ingredients/ingredients';
        this._saveFoodThings = 'http://localhost:8080/api/food/savefoodwithings';
    }
    /*
    getFood(): Observable<IFoodSubmit[]>{
        const url=`${this._foodBaseUrl}/foodslist`;
        //ird át a Ifoodot hogy jól mappolja össze
        console.log("getFood AAAAAAAAAAAAAAAAAAAAAAAA");
        return this.httpClient.get<IFoodSubmit[]>(url)
        .do(data=>console.log("All: "+JSON.stringify(data)))
        .catch(this.handleError);

    }
    */
    FoodSubmitService.prototype.handleError = function (err) {
        console.log(err.message);
        return Observable_1.Observable.throw(err.message);
    };
    FoodSubmitService.prototype.saveFoodWithThings = function (foodThings) {
        var url = 'http://localhost:8080/api/food/savefoodwithings';
        console.log("AAAAAAAAAAAAAAAAAAAAAAA");
        var body = {
            name: foodThings.getName(),
            ingredientsList: foodThings.getIngredientsList()
        };
        console.log("1: ");
        console.log(body);
        console.log("2: ");
        console.log(JSON.stringify(foodThings));
        return;
        /*
      console.log("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
      return this.httpClient.post(url, JSON.stringify(foodThings))
      .do(data=>console.log("All: "+JSON.stringify(data)))
      .catch(this.handleError);*/
    };
    FoodSubmitService.prototype.createFood = function (food) {
        //let headers=new Headers({'Content-Type':'applocation/json'});
        //let options = new RequestOptions({ headers: headers });
        var url = 'http://localhost:8080/api/food/savefood';
        /*
         console.log("createFood AAAAAA: "+food.name+" "+food.mennyiseg);
         
         const body={
             
             name:food.name,
             mennyiseg:food.mennyiseg,
             mennyisegfajta:food.mennyisegfajta
           };
         */
        //let options=new RequestOptions({headers: headers});
        /*
        return this.httpClient.post(url, JSON.stringify(food))
        .do(data=>console.log("All: "+JSON.stringify(data)))
        .catch(this.handleError);*/
        //const p=this.httpClient.post<FoodSubmit>(url, food, httpOptions)
        //.map((res: Response)=>res.json())
        /*.do(data=>console.log("Create Food response: "+JSON.stringify(data)))*/
        //.catch(this.handleError); this.httpClient.post(url, body)
        //console.log("createFood AAAAAA: "+p);ű
        /*
        const req=this.httpClient.post(url, body).subscribe(
        res=>{
            console.log(res);
        },
        err=>{
            console.log("Error occured");
        }
        );*/
        /*
        return this.httpClient.post(url, body)
        .do(data=>console.log("All: "+JSON.stringify(data)))
        .catch(this.handleError);
        */
        return;
        /*
        .do(map((hero: FoodSubmit) => console.log(`added hero w/ id=${hero.id}`)),
            catchError(this.handleError)
          );
          */
    };
    return FoodSubmitService;
}());
FoodSubmitService = __decorate([
    core_1.Injectable(),
    __metadata("design:paramtypes", [http_1.HttpClient])
], FoodSubmitService);
exports.FoodSubmitService = FoodSubmitService;
//# sourceMappingURL=foodSubmitService.js.map