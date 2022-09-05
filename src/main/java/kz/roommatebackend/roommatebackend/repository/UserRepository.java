package kz.roommatebackend.roommatebackend.repository;

import kz.roommatebackend.roommatebackend.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository  extends JpaRepository<Users, UUID> {
}
