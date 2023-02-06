package com.howto.demouser.mapper;

import com.howto.demouser.dao.UserDao;
import com.howto.demouser.model.Costumer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    Costumer fromDao(UserDao dao);

    UserDao toDao(Costumer model);
}
