import { Component, OnInit } from '@angular/core';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from '../app.component';
import { FormGroup, FormControl, Validators, FormArray, FormBuilder } from '@angular/forms';
import { NgForm } from '@angular/forms';
import { IFoodSubmit, FoodSubmit } from './foodsubmit'
import { FoodSubmitService } from '../shared/foodSubmitService';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'foodsubmit',
  templateUrl: `./foodsubmit.html`,
})


export class foodsubmitComponent implements OnInit {
  hozzavalokszama: number[] = [];
  public foodForm: FormGroup;
  constructor(private _fb: FormBuilder) { }

  //nev: string;
  //osszetevok: string;
  //mennyiseg: number;
  mennyisegselect: string;

  ngOnInit(): void {
    //this.hozzavalokszama = Array(10).fill(0).map((x, i) => i + 1);
    this.foodForm = this._fb.group({
      nev: ['', [Validators.required]],
      hozzavalok: this._fb.array([])
    });
    this.addHozzavalok();
  }
  initHozzavalok() {
    return this._fb.group({
      osszetevok: [''],
      mennyiseg: [''],
      mennyisegselect: ['']
    });
  }
  addHozzavalok() {
    const control = <FormArray>this.foodForm.controls['hozzavalok'];

    const hozzvCtrl = this.initHozzavalok();

    control.push(hozzvCtrl);
    console.log("AAAAAAA: " + control.length);
  }
  deleteHozzavalok(i: number) {
    const control = <FormArray>this.foodForm.controls['hozzavalok'];
    console.log("Deleted: " + i);
    control.removeAt(i);
  }
  saveFood(model: FoodSubmit): void {


      console.log("AA: "+model.nev);
      console.log("AA: "+model.hozzavalok[0].osszetevok);
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
    console.log("FAAAAAAAAASZ:");
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
