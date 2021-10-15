package repositories;

import entity.Computador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputadorRepository extends JpaRepository<Computador, Integer> {
}
