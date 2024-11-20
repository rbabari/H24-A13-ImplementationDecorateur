package decorateurs;

import utils.Ingredient;
import utils.Plat;

// Decorateur Concret 1
public class Tomate extends Ingredient {
    public Tomate(Plat plat)
    {
        this.sur = plat;
    }

    @Override
    public double getPrix() {
        return sur.getPrix()  + 1.0;
    }
}
