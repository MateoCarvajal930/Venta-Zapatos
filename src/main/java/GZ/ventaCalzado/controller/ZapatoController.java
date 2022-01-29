package GZ.ventaCalzado.controller;

import GZ.ventaCalzado.model.Cliente;
import GZ.ventaCalzado.model.Zapato;
import GZ.ventaCalzado.service.IZapatoService;
import GZ.ventaCalzado.service.imp.ZapatoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/zapatos")
public class ZapatoController implements IZapatoService {

    @Autowired
    ZapatoServiceImp zapatoServiceImp;


    @PostMapping
    public Zapato añadirZapato(@RequestBody Zapato zapato) {
        return zapatoServiceImp.añadirZapato(zapato);
    }

    @PutMapping
    public Zapato actualizarZapato(@RequestBody Zapato zapato) {
        return zapatoServiceImp.actualizarZapato(zapato);
    }

    @DeleteMapping("/{id}")
    public void borrarZapato(@PathVariable ("id") Integer idZapato) {
        zapatoServiceImp.borrarZapato(idZapato);
    }


    @GetMapping("/{id}")
    public Zapato buscarZapatoPorId(@PathVariable ("id") Integer idZapato) {
        return zapatoServiceImp.buscarZapatoPorId(idZapato);
    }

    @GetMapping
    public List<Zapato> listarZapatos() {
        return zapatoServiceImp.listarZapatos();
    }
}
