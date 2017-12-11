import { Component,OnInit } from '@angular/core';
import { FoodResoponse } from '../../shared/food.response';
import { FoodSubmitService } from '../../shared/foodSubmitService';

@Component({
  selector: 'f2',
  templateUrl: "./foodlist200.html",
})
export class foodlist200Component implements OnInit{
  asdf: FoodResoponse[]=[];
  constructor(private foodService: FoodSubmitService) {}
  ngOnInit(): void {
    this.foodService.findfoodBymoney(200,400).subscribe(
      foods => { this.asdf = foods;},
      error => {console.log(<any>error);}
    );
  }
  findIngById(id: number, index:number): void{
    console.log(id+" "+index);
    
  }
  
 }