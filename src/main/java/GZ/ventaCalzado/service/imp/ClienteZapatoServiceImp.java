package GZ.ventaCalzado.service.imp;

import GZ.ventaCalzado.model.ClienteZapato;
import GZ.ventaCalzado.repository.IClienteZapatoRepository;
import GZ.ventaCalzado.service.IClienteZapatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteZapatoServiceImp implements IClienteZapatoService {

    @Autowired
    private IClienteZapatoRepository clienteZapatoRepo;

    @Override
    public ClienteZapato vender(ClienteZapato clienteZapato) {
        return clienteZapatoRepo.save(clienteZapato);
    }

    @Override
    public ClienteZapato actualizarVenta(ClienteZapato clienteZapato) {
        return clienteZapatoRepo.save(clienteZapato);
    }

    @Override
    public void delete(Integer idVenta) {
        clienteZapatoRepo.deleteById(idVenta);

    }

    @Override
    public ClienteZapato findByid(Integer idVenta) {
        Optional<ClienteZapato>clienteZapatoOptional = clienteZapatoRepo.findById(idVenta);
        return clienteZapatoOptional.orElse(null);
    }

    @Override
    public List<ClienteZapato> findAll() {
        return clienteZapatoRepo.findAll();
    }
}
