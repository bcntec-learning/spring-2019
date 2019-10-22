package allianz.spring.data.b_jpa_repository;

import allianz.spring.data.entities.PriceEntity;
import allianz.spring.data.entities.PricePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, PricePK> {

}
