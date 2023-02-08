package sn.exo.controller;

import sn.exo.entities.User;

import java.util.List;

public interface IUser {
    public int add(User u) ;
    public int delete(int id ) ;
    public int update(User u) ;
    public User get(int id) ;
    public List<User> liste() ;
}
