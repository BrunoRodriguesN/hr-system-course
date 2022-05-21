package br.com.bruno.payrollapi.domain;

import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private Double hourlyPrice;

}
