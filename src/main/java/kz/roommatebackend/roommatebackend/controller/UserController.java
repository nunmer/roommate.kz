package kz.roommatebackend.roommatebackend.controller;

import kz.roommatebackend.roommatebackend.dto.UserDTO;
import kz.roommatebackend.roommatebackend.model.Users;
import kz.roommatebackend.roommatebackend.service.UserService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/login")
    public String login(@RequestBody Users userDTO){
        userService.saveUser(userDTO);
        return "Login registered successful!";
    }

    @GetMapping("/getAll")
    public List<Users> getAllUsers(){
        return userService.getAllUsers();
    }
}
