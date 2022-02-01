package GZ.ventaCalzado.service.imp;

import GZ.ventaCalzado.model.Venta;
import GZ.ventaCalzado.repository.IClienteZapatoRepository;
import GZ.ventaCalzado.service.IClienteZapatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteZapatoServiceImp implements IClienteZapatoService {

    @Autowired
    private IClienteZapatoRepository clienteZapatoRepo;

    @Override
    @Transactional
    public Venta vender(Venta clienteZapato) {
        return clienteZapatoRepo.save(clienteZapato);
    }

    @Override
    public Venta actualizarVenta(Venta clienteZapato) {
        return clienteZapatoRepo.save(clienteZapato);
    }

    @Override
    public void borrarVenta(Integer idVenta) {
        clienteZapatoRepo.deleteById(idVenta);

    }

    @Override
    public Venta BuscarVentaPorId(Integer idVenta) {
        Optional<Venta>clienteZapatoOptional = clienteZapatoRepo.findById(idVenta);
        return clienteZapatoOptional.orElse(null);
    }


    @Override
    public List<Venta> listarVentas() {
        return clienteZapatoRepo.findAll();
    }
}
