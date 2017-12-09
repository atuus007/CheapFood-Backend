import { Component, OnInit } from '@angular/core';
import { FoodResoponse } from '../../shared/food.response';
import { FoodSubmitService } from '../../shared/foodSubmitService';

@Component({
  selector: 'fall',
  templateUrl: './foodlistall.component.html',

})
export class FoodlistallComponent implements OnInit {

  constructor(private foodService: FoodSubmitService) {
    console.log("export class FoodlistallComponent implements OnInit");
   }
   asdf: FoodResoponse[]=[];
  ngOnInit() {
    this.foodService.getAllFoods().subscribe(
      foods => { this.asdf = foods;},
      error => {console.log(<any>error);}
    );
   // console.log(this.asdf[0].getId());
  }
  findIngById(id: number): void{
    console.log(id);
  }
  getFoods(): void {


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
      }
}
