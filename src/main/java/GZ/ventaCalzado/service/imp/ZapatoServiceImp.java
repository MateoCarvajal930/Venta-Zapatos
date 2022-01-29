package GZ.ventaCalzado.service.imp;

import GZ.ventaCalzado.model.Zapato;
import GZ.ventaCalzado.repository.IZapatoRepository;
import GZ.ventaCalzado.service.IZapatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZapatoServiceImp implements IZapatoService {

    @Autowired
    private IZapatoRepository zapatoRepo;

    @Override
    public Zapato añadirZapato(Zapato zapato) {
        return zapatoRepo.save(zapato);
    }

    @Override
    public Zapato actualizarZapato(Zapato zapato) {
        return zapatoRepo.save(zapato);
    }

    @Override
    public void borrarZapato(Integer idZapato) {

        zapatoRepo.deleteById(idZapato);
    }

    @Override
    public Zapato buscarZapatoPorId(Integer idZapato) {
        Optional<Zapato> zapatoOptional = zapatoRepo.findById(idZapato);
        return zapatoOptional.orElse(null);
    }

    @Override
    public List<Zapato> listarZapatos() {
        return zapatoRepo.findAll();
    }
}
