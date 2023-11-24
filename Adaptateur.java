package org.elmaghrani.nouvelle;

import org.elmaghrani.ancienne.AncienneInterface;

// Adaptateur qui implémente la Nouvelle Interface en utilisant l'Ancienne Interface
public class Adaptateur implements NouvelleInterface {
    private AncienneInterface ancienneInterface;

    public Adaptateur(AncienneInterface ancienneInterface) {
        this.ancienneInterface = ancienneInterface;
    }

    @Override
    public void methodeNouvelle() {
        // Utilisation de l'Ancienne Interface pour implémenter la Nouvelle Interface
        ancienneInterface.methodeAncienne();
    }
}

