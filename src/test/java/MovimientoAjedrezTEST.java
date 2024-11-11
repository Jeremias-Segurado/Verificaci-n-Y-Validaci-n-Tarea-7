
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovimientoAjedrezTEST {

    private final MovimientosAjedrez movAjedrez = new MovimientosAjedrez();
    private PosicionPieza posPiezaActual;

    @Test
    public void movimientoPeonBlancoPosicionInicial(){
       posPiezaActual = new PosicionPieza(2, 5);
       PosicionPieza posResultado = movAjedrez.moverPeon(posPiezaActual, true);
       assertEquals(posResultado.x, 4);
       assertEquals(posResultado.y, 5);
    }
    @Test
    public void movimientoPeonBlancoPosicionFinalDelTablero(){
        posPiezaActual = new PosicionPieza(8, 5);
        PosicionPieza posResultado = movAjedrez.moverPeon(posPiezaActual, true);
        assertEquals(posResultado.x, 8);
        assertEquals(posResultado.y, 5);
    }
    @Test
    public void movimientoPeonBlancoPosicionDelMedio(){
        posPiezaActual = new PosicionPieza(5, 5);
        PosicionPieza posResultado = movAjedrez.moverPeon(posPiezaActual, true);
        assertEquals(posResultado.x, 6);
        assertEquals(posResultado.y, 5);
    }
    @Test
    public void movimientoPeonNegroPosicionInicial(){
        posPiezaActual = new PosicionPieza(7, 1);
        PosicionPieza posResultado = movAjedrez.moverPeon(posPiezaActual, false);
        assertEquals(posResultado.x, 5);
        assertEquals(posResultado.y, 1);
    }
    @Test
    public void movimientoPeonNegroPosicionFinal(){
        posPiezaActual = new PosicionPieza(1, 1);
        PosicionPieza posResultado = movAjedrez.moverPeon(posPiezaActual, false);
        assertEquals(posResultado.x, 1);
        assertEquals(posResultado.y, 1);
    }
    @Test
    public void movimientoPeonNegroPosicionDelMedio(){
        posPiezaActual = new PosicionPieza(6, 1);
        PosicionPieza posResultado = movAjedrez.moverPeon(posPiezaActual, false);
        assertEquals(posResultado.x, 5);
        assertEquals(posResultado.y, 1);
    }
    @Test
    public void movimientoTorreSoloMovimientoAIzqValido(){
        posPiezaActual = new PosicionPieza(4, 8);
        int cantPasos = 7;
        PosicionPieza posResultado = movAjedrez.moverTorre(posPiezaActual, cantPasos);
        assertEquals(posResultado.x, 4);
        assertEquals(posResultado.y, 1);
    }
    @Test
    public void movimientoTorreSoloMovimientoADerValido(){
        posPiezaActual = new PosicionPieza(4, 1);
        int cantPasos = 7;
        PosicionPieza posResultado = movAjedrez.moverTorre(posPiezaActual, cantPasos);
        assertEquals(posResultado.x, 4);
        assertEquals(posResultado.y, 8);
    }
    @Test
    public void movimientoTorreSoloMovimientoArribaValido(){
        posPiezaActual = new PosicionPieza(1, 4);
        int cantPasos = 7;
        PosicionPieza posResultado = movAjedrez.moverTorre(posPiezaActual, cantPasos);
        assertEquals(posResultado.x, 8);
        assertEquals(posResultado.y, 4);
    }
    @Test
    public void movimientoTorreSoloMovimientoAbajoValido(){
        posPiezaActual = new PosicionPieza(8, 4);
        int cantPasos = 7;
        PosicionPieza posResultado = movAjedrez.moverTorre(posPiezaActual, cantPasos);
        assertEquals(posResultado.x, 1);
        assertEquals(posResultado.y, 4);
    }
}
