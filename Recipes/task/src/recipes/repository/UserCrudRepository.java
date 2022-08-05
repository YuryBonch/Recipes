package recipes.repository;

import org.springframework.data.repository.CrudRepository;
import recipes.entity.RecipeEntity;
import recipes.entity.UserEntity;
import java.util.Optional;

public interface UserCrudRepository extends CrudRepository<UserEntity, String> {
    Optional<UserEntity> findByEmail(String email);
}
