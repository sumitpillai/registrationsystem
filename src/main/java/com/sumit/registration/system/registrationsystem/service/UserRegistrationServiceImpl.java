package com.sumit.registration.system.registrationsystem.service;

import com.sumit.registration.system.registrationsystem.dto.UserDTO;
import com.sumit.registration.system.registrationsystem.entity.UserEntity;
import com.sumit.registration.system.registrationsystem.repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService{

    @Autowired
    UserRegistrationRepository userRegistrationRepository;

    @Override
    public void register(UserDTO userDTO) {

        UserEntity userEntity = UserEntity.builder()
                .email(userDTO.getEmail())
                .phoneNumber(userDTO.getPhoneNumber())
                .dateOfBirth(userDTO.getDateOfBirth())
                .build();
        this.userRegistrationRepository.save(userEntity);


    }
}
