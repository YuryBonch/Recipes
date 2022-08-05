package recipes.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import recipes.convertor.RecipeConvertor;
import recipes.dto.RecipeDto;
import recipes.entity.RecipeEntity;
import recipes.entity.UserEntity;
import recipes.repository.RecipeCrudRepository;
import java.util.*;

@Component
@RequiredArgsConstructor
public class RecipeService {
    private final RecipeCrudRepository recipeRepository;
    private final RecipeConvertor recipeConvertor;

    // save to base
    public long save(RecipeDto recipeDto) {
        RecipeEntity recipeEntity = recipeRepository.save(recipeConvertor.toEntity(recipeDto));
        return recipeEntity.getId();
    }

    // get from base -> return convert RecipeEntity to RecipeDto
    public RecipeDto get(long id) {
        Optional<RecipeEntity> recipe = recipeRepository.findById(id);
        return recipe.map(recipeConvertor::toDto).orElse(null);
    }

    // delete from base -> return existsById
    public boolean delete(long id) {
        boolean ret = recipeRepository.existsById(id);
        if (ret) recipeRepository.deleteById(id);
        return ret;
    }

    // update base -> return existsById
    public boolean update(long id, RecipeDto recipe) {
        boolean ret = recipeRepository.existsById(id);
        if (ret) {
            RecipeEntity recipeEntity = recipeConvertor.toEntity(recipe);
            recipeEntity.setId(id);
            recipeRepository.save(recipeEntity);
        }
       return ret;
    }

    // Array of all recipes of the specified category
    public List<RecipeDto> getByCategory(String category) {
        List<RecipeDto> list = new ArrayList<>();
        recipeRepository.findAllByCategoryIgnoreCaseOrderByDateDesc(category).forEach(r -> list.add(recipeConvertor.toDto(r)));
        return list;
    }

    // Array of all recipes with the names that contain the specified parameter.
    public List<RecipeDto> getByName(String name) {
        List<RecipeDto> list = new ArrayList<>();
        recipeRepository.findAllByNameContainingIgnoreCaseOrderByDateDesc(name).forEach(r -> list.add(recipeConvertor.toDto(r)));
        return list;
    }


    public boolean userOwnsThisRecipe(long user_id, long recipe_id) {
        Optional<RecipeEntity> recipeEntity = recipeRepository.findById(recipe_id);
        //System.out.println(String.format("FIND %d %d",user_id,  recipe_id));
        if (recipeEntity.isPresent()) {
            long i = recipeEntity.get().getUser_id();
            System.out.println(i);
            return i == user_id;
        }
        return true;
    }

}
