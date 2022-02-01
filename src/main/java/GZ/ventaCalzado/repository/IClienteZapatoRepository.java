package GZ.ventaCalzado.repository;

import GZ.ventaCalzado.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteZapatoRepository extends JpaRepository<Venta,Integer> {
}
