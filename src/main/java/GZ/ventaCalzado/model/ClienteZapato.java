package GZ.ventaCalzado.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ClienteZapato")
public class ClienteZapato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    @Column(name = "id_venta")
    private Integer idVenta;

    @Column(name = "fecha_venta", nullable = false)
    @Getter @Setter
    private String fecha;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH} )
    @JoinColumn(nullable = false,name = "idCliente",referencedColumnName = "idCliente")
    @Getter @Setter
    private Cliente cliente;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH} )
    @JoinColumn(nullable = false,name = "id_zapato",referencedColumnName = "id_zapato")
    @Getter @Setter
    private Zapato zapato;





}
