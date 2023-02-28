package tim.dao;


import tim.model.User;

import java.util.List;
public interface UserDao {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(User updateUser);
    void deleteById(int id);
}