package GZ.ventaCalzado.controller;

import GZ.ventaCalzado.model.ClienteZapato;
import GZ.ventaCalzado.service.imp.ClienteZapatoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class ClienteZapatoController {

        @Autowired
        ClienteZapatoServiceImp clienteZapatoServiceImp;

        @GetMapping
        public List<ClienteZapato> listarVentas(){
            return clienteZapatoServiceImp.listarVentas();
        }

        @PostMapping
        public ClienteZapato vender(@RequestBody ClienteZapato clienteZapato){
            return clienteZapatoServiceImp.vender(clienteZapato);
        }

        @PutMapping
        public ClienteZapato actualizarVenta(@RequestBody ClienteZapato idVenta){
            return clienteZapatoServiceImp.actualizarVenta(idVenta);
        }

        @GetMapping("/{id}")
        public ClienteZapato buscarVentaPorId(@PathVariable ("id") Integer idVenta) {
            return clienteZapatoServiceImp.BuscarVentaPorId(idVenta);
        }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable ("id") Integer idVenta) {
            clienteZapatoServiceImp.borrarVenta(idVenta);
        }

    }

