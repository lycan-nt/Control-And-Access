package com.controle.acesso.controle.model;

import lombok.*;

import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Location {
    private long id;
    @OneToMany
    private AccessLevel accessLevel;
    private String description;
}
