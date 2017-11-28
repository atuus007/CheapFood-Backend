export interface IFoodSubmit{
    nev: string;
    osszetevok: string;
    mennyiseg: string;
    ar: number;
}

export class FoodSubmit implements IFoodSubmit{
    //implicit módon törtnéi a dolog
    constructor(public nev: string,
                public osszetevok: string,
                public mennyiseg: string,
                public ar: number){

                }
}
