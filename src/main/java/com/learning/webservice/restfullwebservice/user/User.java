package com.learning.webservice.restfullwebservice.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private  Integer id;

    @NotBlank(message = "Name must be not empty.")
    private String name;

    @Past(message = "Birth date should be in the past")
    private LocalDate birthDate;

}
