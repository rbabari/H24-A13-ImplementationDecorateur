package decorateurs;

import utils.Ingredient;
import utils.Plat;

// Decorateur Concret 1
public class Oeuf extends Ingredient {
    public Oeuf(Plat plat)
    {
        this.sur = plat;

        // Dans le cas d'une pizza au oeufs
        // dans le main on crer un l'objet utils.Plat p1 = new decorateurs.Oeuf(new Pizza_Base())
        // L'objet pizza_de_base va etre donnée comme parametre au constructeur de decorateurs.Oeuf()
        // Et il va etre enregistré dans le parametre (sur)
    }

    @Override
    public double getPrix() {
        return sur.getPrix()  + 2.0;
    }
}
