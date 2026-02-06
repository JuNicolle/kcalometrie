package foreach.cda.kcalometrie.dtos.request;

import java.util.List;

import foreach.cda.kcalometrie.entities.RecetteIngredient;
import foreach.cda.kcalometrie.entities.Ingredient.IngredientType;


public record CreateIngredientDTO(
    String ingredientLibelle,
    Integer ingredientKcal,
    IngredientType ingredientType,
    List<RecetteIngredient> recette
) {
    
}
