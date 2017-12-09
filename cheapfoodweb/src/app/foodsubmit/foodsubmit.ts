export interface FoodSubmit {

    nev: string;
    hozzavalok: HozzavaloSubmit[];
}

export interface HozzavaloSubmit {
    
        name: string;
        mennyiseg: number;
        atlagar: number;
        mennyisegfajta: number;
    }
