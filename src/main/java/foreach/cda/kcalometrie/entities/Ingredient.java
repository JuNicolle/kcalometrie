package foreach.cda.kcalometrie.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

@Table(name="ingredients")

public class Ingredient {
    @Id

    @Column(name="ingredientId")
    private Integer ingredientId;

    @Column(name="ingredientLibelle")
    private String ingredientLibelle;

    @Enumerated(EnumType.STRING)
    @Column(name="ingredientType")
    private IngredientType IngredientType;

    public enum IngredientType {
        LEGUME,VIANDE,POISSON
    }

    @Column(name="ingredientKcal")
    private Integer ingredientKcal;

}
