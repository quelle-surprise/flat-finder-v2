package com.quellesup.customerregistrationapi.dto.dbmodel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode()
@ToString(callSuper = true)
public class Customer {

    @Id
    private Long id;
    @Column(unique = true)
    private String username;
    private String gender;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
