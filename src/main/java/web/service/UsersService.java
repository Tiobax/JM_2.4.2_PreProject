package web.service;

import web.model.User;
import java.util.List;

public interface UsersService {
    List<User> readAllUsers();
    User readUser(int id);
    void updateUser(User user);
    void deleteUser(int id);
    void creatUser(User user);
}
