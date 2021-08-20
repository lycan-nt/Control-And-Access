package com.controle.acesso.controle.model;

import lombok.*;

import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class User {
    private long id;
    @OneToMany
    private CategoryUser categoryUser;
    private String userName;
    @OneToMany
    private Company company;
    @OneToMany
    private AccessLevel accessLevel;
    @OneToMany
    private JourneyJob journeyJob;
    private BigDecimal tolerance;
    private LocalDateTime initialJourney;
    private  LocalDateTime finallyJourney;
}
