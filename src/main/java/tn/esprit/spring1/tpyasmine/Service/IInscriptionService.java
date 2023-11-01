package tn.esprit.spring1.tpyasmine.Service;
import tn.esprit.spring1.tpyasmine.entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    List<Inscription> findAll();
    Inscription findById(long numInscription);
    void delete (long numInscription);
    Inscription addRegistrationAndAssignToSkier(Inscription inscription, long numSkieur);

    Inscription assignRegistrationToCourse(Long numInscription, Long numCours);



}
