package estudos.maya.screenmatch_frases.repository;

import estudos.maya.screenmatch_frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase, Long> {
}
