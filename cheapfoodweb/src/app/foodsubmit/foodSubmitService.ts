import { Injectable } from "@angular/core";
import { IFoodSubmit, FoodSubmit } from "./foodsubmit";
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable } from "rxjs/Observable";
import 'rxjs/add/observable/throw';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/do';

@Injectable()
export class FoodSubmitService{
    private _foodUrl='api/food/foodslist';
    constructor(private httpClient: HttpClient) {}
    getFood(): Observable<IFoodSubmit[]>{
        //ird át a Ifoodot hogy jól mappolja össze
        console.log("AAAAAAAAAAAAAAAAAAAAAAAa");
        return this.httpClient.get<IFoodSubmit[]>(this._foodUrl)
        .do(data=>console.log("All: "+JSON.stringify(data)))
        .catch(this.handleError);

    }
    private handleError(err: HttpErrorResponse){
        console.log(err.message);
        return Observable.throw(err.message);
        
    }

}