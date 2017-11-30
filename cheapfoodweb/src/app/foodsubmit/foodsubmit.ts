export interface IFoodSubmit{
    id: number;
    name: string;
    mennyisegfajta: number;
    mennyiseg: string;
}

export class FoodSubmit implements IFoodSubmit{
    //implicit módon törtnéi a dolog
    constructor(public id: number,
                public name: string,
                public mennyiseg: string,
                public mennyisegfajta: number){
                }
}
