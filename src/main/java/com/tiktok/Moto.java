package com.tiktok;

public class Moto implements Vehicule {
    @Override
    public void roule() {
        System.err.println("La mot roule à 2 roues");
    }

    @Override
    public void arrete() {
        System.err.println("La moto s'arrète");
    }

    @Override
    public void acceler(int vitesse) {
        System.err.println("La moto accelere à "+ vitesse + " km/h");
    }
}
