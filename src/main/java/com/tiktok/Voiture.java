package com.tiktok;

public class Voiture implements Vehicule {

    @Override
    public void roule() {
        System.err.println("La voiture roule à 4 roues");
    }

    @Override
    public void arrete() {
        System.err.println("La voiture s'arrète");
    }

    @Override
    public void acceler(int vitesse) {
        System.err.println("La voiture accelere à "+ vitesse + " km/h");
    }

}
