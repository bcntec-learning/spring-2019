package allianz.spring.data.z_mixied;

import lombok.Getter;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.Optional;

@NoRepositoryBean
public class <DAOImpl<T, ID extends Serializable>
        extends SimpleJpaRepository<T, ID> implements MixedDAO<T, ID> {

    @Getter
    private final EntityManager entityManager;

    public AISGenericDAOImpl(Class<T> domainClass, EntityManager entityManager) {
        super(domainClass, entityManager);
        this.entityManager = entityManager;
    }

    @Transactional
    public Optional<T> findAndDeleteById(ID id) {
        T deleted = entityManager.find(this.getDomainClass(), id);
        Optional<T> returned = Optional.empty();

        if (deleted != null) {
            entityManager.remove(deleted);
            returned = Optional.of(deleted);
        }
        return returned;
    }

    @Override
    public Class<T> getDomainClass() {
        return super.getDomainClass();
    }
}