package com.controle.acesso.controle.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Moviment {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovimentId implements Serializable {
        private long idMoviment;
        private long idUser;
    }

    @EmbeddedId
    private MovimentId id;
    private LocalDateTime dateEntry;
    private LocalDateTime dateExit;
    private BigDecimal period;
    private Occurrence occurrence;
    private Calendar calendar;
}
