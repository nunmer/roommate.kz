package kz.roommatebackend.roommatebackend.service;

import kz.roommatebackend.roommatebackend.dto.UserDTO;
import kz.roommatebackend.roommatebackend.model.Users;
import kz.roommatebackend.roommatebackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public Users saveUser(Users users) {
        users.setCreatedAt(LocalDateTime.now());
        users.setUpdatedAt(LocalDateTime.MIN);
         return userRepository.save(users);
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}
