package com.sumit.registration.system.registrationsystem.dto;

import lombok.*;

import java.time.LocalDate;

//@Getter
//@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private String email;
    private LocalDate dateOfBirth;
    private String phoneNumber;
}

