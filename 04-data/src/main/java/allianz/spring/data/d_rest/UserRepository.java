package allianz.spring.data.d_rest;

import allianz.spring.data.entities.UserEntity;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long>, QuerydslPredicateExecutor<UserEntity> {

}
