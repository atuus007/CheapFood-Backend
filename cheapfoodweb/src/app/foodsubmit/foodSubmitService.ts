import { Injectable } from "@angular/core";
import {  FoodSubmit } from "./foodsubmit";
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable } from "rxjs/Observable";
import 'rxjs/add/observable/throw';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/do';

@Injectable()
export class FoodSubmitService{
    private _foodUrl='http://localhost:8080/api/food/foodslist';
    private _ingredientUrl='http://localhost:8080/api/ingredients/ingredients';
    constructor(private httpClient: HttpClient) {}
	/*
    getFood(): Observable<FoodSubmit[]>{
        //ird át a Ifoodot hogy jól mappolja össze
        console.log("AAAAAAAAAAAAAAAAAAAAAAAa");
        return this.httpClient.get<IFoodSubmit[]>(this._foodUrl)
        .do(data=>console.log("All: "+JSON.stringify(data)))
        .catch(this.handleError);

    }
    */

    private handleError(err: HttpErrorResponse){
        console.log(err.message);
        return Observable.throw(err.message);
        
    }

}