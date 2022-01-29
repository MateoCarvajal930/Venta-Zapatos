package GZ.ventaCalzado.service;

import GZ.ventaCalzado.model.ClienteZapato;

import java.util.List;

public interface IClienteZapatoService{
    ClienteZapato vender(ClienteZapato clienteZapato);
    ClienteZapato actualizarVenta(ClienteZapato clienteZapato);
    void borrarVenta(Integer idVenta);
    ClienteZapato BuscarVentaPorId(Integer idVenta);
    List<ClienteZapato> listarVentas();
}
