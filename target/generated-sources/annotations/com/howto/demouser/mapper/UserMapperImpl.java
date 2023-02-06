package com.howto.demouser.mapper;

import com.howto.demouser.dao.UserDao;
import com.howto.demouser.model.Costumer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-06T14:24:52+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public Costumer fromDao(UserDao dao) {
        if ( dao == null ) {
            return null;
        }

        Costumer costumer = new Costumer();

        costumer.setName( dao.getName() );
        costumer.setEmail( dao.getEmail() );

        return costumer;
    }

    @Override
    public UserDao toDao(Costumer model) {
        if ( model == null ) {
            return null;
        }

        UserDao userDao = new UserDao();

        userDao.setEmail( model.getEmail() );
        userDao.setName( model.getName() );

        return userDao;
    }
}
