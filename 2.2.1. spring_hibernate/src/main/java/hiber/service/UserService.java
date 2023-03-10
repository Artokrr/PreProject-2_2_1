package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {

    User getUserByCar(Car car);
    void add(User user);
    List<User> listUsers();
}
