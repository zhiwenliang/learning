package com.example.spring.learning;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoService {
    private final UserRepository userRepository;

    public DemoService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void addUser() {
        User user = new User();
        user.setId(123);
        user.setName("test");
        user.setAge(12);
        userRepository.save(user);
    }
}
