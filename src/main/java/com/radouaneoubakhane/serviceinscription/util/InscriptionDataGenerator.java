package com.radouaneoubakhane.serviceinscription.util;

import com.radouaneoubakhane.serviceinscription.model.Inscription;
import com.radouaneoubakhane.serviceinscription.model.enums.*;

import java.time.LocalDate;

public class InscriptionDataGenerator {
    public static Inscription generateInscription() {

        return Inscription.builder()
                        .nom("Oubakhane")
                        .prenom("Radouane")
                        .genre(Gender.MALE)
                        .dateNaissance(LocalDate.of(1995, 8, 12))
                        .lieuNaissance("Casablanca")
                        .adresse("Casablanca")
                        .telephone("0600000000")
                        .cin("EE000000")
                        .cne("G000000")
                        .email("radouane@gmai.com")
                        .filiereBac(Bac.SCIENCES_MATHS)
                        .moyenneBac(15.5)
                        .moyenneDiplome(16.5)
                        .moyenneLicence(17.5)
                        .mentionBac(Mention.BIEN)
                        .anneeBac("2013")
                        .etablissementBac("Lycée")
                        .villeBac("Casablanca")
                        .paysBac("Maroc")
                        .diplomeDeust(DiplomeDEUST.MIP)
                        .mentionDiplome(Mention.BIEN)
                        .anneeDiplome("2015")
                        .etablissementDiplome("Faculté")
                        .villeDiplome("Casablanca")
                        .paysDiplome("Maroc")
                        .licence(Licence.INFO)
                        .mentionLicence(Mention.BIEN)
                        .anneeLicence("2018")
                        .etablissementLicence("Faculté")
                        .villeLicence("Casablanca")
                        .paysLicence("Maroc")
                        .isAccepted(false)
                        .isRefused(false)
                        .isCanceled(false)
                        .filiereId(1L)
                        .build();
    }
}
