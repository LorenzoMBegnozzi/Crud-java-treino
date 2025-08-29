package com.logan.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.logan.example.enums.Status;
import jakarta.validation.constraints.*;
import lombok.Builder;
import org.hibernate.validator.constraints.br.CPF;

@Builder
public record UserDTO(

        Long id,

        @NotBlank
        @Size (min = 3, max = 120, message = "o nome deve conter entre 3 e 120 caraceres")
        String name,

        @NotBlank
        @JsonProperty(value = "password", access = JsonProperty.Access.WRITE_ONLY)
        @Size (min = 8, max = 50, message = "a senha  deve conter entre 3 e 50")
        String password,

        @Min(value = 18, message = "Idade náo permitida para realizar cadastro")
        Integer age,

        @CPF(message = "CPF invalido")
        String cpf,

        @NotBlank
        @Email(message = "email invalido")
        String email,

        @NotNull
        Status status
) {
}
