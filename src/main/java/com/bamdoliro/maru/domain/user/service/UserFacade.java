package com.bamdoliro.maru.domain.user.service;

import com.bamdoliro.maru.domain.user.domain.User;
import com.bamdoliro.maru.domain.user.exception.UserNotFoundException;
import com.bamdoliro.maru.infrastructure.persistence.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UserFacade {

    private final UserRepository userRepository;

    public User getUser(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(UserNotFoundException::new);
    }
}
