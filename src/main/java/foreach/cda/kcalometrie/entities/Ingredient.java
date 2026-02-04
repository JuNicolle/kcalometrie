package foreach.cda.kcalometrie.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j

@Getter
@Setter
@Entity

@Table(name="ingredients")

public class Ingredient {
    @Id

    @Column(name="ingredient_id")
    private Integer ingredientId;

    @Column(name="ingredient_libelle")
    private String ingredientLibelle;

    @Enumerated(EnumType.STRING)
    @Column(name="ingredient_type")
    private IngredientType IngredientType;

    public enum IngredientType {
        LEGUME,VIANDE,POISSON
    }

    @Column(name="ingredientkcal")
    private Integer ingredientKcal;

    @OneToMany(mappedBy = "ingredient")
    private List<RecetteIngredient> recette = new ArrayList<>();

}
