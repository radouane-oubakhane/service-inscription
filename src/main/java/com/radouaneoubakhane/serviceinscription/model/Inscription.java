package com.radouaneoubakhane.serviceinscription.model;


import com.radouaneoubakhane.serviceinscription.annotations.EnumNamePattern;
import com.radouaneoubakhane.serviceinscription.model.enums.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "inscription_table")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //    LES INFORMARTIONS PERSONNELLES

    @NotBlank(message = "Le CIN est obligatoire")
    private String cin;

    @NotBlank(message = "Le CNE est obligatoire")
    private String cne;

    @NotBlank(message = "Le nom est obligatoire")
    private String nom;

    @NotBlank(message = "Le prenom est obligatoire")
    private String prenom;


    @EnumNamePattern(
            regexp = "MALE|FEMALE",
            message = "Le genre doit etre valide"
    )
    @Enumerated(EnumType.STRING)
    @Column(name = "genre")
    private Gender genre ;

    @NotBlank(message = "L'email est obligatoire")
    @Email(message = "L'email doit etre valide")
    private String email;

    @Past(message = "La date de naissance doit etre dans le passe")
    @Column(name = "date_naissance")
    private Date dateNaissance;


    @NotBlank(message = "Le lieu de naissance est obligatoire")
    @Column(name = "lieu_naissance")
    private String lieuNaissance;

    @NotBlank(message = "L'addresse est obligatoire")
    private String adresse;

    @NotBlank(message = "Le telephone est obligatoire")
    private String telephone;


    //    LES INFORMARTIONS DU BACCALAUREAT
    @EnumNamePattern(
            regexp = "SCIENCES_MATHS|SCIENCES_EXP|SCIENCES_TECH|SCIENCES_ECO|SCIENCES_GESTION|LETTRES|ARTS|SPORT",
            message = "Le type de bac doit etre valide"
    )
    @Enumerated(EnumType.STRING)
    @Column(name = "filiere_bac")
    private Bac filiereBac;


    @NotNull(message = "La moyenne du bac est obligatoire")
    @Positive(message = "La moyenne du bac doit etre positive")
    @Max(value = 20, message = "La moyenne du bac doit etre inferieure a 20")
    @Min(value = 0, message = "La moyenne du bac doit etre superieure a 0")
    @Column(name = "moyenne_bac")
    private double moyenneBac;


    @EnumNamePattern(
            regexp = "TRES_BIEN|BIEN|ASSEZ_BIEN|PASSABLE|INSUFFISANT",
            message = "La mention du bac doit etre valide"
    )
    @Enumerated(EnumType.STRING)
    @Column(name = "mention_bac")
    private Mention mentionBac;


    @NotBlank(message = "L'annee du bac est obligatoire")
    @Column(name = "annee_bac")
    private String anneeBac;


    @NotBlank(message = "L'etablissement du bac est obligatoire")
    @Column(name = "etablissement_bac")
    private String etablissementBac;


    @NotBlank(message = "La ville du bac est obligatoire")
    @Column(name = "ville_bac")
    private String villeBac;


    @NotBlank(message = "Le pays du bac est obligatoire")
    @Column(name = "pays_bac")
    private String paysBac;

    //    LES INFORMATIONS DU DIPLOME DEUST


    @Enumerated(EnumType.STRING)
    @Column(name = "diplome_deust")
    private DiplomeDEUST diplomeDeust;



    @Column(name = "moyenne_diplome")
    private double moyenneDiplome;



    @Enumerated(EnumType.STRING)
    @Column(name = "mention_diplome")
    private Mention mentionDiplome;


    @Column(name = "annee_diplome")
    private String anneeDiplome;


    @Column(name = "etablissement_diplome")
    private String etablissementDiplome;


    @Column(name = "ville_diplome")
    private String villeDiplome;


    @Column(name = "pays_diplome")
    private String paysDiplome;

    //    LES INFORMARTIONS DE LA LICENCE

    @Enumerated(EnumType.STRING)
    private Licence licence;


    private double moyenneLicence;


    @Enumerated(EnumType.STRING)
    private Mention mentionLicence;


    @Column(name = "annee_licence")
    private String anneeLicence;


    @Column(name = "etablissement_licence")
    private String etablissementLicence;


    @Column(name = "ville_licence")
    private String villeLicence;


    @Column(name = "pays_licence")
    private String paysLicence;

    //    La FILIERE
    @Positive(message = "La filiere est obligatoire")
    @NotNull(message = "La filiere est obligatoire")
    @Column(name = "filiere_id")
    private Long filiereId;

    // Diplomat
    @NotNull(message = "Le diplomant est obligatoire")
    @EnumNamePattern(
            regexp = "DEUST|LST|MST",
            message = "Le diplomant doit etre valide"
    )
    @Enumerated(EnumType.STRING)
    private Diplomat diplomat;

    //    L'ETAT DE L'INSCRIPTION
    @Column(name = "is_accepted")
    private boolean isAccepted = false;
    @Column(name = "is_refused")
    private boolean isRefused = false;
    @Column(name = "is_canceled")
    private boolean isCanceled = false;
}

