import { Injectable } from "@angular/core";
import { IFoodSubmit, FoodSubmit } from "./foodsubmit";
import { HttpClient } from "@angular/common/http";
@Injectable()
export class FoodSubmitService{
    private _foodUrl='http://localhost:8080/api/food/foodslist';
    constructor(private _http: HttpClient){}



    getFoods(){
        //ird át a Ifoodot hogy jól mappolja össze
        return this._http.get<IFoodSubmit[]>(this._foodUrl);

    }
}