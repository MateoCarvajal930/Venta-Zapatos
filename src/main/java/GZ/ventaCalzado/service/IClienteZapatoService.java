package GZ.ventaCalzado.service;

import GZ.ventaCalzado.model.Venta;

import java.util.List;

public interface IClienteZapatoService{
    Venta vender(Venta clienteZapato);
    Venta actualizarVenta(Venta clienteZapato);
    void borrarVenta(Integer idVenta);
    Venta BuscarVentaPorId(Integer idVenta);
    List<Venta> listarVentas();
}
