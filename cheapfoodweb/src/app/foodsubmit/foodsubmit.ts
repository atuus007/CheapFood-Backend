export interface FoodSubmit {

    nev: string;
    hozzavalok: HozzavaloSubmit[];
}

export interface HozzavaloSubmit {
    
        osszetevok: string;
        mennyiseg: number;
        mennyisegselect: number;
    }
