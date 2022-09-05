package kz.roommatebackend.roommatebackend.service;

import kz.roommatebackend.roommatebackend.dto.UserDTO;
import kz.roommatebackend.roommatebackend.model.Users;
import org.springframework.security.core.userdetails.User;

import java.util.List;

public interface UserService {
    public Users saveUser(Users users);
    public List<Users> getAllUsers();
}
