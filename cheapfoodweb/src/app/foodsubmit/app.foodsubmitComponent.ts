import { Component } from '@angular/core';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from '../app.component';
import { FormGroup , FormControl,Validators  } from '@angular/forms';
import { NgForm } from '@angular/forms';
import { IFoodSubmit }from './foodsubmit'

@Component({
  selector: 'foodsubmit',
  templateUrl: `./foodsubmit.html`,
})


export class foodsubmitComponent  {
 

  nev: string;
  osszetevok: string;
  mennyiseg: string;
  ar: number;
  foodsList: IFoodSubmit[];
  onSubmit(): void{
      console.log("SSS: "+this.nev+" "+this.osszetevok+" "+this.mennyiseg+" "+this.ar);
      this.foodsList.push({"nev": this.nev, "osszetevok": this.osszetevok,"mennyiseg":this.mennyiseg,"ar": this.ar});

      
      console.log("SSS: "+this.nev+" "+this.osszetevok+" "+this.mennyiseg+" "+this.ar+" tomb: "+this.foodsList.length);
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
