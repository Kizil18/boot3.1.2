package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> listUser();

    public void saveUser(User user);

    public void updateUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
