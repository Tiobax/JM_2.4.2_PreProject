package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UsersDAOImpl;
import web.model.User;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    private final UsersDAOImpl userDAO;

    @Autowired
    public UsersServiceImpl(UsersDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public List<User> readAllUsers() {
        return userDAO.readAllUsers();
    }

    @Override
    @Transactional
    public User readUser(int id) {
        return userDAO.readUser(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(User user) {
        userDAO.deleteUser(user);
    }

    @Override
    @Transactional
    public void creatUser(User user) {
        userDAO.creatUser(user);
    }
}
