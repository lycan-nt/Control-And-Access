package com.controle.acesso.controle.model;

import lombok.*;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
    @ManyToOne
    private CategoryUser categoryUser;
    private String userName;
    @ManyToOne
    private Company company;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private JourneyJob journeyJob;
    private BigDecimal tolerance;
    private LocalDateTime initialJourney;
    private  LocalDateTime finallyJourney;
}
