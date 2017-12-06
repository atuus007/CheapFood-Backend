export interface FoodSubmit {

    name: string;
    hozzavalok: HozzavaloSubmit[];
}

export interface HozzavaloSubmit {
    
        osszetevok: string;
        mennyiseg: number;
        mennyisegselect: number;
    }
