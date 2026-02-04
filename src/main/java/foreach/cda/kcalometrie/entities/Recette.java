package foreach.cda.kcalometrie.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

@Table(name = ("recette"))
public class Recette {
    @Id

    @Column(name = "recetteId")
    private Integer recetteId;

    @Column(name="recetteName")
    private String recetteName;

    @Column(name="preparedTime")
    private Integer preparedTime;

    @Column(name="kcal")
    private Integer kcal;

    @Column(name="sharedOrNot")
    private boolean sharedOrNot;
}   
