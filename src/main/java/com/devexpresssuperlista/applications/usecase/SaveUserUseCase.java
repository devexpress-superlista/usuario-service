package com.devexpresssuperlista.applications.usecase;

import com.devexpresssuperlista.applications.domain.entity.User;
import com.devexpresssuperlista.adapters.output.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveUserUseCase implements com.devexpresssuperlista.adapters.input.usecase.SaveUserUseCase {

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
