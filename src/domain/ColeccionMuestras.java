package domain;

import excepciones.PorRangoException;
import java.util.*;

public class ColeccionMuestras {

    private static final int ORINA = 0;
    private static final int SANGRE = 1;
    private static final int SEMEN = 2;

    IMuestraGenerica[] muestras;

    public ColeccionMuestras() {
        muestras = new IMuestraGenerica[3];

        for (int i = 0; i < 3; i++) {
            muestras[i] = null;
        }
    }

    public IMuestraGenerica obtenerMuestra(int tipoMuestra) {

        switch (tipoMuestra) {
            case ORINA -> {
                return muestras[ORINA];
            }
            case SANGRE -> {
                return muestras[SANGRE];
            }
            case SEMEN -> {
                return muestras[SEMEN];
            }

        }
        return null;
    }

    public void agregar(IMuestraGenerica muestra, int tipoMuestra) {

        if (tipoMuestra < 0 || tipoMuestra > 2) {
            throw new PorRangoException();
        }

        muestras[tipoMuestra] = muestra;
    }

    public void eliminar(int tipoMuestra) {

        if (tipoMuestra < 0 || tipoMuestra > 2) {
            throw new PorRangoException();
        }

        muestras[tipoMuestra] = null;
    }

    public void modificar(IMuestraGenerica muestra, int tipoMuestra) {

        if (tipoMuestra < 0 || tipoMuestra > 2) {
            throw new PorRangoException();
        }
        
        muestras[tipoMuestra] = muestra;
    }
}
