package com.example.dbtestprj.service.implementation;

import com.example.dbtestprj.model.User;
import com.example.dbtestprj.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService implements UserServiceInterface {

    private final UserRepository userRepository;

    public User getUser(final Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
