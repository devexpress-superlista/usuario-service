package com.devexpresssuperlista.applications.usecase;

import com.devexpresssuperlista.applications.domain.entity.User;
import com.devexpresssuperlista.infra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SaveUserUseCase implements com.devexpresssuperlista.adapters.port.usecase.SaveUserUseCase {

    private final UserRepository userRepository;

    @Autowired
    public SaveUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
