package allianz.spring.data.d_rest;

import allianz.spring.data.entities.UserEntity;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/{id}")
    public UserEntity findUserById(@PathVariable("id") UserEntity user) {
        return user;
    }

    @GetMapping
    public Page<UserEntity> findAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @GetMapping("/sorted")
    public Page<UserEntity> findAllUsersSortedByName() {
        Pageable pageable = PageRequest.of(0, 5, Sort.by("name"));
        return userRepository.findAll(pageable);
    }

    @GetMapping("/filtered")
    public Iterable<UserEntity> getUsersByQuerydslPredicate(Pageable pageable, @QuerydslPredicate(root = UserEntity.class) Predicate predicate) {
        return userRepository.findAll(predicate, pageable);
    }
}
