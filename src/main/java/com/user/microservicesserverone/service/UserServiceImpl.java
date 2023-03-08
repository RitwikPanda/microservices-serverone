package com.user.microservicesserverone.service;

import com.user.microservicesserverone.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    // Fake service - User List as spring boot application would be little lengthy

    List<User> list = List.of(
            new User(007L, "James Bond", "911"),
            new User(10L, "Leo Messi", "911911"),
            new User(128L, "Andres Iniesta", "922")
    );
    @Override
    public User getUser(Long id)
    {
        return list.stream().filter(user -> user.getUserId() == id).findAny().orElse(null);
    }
}






/* FOR LINE 21: return.list -> .equals() is only for comparing objects. You're trying to compare a long, which is one of the eight primitive types
which you need to use == to compare. The eight primitive types in Java are int, byte, short, long, float, double, boolean and char.
 */