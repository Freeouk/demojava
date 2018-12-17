package group.Java.service;


import group.Java.Randonnees;
import group.Java.User;
import group.Java.repository.RandoRepository;
import group.Java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RandoRepository randoRepository;

    public User lierRandoUtilisateur(Integer Id_Utilisateur, Integer id_r) throws Exception {
        if (userRepository.exists(Id_Utilisateur)) {

            User u =  userRepository.findOne(Id_Utilisateur);

            if (randoRepository.exists(id_r)){

                Randonnees r = randoRepository.findOne(id_r);
                // instanciation de la classe

                u.getRandonnees().add(r);

                //sauvegarde dans la BDD
                return userRepository.save(u);

            } else {
                throw new Exception("L'identifiant de randonnées n'existe pas : " + id_r);
            }

        } else {
            throw new Exception("L'identifiant utilisateur n'existe pas : " + Id_Utilisateur);
        }


    }
}
