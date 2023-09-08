public class Opskrift {
    private Ingrediens[] ingrediensListe;
    private String opskriftNavn;
    private int antalPersoner;
    private final int oprindeligtAntalPersoner = 12;

    public Opskrift (String opskriftNavn) {
        Ingrediens æg = new Ingrediens("Æg", 3, "stk.", 180, 204);
        Ingrediens sukker = new Ingrediens("Sukker", 170, "g.", 170, 680);
        Ingrediens vaniljeSukker = new Ingrediens("Vaniljesukker", 2, "tsk.", 6.7, 26.13);
        Ingrediens hvedemel = new Ingrediens("Hvedemel", 125, "g.", 125, 446);
        Ingrediens bagepulver = new Ingrediens("Bagepulver", 1, "tsk.", 5, 8.5);
        Ingrediens smør = new Ingrediens("Smør", 100, "g.", 100, 800);
        Ingrediens mosedeBananer = new Ingrediens("Mosede bananer", 2, "stk.", 240, 196);
        Ingrediens overtrækChokolade = new Ingrediens("Overtræk chokolade", 100, "g.", 100, 549);

        ingrediensListe = new Ingrediens[]{æg, sukker, vaniljeSukker, hvedemel, bagepulver, smør, mosedeBananer, overtrækChokolade};
        this.opskriftNavn = opskriftNavn;
    }

    int totalVægt = 0;
    double totalKcal = 0;

    public void udskriv(int antalPersoner) {

        for (Ingrediens ingrediens : ingrediensListe) {
            System.out.println(ingrediens.getIngrediensType() + " " + ingrediens.getMængde() * antalPersoner / oprindeligtAntalPersoner + " " + ingrediens.getEnhed());
            System.out.println("Svarer til: " + ingrediens.getIngrediensVægt() * antalPersoner / oprindeligtAntalPersoner + " g. / " + Math.round(ingrediens.getKcal() * antalPersoner / oprindeligtAntalPersoner) + " kcal\n");
        }
    }

    public void totalVægtOgKcal(int antalPersoner){

        for (Ingrediens i : ingrediensListe) {
            totalVægt = totalVægt + (int) i.getIngrediensVægt() * antalPersoner / oprindeligtAntalPersoner;
            totalKcal = totalKcal + i.getKcal() * antalPersoner / oprindeligtAntalPersoner;
        }

        System.out.println("Den totale vægt er: " + Math.round(totalVægt) + " g.");
        System.out.println("Det totale energiindhold er: " + Math.round(totalKcal) + " kcal.");

        double gennemsnitVægt = totalVægt / ingrediensListe.length;
        double gennemsnitKcal = totalKcal / ingrediensListe.length;

        System.out.println("Den gennemsnitlige vægt pr. ingrediens er: " + Math.round(gennemsnitVægt) + " g.");
        System.out.println("Det gennemsnitlige kcal indhold pr. ingrediens er: " + Math.round(gennemsnitKcal) + " kcal.");
    }

    public double getTotalvægt(){
        return totalVægt;
    }

    public double getTotalKcal(){
        return totalKcal;
    }

    public void setAntalPersoner(int antalPersoner) {
        this.antalPersoner = antalPersoner;
    }
}

