package com.carshopwebapp.Service;

import com.carshopwebapp.entities.User;
import com.carshopwebapp.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service //service layer class-bean
public class UserServiceImpl implements UserService {
    //this class will have the following methods: SAVE, UPDATE, DELETE
    private Map<Long, User> userMap = new HashMap<>();

    @Override
    public void saveUser(User user) {
        if (user.getId() == null) {
            user.setId((long) (userMap.size() + 1));
        }
        userMap.put(user.getId(), user);

    }
}
//|I shall here search afm,pinakida, date

