import { Component, OnInit } from '@angular/core';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from '../app.component';
import { FormGroup, FormControl, Validators, FormArray, FormBuilder } from '@angular/forms';
import { NgForm } from '@angular/forms';
import { FoodSubmit,HozzavaloSubmit } from './foodsubmit'
import { FoodSubmitService } from '../shared/foodSubmitService';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { FoodlistallComponent } from '../etelek/foodlistall/foodlistall.component';

@Component({
  selector: 'foodsubmit',
  templateUrl: `./foodsubmit.html`,
})


export class foodsubmitComponent implements OnInit {
  hozzavalokszama: number[] = [];

  public foodForm: FormGroup; //pipa

  constructor(private _fb: FormBuilder, private _foodService: FoodSubmitService) { }//pipa

  //nev: string;
  //osszetevok: string;
  //mennyiseg: number;
  mennyisegselect: string;
  valami: HozzavaloSubmit[]=[];
  myFood: FoodSubmit;
  ngOnInit(): void {

    //this.hozzavalokszama = Array(10).fill(0).map((x, i) => i + 1);

    this.foodForm = this._fb.group({
      name: ['',[Validators.required, Validators.minLength(5)]],
      ingredientsList: this._fb.array([])
    });//pipa


    this.addHozzavalok(); //pipa
    console.log("ngOnInit "+this.foodForm);

  }
  initHozzavalok() {
    console.log("initHozzavalok "+this.foodForm);

    return this._fb.group({
      name: ['',[Validators.required]],
      mennyiseg: ['',[Validators.required]],
      atlagar: ['',[Validators.required]],
      mennyisegfajta: ['']
    });

  }
  addHozzavalok() { //pipa

    const control = <FormArray>this.foodForm.controls['ingredientsList'];

    const hozzvCtrl = this.initHozzavalok();
    console.log("addHozzavalok: " +this.foodForm);
    control.push(hozzvCtrl);
    console.log("addHozzavalok: " + control.length);
    console.log("control: " + control);
  }
  deleteHozzavalok(i: number) {
    /*
    const control = <FormArray>this.foodForm.controls['ingredientsList'];
    
    console.log("Deleted: " + i);
    control.removeAt(i);
*/
  }
  save(): void {


    console.log("form: "+this.foodForm.get('name').value);
    console.log(this.foodForm.get('ingredientsList').value);
    this.myFood =new FoodSubmit(this.foodForm.get('name').value,this.foodForm.get('ingredientsList').value);
    console.log("Name: "+this.myFood.getName());
    console.log(this.myFood.getIngredientsList());
    this._foodService.saveFoodWithThings();


      /*
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
      );
      console.log("Result "+this.foodsList3.length);
      */
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
