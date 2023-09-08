import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) {
        System.out.println(ANSI_YELLOW + "Her er den! Opskriften på den BEDSTE banankage" + ANSI_RESET);
        System.out.println("Angiv antal personer: ");
        Scanner personerInput = new Scanner(System.in);
        int antalPersoner = personerInput.nextInt();

        Opskrift banankage = new Opskrift("Banankage");
        banankage.udskriv(antalPersoner);
        banankage.totalVægtOgKcal(antalPersoner);
    }

    }
