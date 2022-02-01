package GZ.ventaCalzado.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "zapatos")
public class Zapato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    @Column(name = "idZapato")
    Integer idZapato;

    @Column(name = "modelo",nullable = false,length = 50)
    @Getter @Setter
    private String modelo;

    @Column(name = "color",nullable = false,length = 50)
    @Getter @Setter
    private String color;

    @Column(name = "cantidad",nullable = false,length = 50)
    @Getter @Setter
    private String cantidad;

    @OneToMany(mappedBy = "zapato", cascade=CascadeType.ALL, orphanRemoval = true)
    private Set<Venta> venta = new HashSet<Venta>();


}
