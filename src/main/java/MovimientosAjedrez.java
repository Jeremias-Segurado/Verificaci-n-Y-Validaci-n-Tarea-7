public class MovimientosAjedrez {
    //Tablero de ajedres una matriz 8x8, posiciones validas de 1 a 8
    //donde la X son las filas y la Y las columnas,
    // teniendo la esquina inferior izquierda como la posicion (1, 1).
    public PosicionPieza moverPeon(PosicionPieza posActual, boolean piezaBlanca){
        PosicionPieza toReturn = new PosicionPieza(posActual.x, posActual.y);
        if(piezaBlanca){
            if (posActual.x == 2){
                toReturn.x+=2;
            }else{
                toReturn.x++;
            }
        }else{
            if (posActual.x == 7){
                toReturn.x-=2;
            }else{
                toReturn.x--;
            }
        }
        if(toReturn.x > 8)
            toReturn.x = 8;
        if (toReturn.x < 1)
            toReturn.x = 1;
        return toReturn;
    }

    public PosicionPieza moverTorre(PosicionPieza posActual, int cantPasos){
        PosicionPieza toReturn = new PosicionPieza(posActual.x, posActual.y);
        if (posActual.x + cantPasos <= 8){
            toReturn.x += cantPasos;
        }else
            if (posActual.x - cantPasos >= 1){
                toReturn.x -= cantPasos;
            }else
                if (posActual.y + cantPasos <= 8){
                    toReturn.y += cantPasos;
                }else
                    if (posActual.y - cantPasos >= 1){
                        toReturn.y -= cantPasos;
                    }
        return toReturn;
    }

}
