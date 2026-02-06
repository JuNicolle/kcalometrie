package foreach.cda.kcalometrie.dtos.request;

import java.util.List;

import foreach.cda.kcalometrie.entities.RecetteIngredient;
import foreach.cda.kcalometrie.entities.User;

public record CreateRecetteDTO(
    String recetteName,
    String preparedTime,
    Integer recettekcal,
    boolean sharedOrNot,
    User creator,
    List<RecetteIngredient> composition
) {
    
}
