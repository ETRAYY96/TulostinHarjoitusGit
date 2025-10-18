public class Tulostin {
    public static void main(String[] args) {
        
        //Muuttujat
        String tekija = "Mikael Linden";
        double luku1 = 6;
        double luku2 = 2;
        double tulo = luku1 * luku2;
        double erotus = luku1 - luku2;
        double summa = luku1 + luku2;
        double jako = luku1 / luku2; 

         //Ohjelman tekijä
        System.out.println("Hei olen Tulostin-ohjelma");
        System.out.print("Ohjelman tekijä: ");
        System.out.println(tekija);

          //Muuttujien arvot
        System.out.println("Luku1-muuttujan arvo on " + luku1);
        System.out.println("Luku2-muuttujan arvo on " + luku2);

         //Laskujen tulokset
        System.out.println(luku1 + " * " + luku2 + " = " + tulo);
        System.out.println(luku1 + " - " + luku2 + " = " + erotus);
        System.out.println(luku1 + " + " + luku2 + " = " + summa);
        System.out.println(luku1 + " / " + luku2 + " = " + jako);
    }
}
