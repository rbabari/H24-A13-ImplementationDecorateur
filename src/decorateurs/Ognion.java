// Decorateur Concret 1
public class Ognion extends Ingredient{
    public Ognion(Plat plat)
    {
        this.sur = plat;
    }

    @Override
    public double getPrix() {
        return sur.getPrix()  + 3.0;
    }
}
