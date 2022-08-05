package recipes.convertor;

import org.springframework.stereotype.Component;
import recipes.dto.UserDto;
import recipes.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserConvertor {
    public UserEntity toEntity(UserDto dto) {
        return new UserEntity(0L, dto.getEmail(), dto.getPassword(), ""); // , new ArrayList<>()
    }

    public UserDto toDto(UserEntity entity) {
        return  new UserDto(entity.getId(), entity.getEmail(), entity.getPassword(), entity.getRole());
    }
}
