package com.application.rest.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@NoArgsConstructor
@Entity
@Table(name = "fabricante")
public class Maker {

    @Id
    private Long id;
    private String name;

}
