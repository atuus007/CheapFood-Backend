import { Component,OnInit } from '@angular/core';
import { FoodResoponse } from '../../shared/food.response';
import { FoodSubmitService } from '../../shared/foodSubmitService';

@Component({
  selector: 'f8',
  templateUrl: `./foodlist800.html`,
})
export class foodlist800Component  implements OnInit{
  asdf: FoodResoponse[]=[];
  constructor(private foodService: FoodSubmitService) {}
  ngOnInit(): void {
    this.foodService.findfoodBymoney(800,1000).subscribe(
      foods => { this.asdf = foods;},
      error => {console.log(<any>error);}
    );
  }
  findIngById(id: number, index:number): void{
    console.log(id+" "+index);
    
  }
  
 }
