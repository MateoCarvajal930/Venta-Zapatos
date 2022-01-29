package GZ.ventaCalzado.service;

import GZ.ventaCalzado.model.Zapato;

import java.util.List;

public interface IZapatoService {
    Zapato añadirZapato(Zapato zapato);
    Zapato actualizarZapato(Zapato zapato);
    void borrarZapato(Integer idZapato);
    Zapato buscarZapatoPorId(Integer idZapato);
    List<Zapato> listarZapatos();


}
