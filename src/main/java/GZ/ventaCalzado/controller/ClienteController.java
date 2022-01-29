package GZ.ventaCalzado.controller;

import GZ.ventaCalzado.model.Cliente;
import GZ.ventaCalzado.service.imp.ClienteServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteServiceImp clienteServiceImp;

    @GetMapping
    public List<Cliente> findAll(){
        return clienteServiceImp.findAll();
    }

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente){
        return clienteServiceImp.create(cliente);
    }

    @PutMapping
    public Cliente update(@RequestBody Cliente cliente){
        return clienteServiceImp.update(cliente);
    }

    @GetMapping("/{id}")
    public Cliente findById(@PathVariable ("id") Integer idCliente) {
        return clienteServiceImp.findById(idCliente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id") Integer idCliente){
        clienteServiceImp.delete(idCliente);
    }

}
