package GZ.ventaCalzado.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente")
    Integer idCliente;

    @Column(name = "nombres", nullable = false, length = 40)
    private String nombres;

    @Column(name = "apellidos", nullable = false, length = 55)
    private String apellidos;

    @Column(name = "telefono", nullable = false, length = 12)
    private String telefono;

    @Column(name = "direccion", nullable = false, length = 70)
    private String direccion;

    @Column(name = "email", nullable = false, length = 40)
    private String email;
}
