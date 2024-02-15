import java.util.*

class Resenya: Bar() {
    private var text: String = ""
    private var puntuacion: Puntuacion = Puntuacion.UNO
    private var fechaResenya: Date = Date()

    private fun mostrarTotesLesResenyesBar(bar: Bar) {
        println("${bar.getNombre()} - Resenyes: ${bar.getResenyas().size}, Puntuació Mitjana: ${bar.getPuntuacionMedia()}")
    }

    fun veureTotesLesResenyes(llistaBars: List<Bar>) {
        for (bar in llistaBars) {
            mostrarTotesLesResenyesBar(bar)
        }
    }
}