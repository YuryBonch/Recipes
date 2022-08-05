package recipes.repository;

import org.springframework.data.repository.CrudRepository;
import recipes.entity.RecipeEntity;

import java.util.List;

public interface RecipeCrudRepository extends CrudRepository<RecipeEntity, Long> {
    Iterable<RecipeEntity> findAllByCategoryIgnoreCaseOrderByDateDesc(String name);
    Iterable<RecipeEntity> findAllByNameContainingIgnoreCaseOrderByDateDesc(String name);
}
