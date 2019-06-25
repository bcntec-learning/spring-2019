package allianz.spring.data.c_jpa_repository;

import allianz.spring.data.a_jpa_dao.UserDAO;
import allianz.spring.data.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Controller
public class UserRepositoryController {
    @Autowired
    UserRepository repository;

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping(value = "/list")
    public Iterable<UserEntity> list(){
        return repository.findAll();
    }
}
