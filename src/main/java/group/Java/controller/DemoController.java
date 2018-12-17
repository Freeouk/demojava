package group.Java.controller;

import group.Java.User;
import group.Java.repository.RandoRepository;
import group.Java.repository.UserRepository;
import group.Java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;
@RestController
public class DemoController {

    @Autowired
    private RandoRepository randoRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

// autowired pour lié les pages

    @RestController
    public class UserController {


        @RequestMapping("/RandoConsultees")
        public User randonnees (@RequestParam(value="id_utilisateur") Integer idUtilisateur, @RequestParam (value = "id_r")Integer idR)throws Exception

        {
            return userService.lierRandoUtilisateur(idUtilisateur,idR);
        }
    }
}
