package com.devexpresssuperlista.adapters.port.usecase;


import com.devexpresssuperlista.applications.domain.entity.User;
import com.devexpresssuperlista.infra.exception.UserNotFoundException;

public interface SaveUserUseCase {

    User saveUser(User user) throws UserNotFoundException;

}
