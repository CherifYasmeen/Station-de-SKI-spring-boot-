package tn.esprit.spring1.tpyasmine.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring1.tpyasmine.Repository.PisteRepository;
import tn.esprit.spring1.tpyasmine.entities.Piste;
import java.util.List;
@Service

public class IPisteServiceImp implements IPisteService{
    @Autowired//TO DO
    PisteRepository pisteRepository;
    @Override
    public Piste addPiste(Piste piste) {

        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public List<Piste> findAll() {
        return (List<Piste>) pisteRepository.findAll() ;
    }

    @Override
    public Piste findById(long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
        //return pisteRepo.findById(numPiste)
        // .orElseThrow(()->new IllegalArgumentException("no piste found with this id"))
    }

    @Override
    public void delete(long numPiste) {
        pisteRepository.deleteById(numPiste );
    }
}
