package GZ.ventaCalzado.service;

import GZ.ventaCalzado.model.Cliente;

import java.util.List;

public interface IClienteService {

    Cliente create(Cliente cliente);
    Cliente update(Cliente cliente);
    List<Cliente> findAll();
    Cliente findById(Integer idCliente);
    void delete(Integer idCliente);
}
