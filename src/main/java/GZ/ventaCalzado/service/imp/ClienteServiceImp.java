package GZ.ventaCalzado.service.imp;

import GZ.ventaCalzado.model.Cliente;
import GZ.ventaCalzado.repository.IClienteRepository;
import GZ.ventaCalzado.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImp implements IClienteService {
    @Autowired
    private IClienteRepository clienteRepo;

    @Override
    public Cliente create(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRepo.findAll();
    }

    @Override
    public Cliente findById(Integer idCliente) {
        Optional<Cliente> clienteOptional = clienteRepo.findById(idCliente);
        return clienteOptional.orElse(null);
    }

    @Override
    public void delete(Integer idCliente) {
        clienteRepo.deleteById(idCliente);
    }
}
