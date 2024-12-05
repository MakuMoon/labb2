package org.example.produkt;

public class Produkt {
    int id;
    int pris;
    int lagerAntal;
    String beskrivning;
    String namn;

    public Produkt(String namn, String beskrivning, int lagerAntal, int pris, int id) {
        this.namn = namn;
        this.beskrivning = beskrivning;
        this.lagerAntal = lagerAntal;
        this.pris = pris;
        this.id = id;
    }

    public boolean ärTillgänglig() {
        return lagerAntal > 0;
    }

}


