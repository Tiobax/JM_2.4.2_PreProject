package web.dao;

import web.model.User;

import java.util.List;

public interface UsersDAO {
    List<User> readAllUsers();
    User readUser(int id);
    void updateUser(User user);
    void deleteUser(int id);
    void creatUser(User user);
}
