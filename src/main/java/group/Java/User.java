package group.Java;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "utilisateur")
public class User {

        @ManyToMany(fetch = FetchType.EAGER)
        @JsonManagedReference
        // Jsonmanagereference ici car table randonnées lié a cette table
        // Vrai mapping ici

        @JoinTable(name = "randoutilisateur",
                joinColumns = @JoinColumn(name = "id_utilisateur"),
                inverseJoinColumns = @JoinColumn(name = "id_r")
        )
        private List<Randonnees> randonnees;




    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id_Utilisateur")
    private Integer idUtilisateur;

    @Column (name = "Pseudo_Utilisateur")
    private String PseudoUtilisateur;

    @Column (name = "Nom_Utilisateur")
    private String NomUtilisateur;

    @Column (name = "Prenom_Utilisateur")
    private String PrenomUtilisateur;

    @Column (name = "Email_Utilisateur")
    private String EmailUtilisateur;

    @Column (name = "Age_Utilisateur")
    private Double AgeUtilisateur;

    @Column (name = "Enfants_Utilisateur")
    private Integer EnfantsUtilisateur;

    @Column (name = "Mot_De_Passe_Utilisateur")
    private String MotDePasseUtilisateur;

    public User(Integer idUtilisateur, String pseudoUtilisateur, String nomUtilisateur, String prenomUtilisateur, String emailUtilisateur, Double ageUtilisateur, Integer enfantsUtilisateur, String motDePasseUtilisateur) {
        this.idUtilisateur = idUtilisateur;
        PseudoUtilisateur = pseudoUtilisateur;
        NomUtilisateur = nomUtilisateur;
        PrenomUtilisateur = prenomUtilisateur;
        EmailUtilisateur = emailUtilisateur;
        AgeUtilisateur = ageUtilisateur;
        EnfantsUtilisateur = enfantsUtilisateur;
        MotDePasseUtilisateur = motDePasseUtilisateur;
    }

    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getPseudoUtilisateur() {
        return PseudoUtilisateur;
    }

    public void setPseudoUtilisateur(String pseudoUtilisateur) {
        PseudoUtilisateur = pseudoUtilisateur;
    }

    public String getNomUtilisateur() {
        return NomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        NomUtilisateur = nomUtilisateur;
    }

    public String getPrenomUtilisateur() {
        return PrenomUtilisateur;
    }

    public void setPrenomUtilisateur(String prenomUtilisateur) {
        PrenomUtilisateur = prenomUtilisateur;
    }

    public String getEmailUtilisateur() {
        return EmailUtilisateur;
    }

    public void setEmailUtilisateur(String emailUtilisateur) {
        EmailUtilisateur = emailUtilisateur;
    }

    public Double getAgeUtilisateur() {
        return AgeUtilisateur;
    }

    public void setAgeUtilisateur(Double ageUtilisateur) {
        AgeUtilisateur = ageUtilisateur;
    }

    public Integer getEnfantsUtilisateur() {
        return EnfantsUtilisateur;
    }

    public void setEnfantsUtilisateur(Integer enfantsUtilisateur) {
        EnfantsUtilisateur = enfantsUtilisateur;
    }

    public String getMotDePasseUtilisateur() {
        return MotDePasseUtilisateur;
    }

    public void setMotDePasseUtilisateur(String motDePasseUtilisateur) {
        MotDePasseUtilisateur = motDePasseUtilisateur;
    }

    public List<Randonnees> getRandonnees() {
        return randonnees;
    }

    public void setRandonnees(List<Randonnees> randonnees) {
        this.randonnees = randonnees;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "idUtilisateur='" + idUtilisateur + '\'' +
                ", PseudoUtilisateur='" + PseudoUtilisateur + '\'' +
                ", NomUtilisateur='" + NomUtilisateur + '\'' +
                ", PrenomUtilisateur='" + PrenomUtilisateur + '\'' +
                ", EmailUtilisateur='" + EmailUtilisateur + '\'' +
                ", AgeUtilisateur=" + AgeUtilisateur +
                ", EnfantsUtilisateur=" + EnfantsUtilisateur +
                ", MotDePasseUtilisateur='" + MotDePasseUtilisateur + '\'' +
                '}';
    }
}

