package recipes.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import recipes.convertor.UserConvertor;
import recipes.dto.UserDto;
import recipes.entity.UserEntity;
import recipes.repository.UserCrudRepository;

import java.util.List;
import java.util.Optional;


@Component
@RequiredArgsConstructor
public class UserService {
    private final UserCrudRepository userRepository;
    private final UserConvertor userConvertor;

    // new user save to base
    public boolean save(UserDto userDto) {
        String email = userDto.getEmail();
        boolean ret = userRepository.findByEmail(email).isPresent();
        if (!ret) {
            userRepository.save(userConvertor.toEntity(userDto));
        }
        return ret; // 0-Save new user, 1-User already exists
    }

//    public boolean userOwnsThisRecipe(String username, long id) {
//        Optional<UserEntity> userEntity = userRepository.findByEmail(username);
//        if (userEntity.isPresent()) {
//            List recipes = userEntity.get().getRecipes();
//
//        }
//        return true;
//    }
}
