export interface IFoodSubmit{
    id: number;
    name: string;
    mennyiseg: number;
    mennyisegfajta: number;
}

export class FoodSubmit implements IFoodSubmit{
    //implicit módon törtnéi a dolog
    constructor(public id: number,
                public name: string,
                public mennyiseg: number,
                public mennyisegfajta: number){
                }
}
