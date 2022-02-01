package GZ.ventaCalzado.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "venta")
@Data
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idVenta")
    private Long idVenta;

    @Column(name = "fechaVenta", nullable = false)
    private String fechaVenta;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="cliente_id", referencedColumnName = "idCliente")
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "zapato_id", referencedColumnName = "idZapato")
    private Zapato zapato;

    private Double precio;


}
