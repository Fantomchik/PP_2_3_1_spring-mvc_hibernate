package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    void saveUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    void updateUser(User user);
    void deleteUser(Long id);
}
