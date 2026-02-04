package foreach.cda.kcalometrie.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j

@Entity
@Table(name="compose")

@Getter
@Setter

public class RecetteIngredient {
    @Id

    @Column(name="recette_ingredient_id")
    private Integer recette_ingredient_id;

    @ManyToOne
    @JoinColumn(name="recette_id")
    private Recette recette;

    @ManyToOne
    @JoinColumn(name="ingredient_id")
    private Ingredient ingredient;

    private Double quantity;

}
