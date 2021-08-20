package com.controle.acesso.controle.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class CategoryUser {
    private Long id;
    private String description;
}
