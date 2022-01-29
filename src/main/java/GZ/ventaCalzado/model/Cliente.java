package GZ.ventaCalzado.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Integer idCliente;

    @Column(name ="nombres", nullable = false, length = 40)
    @Getter @Setter
    private String nombres;

    @Column(name = "apellidos", nullable = false, length = 55)
    @Getter @Setter
    private String apellidos;

    @Column(name = "telefono",nullable = false, length = 12)
    @Getter @Setter
    private String telefono;

    @Column(name = "direccion", nullable = false, length = 70)
    @Getter @Setter
    private String direccion;

    @Column(name ="email", nullable = false, length = 40)
    @Getter @Setter
    private String email;

}
