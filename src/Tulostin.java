public class Tulostin {
    public static void main(String[] args) {

        String tekija = "Mikael Linden";
        int luku1 = 5;
        int luku2 = 2;

        System.out.println("Hei olen Tulostin-ohjelma");
        System.out.print("Ohjelman tekijä: ");
        System.out.println(tekija);

        System.out.println("Luku1-muuttujan arvo on " + luku1);
        System.out.println("Luku2-muuttujan arvo on " + luku2);

        int tulo = luku1 * luku2;
        int erotus = luku1 - luku2;
        int summa = luku1 + luku2;
        int jako = luku1 / luku2; 

        System.out.println(luku1 + " * " + luku2 + " = " + tulo);
        System.out.println(luku1 + " - " + luku2 + " = " + erotus);
        System.out.println(luku1 + " + " + luku2 + " = " + summa);
        System.out.println(luku1 + " / " + luku2 + " = " + jako);
    }
}
