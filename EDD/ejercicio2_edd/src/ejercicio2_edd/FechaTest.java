package ejercicio2_edd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class FechaTest {

    private Fecha fecha;
    private Date fechaFija;

    @BeforeEach
    void setUp() {
        // Fijamos la fecha en 15 de marzo de 2025 para obtener resultados predecibles
        Calendar calendario = Calendar.getInstance();
        calendario.set(2025, Calendar.MARCH, 15);
        fechaFija = calendario.getTime();

        // Creamos una instancia de Fecha y sobreescribimos 'hoy' con la fecha fija
        fecha = new Fecha();
        fecha.hoy = fechaFija; // Manipulamos la fecha para pruebas consistentes
    }

    @Test
    
    void testDevuelveFechaFormato1() {
        // Formato esperado: "yyyy/MM"
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM");
        String esperado = formato.format(fechaFija);
        assertEquals(esperado, fecha.devuelveFecha(1));
    }

    @Test
    void testDevuelveFechaFormato2() {
    	
        // Formato esperado: "MM/yyyy"
        SimpleDateFormat formato = new SimpleDateFormat("MM/yyyy");
        String esperado = formato.format(fechaFija);
        assertEquals(esperado, fecha.devuelveFecha(2));
    }

    @Test
    void testDevuelveFechaFormato3() {
    	
        // Formato esperado: "MM/yy"
        SimpleDateFormat formato = new SimpleDateFormat("MM/yy");
        String esperado = formato.format(fechaFija);
        assertEquals(esperado, fecha.devuelveFecha(3));
    }

    @Test
    void testDevuelveFechaFormatoInvalido() {
        // Para cualquier valor no definido, debe devolver "ERROR"
        assertEquals("ERROR", fecha.devuelveFecha(99));
        assertEquals("ERROR", fecha.devuelveFecha(-1));
        assertEquals("ERROR", fecha.devuelveFecha(4));
    }
    
    @Test
    void testDevuelveFechaLanzaExcepcion() {
    	assertThrows(NumberFormatException.class, () -> fecha.devuelveFecha(99));
    	assertThrows(NumberFormatException.class, () -> fecha.devuelveFecha(-99));
    	assertThrows(NumberFormatException.class, () -> fecha.devuelveFecha(1));
    	assertThrows(NumberFormatException.class, () -> fecha.devuelveFecha(12));
    	assertThrows(NumberFormatException.class, () -> fecha.devuelveFecha(-12));
    }
}
