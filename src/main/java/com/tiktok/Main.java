package com.tiktok;

public class Main {
    public static void main(String[] args) {
        Vehicule maVoiture = new Voiture();
        Vehicule maMoto = new Moto();
        maVoiture.acceler(100);
        maMoto.acceler(10);
        maVoiture.roule();
        maMoto.roule();
        System.out.println(maVoiture instanceof Vehicule);
        System.out.println(maMoto instanceof Vehicule);
        System.out.println(maMoto instanceof Voiture);
    }
    
}
