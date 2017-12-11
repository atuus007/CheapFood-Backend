import { Component, OnInit,HostBinding, OnDestroy } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';
import { Subscription } from 'rxjs/Subscription';
import { Params } from '@angular/router/src/shared';
@Component({
  selector: 'app-foodcustom',
  templateUrl: './foodcustom.component.html',
  styleUrls: ['./foodcustom.component.css']
})
export class FoodcustomComponent implements OnInit, OnDestroy {

  
  @HostBinding('style.display')   display = 'block';
  @HostBinding('style.position')  position = 'absolute';
  private sub: Subscription;
  coustomfoods: Observable<any>;
  constructor(
    private route: ActivatedRoute,
    private router: Router
  ) { }
  fsadfasdfas:any;
  ngOnInit() {
    /*
    this.sub=this.route.queryParams.subscribe(
      (params:Params)=>{
        this.fsadfasdfas=params['min'];
        console.log(params);
        console.log(this.fsadfasdfas);
    });
*/



    //this.coustomfoods=this.route.paramMap.((params: ParamMap) =>this.fsadfasdfas=params.get()
/*
    this.route.params
    .zip(this.route.data)
    .subscribe((value) => {
      this.id = value[0]["id"]; // get param
      this.data = value[1]; // get data value
    })
    */
    /*
    this.fsadfasdfas=this.route.params.subscribe(
     

      param=>{
      this.fsadfasdfas=param;
      console.log("param");
      console.log(param[0]['min']);
      //console.log(param.get('min'));
    }
    );*/
    console.log("=======================");
    console.log(this.fsadfasdfas);

  }
  ngOnDestroy(): void {
    this.sub.unsubscribe();
  }

}
