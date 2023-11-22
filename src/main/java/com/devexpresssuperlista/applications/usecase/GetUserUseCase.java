package com.devexpresssuperlista.applications.usecase;

import com.devexpresssuperlista.applications.domain.entity.User;
import com.devexpresssuperlista.infra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;

@Service
public class GetUserUseCase implements com.devexpresssuperlista.adapters.port.usecase.GetUserUseCase {

    private final UserRepository userRepository;

    @Autowired
    public GetUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<List<User>> getAllUsers() {
        return Optional.of(userRepository.findAll());
    }
}
