package com.devexpresssuperlista.adapters.input.usecase;


import com.devexpresssuperlista.applications.domain.entity.User;

import java.util.List;
import java.util.Optional;

public interface GetUserUseCase {

    Optional<List<User>> getAllUsers();

}
