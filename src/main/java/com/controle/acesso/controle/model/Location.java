package com.controle.acesso.controle.model;

import lombok.*;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Location {
    private long id;
    @ManyToOne
    private AccessLevel accessLevel;
    private String description;
}
