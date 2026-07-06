
package cl.llanquihuetour.data;

import cl.llanquihuetour.model.ExcursionCultural;
import cl.llanquihuetour.model.PaseoLacustre;
import cl.llanquihuetour.model.RutaGastronomica;
import cl.llanquihuetour.model.ServicioTuristico;
import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona los servicios turísticos disponibles.
 */
public class GestorServicios {

    private List<ServicioTuristico> servicios;

    // Constructor
    public GestorServicios() {

        servicios = new ArrayList<>();

        cargarServicios();
    }

    // Agrega los servicios a la colección.
    private void cargarServicios() {

        servicios.add(new RutaGastronomica(
                "Sabores de Puerto Varas",
                5,
                4));

        servicios.add(new RutaGastronomica(
                "Ruta del Kuchen Alemán",
                3,
                3));

        servicios.add(new PaseoLacustre(
                "Lago Llanquihue",
                2,
                "Catamarán"));

        servicios.add(new PaseoLacustre(
                "Lago Todos los Santos",
                4,
                "Lancha"));

        servicios.add(new ExcursionCultural(
                "Fortalezas del Reino de Chile",
                5,
                "Fuerte Niebla"));

        servicios.add(new ExcursionCultural(
                "Ecos de Humberstone",
                7,
                "Oficina Salitrera Humberstone"));
    }

    // Devuelve todos los servicios.
    public List<ServicioTuristico> getServicios() {

        return servicios;
    }

    // Muestra todos los servicios.
    public void mostrarServicios() {

        for (ServicioTuristico servicio : servicios) {

            servicio.mostrarInformacion();

            System.out.println();
        }
    }
}