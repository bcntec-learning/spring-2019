package allianz.spring.data.a_jpa_dao;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.util.List;

@RequiredArgsConstructor
public class AbstractDAO<E, ID> {
    @Getter(AccessLevel.PROTECTED)
    private final Class<E> entityClazz;
    @Getter(AccessLevel.PROTECTED)
    private final EntityManager entityManager;


    public E findById(ID id) {
        try {
            return entityManager.find(entityClazz, id);
        } catch (NoResultException e) {
            return null;
        }
    }

    public E persist(E e){
        getEntityManager().persist(e);
        //entityManager.flush();
        //entityManager.merge(e);
        return e;
    }

    public List<E> listAll() {
        return getEntityManager().createQuery(
                "from " + getEntityClazz().getSimpleName().replace("Entity", ""),
                getEntityClazz()).getResultList();


    }

    public E deleteById(ID id) {
        E d  = findById(id);
        if(d!=null){
           getEntityManager().remove(d);
        }
        return d;
    }
}
