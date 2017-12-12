import { Component, OnInit } from '@angular/core';
import { FoodSubmitService } from '../shared/foodSubmitService';
import { FoodSubmit } from '../foodsubmit/foodsubmit';
import { IngrediensRespons } from '../shared/ingredients.response';
import { FoodResoponse } from '../shared/food.response';

@Component({
  selector: 'app-foodsearch',
  templateUrl: './foodsearch.component.html',
//  styleUrls: ['./foodsearch.component.css']
})
export class FoodsearchComponent implements OnInit {
  selectedRow:number;
  search:string;
  request:string;
  name:string;
  foodresult: FoodResoponse[]=[];
  foodresult2: FoodResoponse[]=[];
  ingRes: IngrediensRespons[]=[];
  constructor(private foodService: FoodSubmitService) { }

  ngOnInit() {
   
  }
  keres(){

    this.foodService.findfoodByName(this.search).subscribe(
      foods => {
          
          this.foodresult2 = foods;
          console.log("Res: ");
          console.log(foods);
        },
      error => {console.log(<any>error);}
    );
 
    //this.name=this.foodresult.getName();
   // console.log("===================================7");
   console.log("AAA: ");
    console.log(this.foodresult2);
   // console.log("===================================7");
  }
  keresHozzavalo(i: number, index:number){
    /*
    console.log("id: "+i+" index: "+index);
    this.foodService.getIngredientsById(i).subscribe(
      ingrediens => { this.ingRes = ingrediens;},
      error => {console.log(<any>error);}
    );
    this.selectedRow=index;
    */
  }
  
}
