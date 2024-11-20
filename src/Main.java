import decorateurs.Oeuf;
import decorateurs.Ognion;
import components.Pizza_de_Base;
import utils.Plat;

// client
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        /*
        Client --- Main
        Component --- interface utils.Plat (methode getPrix()  )
        Concrete Component ---- class Pizza_de_base implements utils.Plat
        Base decorateur ---- abstract class Ingredients implement utils.Plat (protected utils.Plat sur)
        Concrete decorateur : class extends utils.Ingredient : decorateurs.Oeuf, Jambon, decorateurs.Ognion, ...

         Component c1 = new ConcreteDecorateur1(ConcrecteDecorateur2(ConcreteComponent()))
         utils.Plat p1 = new decorateurs.Ognion(new decorateurs.Oeuf(new Pizza_base()))
         */

        Plat p1 = new Pizza_de_Base();
        Plat p1PlusOeuf = new Oeuf(p1);


        Plat p2 = new Ognion(new Oeuf(new Pizza_de_Base()));

    }
}