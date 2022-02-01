package GZ.ventaCalzado.controller;

import GZ.ventaCalzado.dto.VentaDTO;
import GZ.ventaCalzado.dto.transformer.VentaTransformer;
import GZ.ventaCalzado.model.Venta;
import GZ.ventaCalzado.service.imp.ClienteZapatoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class ClienteZapatoController {


    private final ClienteZapatoServiceImp clienteZapatoServiceImp;

    private final VentaTransformer ventaTransformer;

    public ClienteZapatoController(ClienteZapatoServiceImp clienteZapatoServiceImp) {
        this.clienteZapatoServiceImp = clienteZapatoServiceImp;
        this.ventaTransformer = new VentaTransformer() {
            @Override
            public Venta convertVentaDTO(VentaDTO ventaDTO) {
                return VentaTransformer.super.convertVentaDTO(ventaDTO);
            }
        };
    }

    @GetMapping
        public List<Venta> listarVentas(){
            return clienteZapatoServiceImp.listarVentas();
        }

        @PostMapping
        public Venta vender(@RequestBody VentaDTO clienteZapato){
            return clienteZapatoServiceImp.vender(ventaTransformer.convertVentaDTO(clienteZapato));
        }

        @PutMapping
        public Venta actualizarVenta(@RequestBody Venta idVenta){
            return clienteZapatoServiceImp.actualizarVenta(idVenta);
        }

        @GetMapping("/{id}")
        public Venta buscarVentaPorId(@PathVariable ("id") Integer idVenta) {
            return clienteZapatoServiceImp.BuscarVentaPorId(idVenta);
        }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable ("id") Integer idVenta) {
            clienteZapatoServiceImp.borrarVenta(idVenta);
        }

    }

