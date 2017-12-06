import { Component, OnInit } from '@angular/core';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from '../app.component';
import { FormGroup , FormControl,Validators  } from '@angular/forms';
import { NgForm } from '@angular/forms';
import { IFoodSubmit, FoodSubmit }from './foodsubmit'
import { FoodSubmitService } from '../shared/foodSubmitService';

@Component({
  selector: 'foodsubmit',
  templateUrl: `./foodsubmit.html`,
})


export class foodsubmitComponent implements OnInit {
  ngOnInit(): void {
    /*
    this._foodService.getFood()
    .subscribe(foods => { this.foodsList = foods;},
               error => this.errorMessage=<any>error
    );*/
  }


  nev: string;
  osszetevok: string;
  mennyiseg: number;
  mennyisegselect: string;
  ar: number;
  osszetevok2: string;
  mennyiseg2: number;
  mennyisegselect2: string;
  osszetevok3: string;
  mennyiseg3: number;
  mennyisegselect3: string;
  osszetevok4: string;
  mennyiseg4: number;
  mennyisegselect4: string;
  osszetevok5: string;
  mennyiseg5: number;
  mennyisegselect5: string;
  errorMessage: string;
  edited:boolean = true;
  edited2:boolean = true;
  edited3:boolean = true;
  edited4:boolean = true;
  gombeltunt:boolean = false;
  gombeltunt2:boolean = true;
  gombeltunt3:boolean = true;
  gombeltunt4:boolean = true;
  gombeltunt2:boolean = true;
  gombeltunt3:boolean = true;
  gombeltunt4:boolean = true;
  maxingrediements:boolean = true;
  foodsList: IFoodSubmit[]=[];
  foodsList3: IFoodSubmit[]=[];
  foodsList2: FoodSubmit =
    {

      "name":"AAAAAAAAAAAA",
      "mennyiseg":30,
      "mennyisegfajta":3
    };
    newIngredient(){
      console.log("2. Ingredient added");
    this.edited= false;
   return this.edited;
    }
    newIngredient2(){
      console.log("3. Ingredient added");
    this.edited2= false;
   return this.edited2;
    }
    newIngredient3(){
      console.log("4. Ingredient added");
    this.edited3= false;
   return this.edited3;
    }
    newIngredient4(){
      console.log("5. Ingredient added");
    this.edited4= false;
   return this.edited4;
    }

    buttonHide(){
      console.log("Gomb Eltuntetve");
      this.gombeltunt = true;
      return this.gombeltunt;
    }
    buttonHide2(){
      console.log("Gomb Eltuntetve");
      this.gombeltunt2 = true;
      return this.gombeltunt2;
    }
    buttonHide3(){
      console.log("Gomb Eltuntetve");
      this.gombeltunt3 = true;
      return this.gombeltunt3;
    }
    buttonHide4(){
      console.log("Gomb Eltuntetve");
      this.gombeltunt4 = true;
      return this.gombeltunt4;
    }
    newbutt(){
      console.log("2.Gomb feljelent");
      this.gombeltunt2=false;
      return this.gombeltunt2;
    }
    newbutt2(){
      console.log("3.Gomb feljelent");
      this.gombeltunt3=false;
      return this.gombeltunt3;
    }

    newbutt3(){
      console.log("4.Gomb feljelent");
      this.gombeltunt4=false;
      return this.gombeltunt4;
    }

    MaxIng(){
      console.log("Maximum összetevő elérve!");
      this.maxingrediements = false;
      return this.maxingrediements;
    }
  constructor(private _foodService: FoodSubmitService){}
  onSubmit(): void{
    if(!this.osszetevok2){
      console.log("SSS: "+this.nev+" "+this.osszetevok+" "+this.mennyiseg+" "+this.mennyisegselect+" "+this.ar);
      this.foodsList.push();


      //console.log("SSS: "+this.nev+" "+this.osszetevok+" "+this.mennyiseg+" "+this.mennyisegselect+"  "+this.ar);
  }else if(!this.osszetevok3){
    console.log("SSS: "+this.nev+" "+this.osszetevok+" "+this.mennyiseg+" "+this.mennyisegselect+" "+this.osszetevok2+" "+this.mennyiseg2+" "+this.mennyisegselect2+" "+this.ar);
    this.foodsList.push();


  //  console.log("SSS: "+this.nev+" "+this.osszetevok+" "+this.mennyiseg+" "+this.mennyisegselect+" "+this.osszetevok2+" "+this.mennyiseg2+" "+this.mennyisegselect2+" "+this.ar);
}else if(!this.osszetevok4){

    console.log("SSS: "+this.nev+" "+this.osszetevok+" "+this.mennyiseg+" "+this.mennyisegselect+" "+this.osszetevok2+" "+this.mennyiseg2+" "+this.mennyisegselect2+" "+this.osszetevok3+" "+this.mennyiseg3+" "+this.mennyisegselect3+" "+this.ar);
    this.foodsList.push();


  //  console.log("SSS: "+this.nev+" "+this.osszetevok+" "+this.mennyiseg+" "+this.mennyisegselect+" "+this.osszetevok2+" "+this.mennyiseg2+" "+this.mennyisegselect2+" "+this.osszetevok3+" "+this.mennyiseg3+" "+this.mennyisegselect3+" "+this.ar);
}else if(!this.osszetevok5){

    console.log("SSS: "+this.nev+" "+this.osszetevok+" "+this.mennyiseg+" "+this.mennyisegselect+" "+this.osszetevok2+" "+this.mennyiseg2+" "+this.mennyisegselect2+" "+this.osszetevok3+" "+this.mennyiseg3+" "+this.mennyisegselect3+" "+this.osszetevok4+" "+this.mennyiseg4+" "+this.mennyisegselect4+" "+this.ar);
    this.foodsList.push();


  //  console.log("SSS: "+this.nev+" "+this.osszetevok+" "+this.mennyiseg+" "+this.mennyisegselect+" "+this.osszetevok2+" "+this.mennyiseg2+" "+this.mennyisegselect2+" "+this.osszetevok3+" "+this.mennyiseg3+" "+this.mennyisegselect3+" "+this.ar);
  }else if(this.osszetevok5){

      console.log("SSS: "+this.nev+" "+this.osszetevok+" "+this.mennyiseg+" "+this.mennyisegselect+" "+this.osszetevok2+" "+this.mennyiseg2+" "+this.mennyisegselect2+" "+this.osszetevok3+" "+this.mennyiseg3+" "+this.mennyisegselect3+" "+this.osszetevok4+" "+this.mennyiseg4+" "+this.mennyisegselect5+" "+this.osszetevok5+" "+this.mennyiseg5+" "+this.mennyisegselect5+" "+this.ar);
      this.foodsList.push();


    //  console.log("SSS: "+this.nev+" "+this.osszetevok+" "+this.mennyiseg+" "+this.mennyisegselect+" "+this.osszetevok2+" "+this.mennyiseg2+" "+this.mennyisegselect2+" "+this.osszetevok3+" "+this.mennyiseg3+" "+this.mennyisegselect3+" "+this.ar);
    }


////////////////////////////////
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
      );*/
      console.log("Result "+this.foodsList3.length);
  }

  getFoods(): void{


    this._foodService.getFood()
    .subscribe(foods => { this.foodsList = foods;},
               error => this.errorMessage=<any>error
    );
    console.log("AAA: "+this.foodsList.length);
    //console.log(this.foodsList[0].name);
    //console.log(this.foodsList[0].mennyiseg);
  }



































//newFoodForm= new ngForm;
/*constructor(nev: string, osszetevok: string, mennyiseg: string,
   ar: number) {
   this.nev = nev;
   this.osszetevok = osszetevok;
   this.mennyiseg = mennyiseg;
   this.ar = ar;
 }
 onSubmit(form: newFoodForm) {
    if (form.valid) {
      console.log(form.value);
    }



  onSubmit(form: newFoodForm) {
    if (form.valid) {
      console.log(form.value);
    }
  }*/
 }
