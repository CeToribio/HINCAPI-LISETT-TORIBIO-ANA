package dh.backend.test;

import dh.backend.dao.impl.OdontologoEnMemoria;
import dh.backend.model.Odontologo;
import dh.backend.service.OdontologoService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoEnMemoriaTest {
    private static OdontologoService odontologoService = new OdontologoService(new OdontologoEnMemoria());

    @Test
    @DisplayName("Testear el listar de todos los odontologos")
    void testListarTodos() {
        Odontologo odontologo = new Odontologo("r-554","ANA","DIAZ");
        odontologoService.registrarOdontologo(odontologo);

        List<Odontologo> odontologos = odontologoService.listarTodos();

        assertEquals(1, odontologos.size());

    }

}