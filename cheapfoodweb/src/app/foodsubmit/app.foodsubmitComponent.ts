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

  constructor(private _fb: FormBuilder) { }//pipa

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
  save(/*model: FoodSubmit */): void {

    //alert(model.value['name']);
    //alert(model.controls['addresses'].value['street']);
    //console.log("MODEL: "+model);
    //console.log("save: " + this.foodForm);
    //alert("AAA: "+model.hozzavalok[0]);
    //let json=JSON.parse(model);
    //console.log(model);
    console.log("==============================================================");
    console.log("form: "+this.foodForm.get('name').value);
    console.log(this.foodForm.get('ingredientsList').value);
    //this.myFood.name=this.foodForm.get('name').value;
    //console.log("foodname: "+this.myFood.name);
    //this.myFood.ingredientsList=this.foodForm.get('ingredientsList').value;
    //console.log(this.myFood.name);
    //console.log(this.myFood.ingredientsList[0].ingName+" "+this.myFood.ingredientsList[0].atlagar+" "+this.myFood.ingredientsList[0].mennyiseg);
    this.valami=this.foodForm.get('ingredientsList').value;

    console.log(this.valami[0].name+" "+this.valami[0].atlagar+" "+this.valami[0].mennyiseg);
    //console.log(this.valami[1].name+" "+this.valami[1].atlagar);

   // this.myFood.name
    console.log("==============================================================");

  //  alert("AAA: "+model.value['name']);
  //  alert("CCC: "+model.value['addresses'][0]);
  //  alert("BBB: "+this.myForm.value['name']);
///////////////////////////
  //console.log(this.searchForm.get('properties').at(0).value);
  ////////////////////////
    //alert("save: " + this.foodForm);
    //alert("save:foodname: " + this.foodForm.get('name'));
    //alert("save:fdasdfadsdfdas " + this.foodForm.get('ingredientsList').get('name'));
    //alert("this.foodForm.value['name']: "+this.foodForm.value['name']);
    //alert("this.foodForm.value['ingredientsList'] "+this.foodForm.value['ingredientsList']);
    //alert("this.foodForm.value['ingredientsList'] "+this.foodForm.value['ingredientsList'].value());
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
