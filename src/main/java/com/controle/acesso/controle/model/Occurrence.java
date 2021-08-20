package com.controle.acesso.controle.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Occurrence {
    private long id;
    private String occurrence;
    private String description;
}
