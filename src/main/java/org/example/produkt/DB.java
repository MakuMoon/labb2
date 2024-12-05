package org.example.produkt;

public class DB {
    public static void main(String[] args) {
        // Create some Produkt objects
        Produkt produkt1 = new Produkt("Laptop", "En kraftfull och smidig bärbar dator.", 10, 12000, 1);
        Produkt produkt2 = new Produkt("Smartphone", "En ny smartphone med hög prestanda.", 5, 8000, 2);
        Produkt produkt3 = new Produkt("Hörlurar", "Ljudisolerande hörlurar med utmärkt ljudkvalitet.", 0, 1500, 3);
        Produkt produkt4 = new Produkt("Musmatta", "En stor och hållbar musmatta.", 20, 200, 4);
        Produkt produkt5 = new Produkt("Skärm", "En 27-tums 4K-skärm för professionellt bruk.", 7, 5000, 5);

        // Display data for each product and check availability
        Produkt[] produkter = {produkt1, produkt2, produkt3, produkt4, produkt5};
        for (Produkt produkt : produkter) {
            System.out.println("Produkt ID: " + produkt.id);
            System.out.println("Namn: " + produkt.namn);
            System.out.println("Beskrivning: " + produkt.beskrivning);
            System.out.println("Pris: " + produkt.pris + " kr");
            System.out.println("Lagerantal: " + produkt.lagerAntal);
            System.out.println("Är tillgänglig: " + (produkt.ärTillgänglig() ? "Ja" : "Nej"));
            System.out.println("----------------------------------------");
        }
    }
}
