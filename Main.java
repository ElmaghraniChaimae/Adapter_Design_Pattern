package org.elmaghrani;

import org.elmaghrani.ancienne.AncienneInterface;
import org.elmaghrani.ancienne.ImplAncienneInterface;
import org.elmaghrani.nouvelle.Adaptateur;
import org.elmaghrani.nouvelle.NouvelleInterface;

public class Main {
    public static void main(String[] args) {
        // Création d'une instance de l'Ancienne Interface
        AncienneInterface ancienneInterface = new ImplAncienneInterface();

        // Utilisation de l'Adaptateur pour rendre l'Ancienne Interface compatible avec la Nouvelle Interface
        NouvelleInterface adaptateur = new Adaptateur(ancienneInterface);

        // Appel de la Nouvelle Interface (en utilisant l'Adaptateur)
        adaptateur.methodeNouvelle();
    }
}