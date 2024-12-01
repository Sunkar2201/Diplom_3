package com.example.models.requests;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserGetRequestModel {
    private String email;
    private String password;
}
