package com.radouaneoubakhane.serviceinscription.repository;


import com.radouaneoubakhane.serviceinscription.model.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
    List<Inscription> findAllByIsAccepted(boolean b);

    List<Inscription> findAllByIsRefused(boolean b);

    List<Inscription> findAllByIsCanceled(boolean b);
}
