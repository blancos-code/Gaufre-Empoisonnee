package Modele;

import java.io.Serializable;

public class Coup implements Serializable {
    int i, j;
    int old_valeur;
    int new_valeur;

    public Coup(int i, int j, int old_valeur, int new_valeur) {
        this.i = i;
        this.j = j;
        this.old_valeur = old_valeur;
        this.new_valeur = new_valeur;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public int getOldValeur() {
        return old_valeur;
    }

    public int getNewValeur() {
        return new_valeur;
    }

    public String toString(){
        return getI() + "," + getJ() + ":" + getOldValeur() + ">" + getNewValeur();
    }

    public void affiche() {
        System.out.println("Coup : (" + getI() + ", " + getJ() + ") : " + getOldValeur() + " -> " + getNewValeur());
    }
}
