import { HozzavalokComponent } from "./hozzavalokComponent";

export class FoodSubmit {

    private name: string;

    private ingredientsList: HozzavaloSubmit[];
    constructor(n: string, ingList: HozzavaloSubmit[]) {
        this.name = n;
        this.ingredientsList = ingList;
    }
    public setName(n: string): void {
        this.name = n;
    }
    public setIngredients(ing: HozzavaloSubmit[]): void {
        this.ingredientsList = ing;
    }
    public getName(): string {
        return this.name;
    }
    public getIngredientsList(): HozzavaloSubmit[] {
        return this.ingredientsList;
    }
}

export class HozzavaloSubmit {
    name: string;
    atlagar: number;
    mennyiseg: number;
    mennyisegfajta: number;
}
