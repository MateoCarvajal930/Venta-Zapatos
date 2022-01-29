package GZ.ventaCalzado.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "zapatos")
public class Zapato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Integer idZapato;

    @Column(name = "modelo",nullable = false,length = 50)
    @Getter @Setter
    private String modelo;
    @Column(name = "color",nullable = false,length = 50)
    @Getter @Setter
    private String color;


}
