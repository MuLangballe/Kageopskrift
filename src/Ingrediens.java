public class Ingrediens {
    private String ingrediensType;
    private double mængde;
    private String enhed;
    private double ingrediensVægt;
    private double kcal;
    //Ovenstående kan være final

    //Flere konstruktører (med forskellig parametre) er overloading.
    // LAV EN EKSTRA KONSTRUKTØR.

    public Ingrediens(String ingrediensType, double mængde, String enhed, double ingrediensVægt, double kcal){
        this.ingrediensType = ingrediensType;
        this.mængde = mængde;
        this.enhed = enhed;
        this.ingrediensVægt = ingrediensVægt;
        this.kcal = kcal;
    }

    public String getIngrediensType() {
        return ingrediensType;
    }

    public double getMængde() {
        return mængde;
    }

    public String getEnhed() {
        return enhed;
    }

    public double getIngrediensVægt() {
        return ingrediensVægt;
    }

    public double getKcal() {
        return kcal;
    }
}

