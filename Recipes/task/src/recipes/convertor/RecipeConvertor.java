package recipes.convertor;

import org.springframework.stereotype.Component;
import recipes.dto.RecipeDto;
import recipes.entity.RecipeEntity;

@Component
public class RecipeConvertor {

    public RecipeEntity toEntity(RecipeDto dto) {
        return new RecipeEntity(0, dto.getName(), dto.getCategory(), dto.getDate(), dto.getDescription(), dto.getIngredients(), dto.getDirections(), dto.getUser_id());
    }

    public RecipeDto toDto(RecipeEntity entity) {
        return  new RecipeDto(entity.getName(), entity.getCategory(), entity.getDate(), entity.getDescription(), entity.getIngredients(), entity.getDirections(), entity.getUser_id());
    }
}
