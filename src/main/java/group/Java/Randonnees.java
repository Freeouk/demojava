package group.Java;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Randonnees {

    @ManyToMany(mappedBy = "randonnees", fetch=FetchType.EAGER)
    @JsonBackReference
    //Json back parce que c'est la table lié a User
    // table rapportées

    private List<User> utilisateurs;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id_r")
    private Integer idR;

    @Column (name = "nom_r")
    private String nomR;

    @Column (name = "lieu_r")
    private String lieuR;

    @Column (name = "duree_r")
    private String dureeR;

    @Column (name = "note_r")
    private Double noteR;

    @Column (name = "niv_r")
    private String nivR;

    @Column (name = "dist_r")
    private Double distR;

    @Column (name = "maps_r")
    private String mapsR;

    public Randonnees(Integer idR, String nomR, String lieuR, String dureeR, Double noteR, String nivR, Double distR, String mapsR) {
        this.idR = idR;
        this.nomR = nomR;
        this.lieuR = lieuR;
        this.dureeR = dureeR;
        this.noteR = noteR;
        this.nivR = nivR;
        this.distR = distR;
        this.mapsR = mapsR;
    }


    public Integer getIdR() {
        return idR;
    }

    public void setIdR(Integer idR) {
        this.idR = idR;
    }

    public String getNomR() {
        return nomR;
    }

    public void setNomR(String nomR) {
        this.nomR = nomR;
    }

    public String getLieuR() {
        return lieuR;
    }

    public void setLieuR(String lieuR) {
        this.lieuR = lieuR;
    }

    public String getDureeR() {
        return dureeR;
    }

    public void setDureeR(String dureeR) {
        this.dureeR = dureeR;
    }

    public Double getNoteR() {
        return noteR;
    }

    public void setNoteR(Double noteR) {
        this.noteR = noteR;
    }

    public String getNivR() {
        return nivR;
    }

    public void setNivR(String nivR) {
        this.nivR = nivR;
    }

    public Double getDistR() {
        return distR;
    }

    public void setDistR(Double distR) {
        this.distR = distR;
    }

    public String getMapsR() {
        return mapsR;
    }

    public void setMapsR(String mapsR) {
        this.mapsR = mapsR;
    }

    public List<User> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<User> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public Randonnees() {
    }

    @Override
    public String toString() {
        return "Randonnees{" +
                ", idR='" + idR + '\'' +
                ", nomR='" + nomR + '\'' +
                ", lieuR='" + lieuR + '\'' +
                ", dureeR='" + dureeR + '\'' +
                ", noteR=" + noteR +
                ", nivR='" + nivR + '\'' +
                ", distR=" + distR +
                ", mapsR=" + mapsR +
                '}';
    }
}
