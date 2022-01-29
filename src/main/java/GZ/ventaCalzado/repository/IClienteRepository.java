package GZ.ventaCalzado.repository;

import GZ.ventaCalzado.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
}
