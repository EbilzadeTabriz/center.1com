package Baku.center.com.mapper;

import Baku.center.com.dto.UserDto;
import Baku.center.com.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toUserDto(User user);
    User toUser(UserDto userDto);
}
