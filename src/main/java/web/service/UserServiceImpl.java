package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.dao.UserDAOImpl;
import web.model.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Transactional(readOnly = true)
    public User getUserById(Long id) {
        return userDAO.getUserById(id);
    }

    @Transactional
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Transactional
    public void deleteUser(Long id) {
        userDAO.deleteUser(id);
    }
}
