package dao;

import model.User;

import java.util.List;

public class UserDao extends AbstractDao<User> {
    public List<User> getAll(){return this.execute(s -> s.createQuery("from User").list());}
}
