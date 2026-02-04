package foreach.cda.kcalometrie.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j

@Getter
@Setter
@Entity

@Table(name = ("recette"))
public class Recette {
    @Id

    @Column(name = "recette_id")
    private Integer recetteId;

    @Column(name="recette_name")
    private String recetteName;

    @Column(name="prepared_time")
    private Integer preparedTime;

    @Column(name="recettekcal")
    private Integer recettekcal;

    @Column(name="shared_or_not")
    private boolean sharedOrNot;

    @ManyToMany(mappedBy = "favorite_recettes")
    private List<User> recettesLiked = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="user_id")
    private User Creator;

    @OneToMany(mappedBy = "recette")
    private List<RecetteIngredient> composition = new ArrayList<>();

}   
