package com.sumit.registration.system.registrationsystem.repository;

import com.sumit.registration.system.registrationsystem.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRegistrationRepository extends CrudRepository<UserEntity, Integer> {

}
