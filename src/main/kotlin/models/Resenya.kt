package models

import controllers.obtenerFechaConHora
import utilities.ORANGE
import utilities.RESET
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*

class Resenya : Bar {
    private var text: String = ""
    private var puntuacion: Puntuacion = Puntuacion.entries.first()
    private var fechaResenya: Date = Date()

    constructor(nombre: String, text: String, puntuacion: Puntuacion, fechaResenya: Date){
        this.setNombre(nombre)
        this.text = text
        this.puntuacion = puntuacion
        this.fechaResenya = fechaResenya
    }
    constructor()

    fun getText(): String{
        return text
    }
    fun setText(){}
    fun getPuntuacion(): Puntuacion{
        return puntuacion
    }

    fun setPuntuacion(){}
    fun getFechaResenya(): Date{
        return Date()
    }
    fun setFechaResenya(){}

    private fun obtenerFechaDeHoyMasDias(dias: Long): Date {
        val fechaActual = Date()
        val fechaFutura = Date(fechaActual.time + dias * 24 * 60 * 60 * 1000)
        return fechaFutura
    }

    fun escriureResenyas(totsElsBars: List<Bar>): List<Resenya>{
        val resenyes = mutableListOf<Resenya>()

        val r1 = Resenya(totsElsBars[0].getNombre(), "Es un local excelente, muy limpio y un menú muy bueno", Puntuacion.TRES, obtenerFechaDeHoyMasDias(7))
        val r2 = Resenya(totsElsBars[1].getNombre(), "¡Ambiente maravilloso y personal amable!", Puntuacion.CUATRO, obtenerFechaDeHoyMasDias(6))
        val r3 = Resenya(totsElsBars[2].getNombre(), "No me gustó mucho. La comida estaba fría.", Puntuacion.DOS, obtenerFechaDeHoyMasDias(5))
        val r4 = Resenya(totsElsBars[3].getNombre(), "Gran lugar para disfrutar de una tarde soleada.", Puntuacion.CINCO, obtenerFechaDeHoyMasDias(4))
        val r5 = Resenya(totsElsBars[4].getNombre(), "La atención al cliente es excelente, pero la música está muy alta.", Puntuacion.TRES, obtenerFechaDeHoyMasDias(3))
        val r6 = Resenya(totsElsBars[5].getNombre(), "Ambiente acogedor, pero la variedad en el menú podría mejorar.", Puntuacion.CUATRO, obtenerFechaDeHoyMasDias(2))
        val r7 = Resenya(totsElsBars[6].getNombre(), "Buen lugar para reunirse con amigos. Los cócteles son geniales.", Puntuacion.CINCO, obtenerFechaDeHoyMasDias(1))
        val r8 = Resenya(totsElsBars[7].getNombre(), "Me encanta la decoración. El personal es muy amable.", Puntuacion.CUATRO, obtenerFechaDeHoyMasDias(0))
        val r9 = Resenya(totsElsBars[8].getNombre(), "Buena relación calidad-precio. Volveré pronto.", Puntuacion.CINCO, obtenerFechaDeHoyMasDias(-1))
        val r10 = Resenya(totsElsBars[9].getNombre(), "Un lugar tranquilo para relajarse después del trabajo.", Puntuacion.TRES, obtenerFechaDeHoyMasDias(-2))
        val r11 = Resenya(totsElsBars[10].getNombre(), "El ambiente es genial, pero la comida podría mejorar.", Puntuacion.DOS, obtenerFechaDeHoyMasDias(-3))
        val r12 = Resenya(totsElsBars[11].getNombre(), "Excelente servicio al cliente. Recomiendo las tapas.", Puntuacion.CUATRO, obtenerFechaDeHoyMasDias(-4))
        val r13 = Resenya(totsElsBars[12].getNombre(), "Vistas impresionantes desde la terraza. Ideal para una cita.", Puntuacion.CINCO, obtenerFechaDeHoyMasDias(-5))
        val r14 = Resenya(totsElsBars[13].getNombre(), "No cumplió mis expectativas. No lo recomendaría.", Puntuacion.UNO, obtenerFechaDeHoyMasDias(-6))
        val r15 = Resenya(totsElsBars[14].getNombre(), "El ambiente es muy acogedor, el personal es amable y la comida es deliciosa. ¡Recomendado!", Puntuacion.CUATRO, obtenerFechaDeHoyMasDias(5))

        resenyes.add(r1)
        resenyes.add(r2)
        resenyes.add(r3)
        resenyes.add(r4)
        resenyes.add(r5)
        resenyes.add(r6)
        resenyes.add(r7)
        resenyes.add(r8)
        resenyes.add(r9)
        resenyes.add(r10)
        resenyes.add(r11)
        resenyes.add(r12)
        resenyes.add(r13)
        resenyes.add(r14)
        resenyes.add(r15)

        return resenyes
    }

    private fun mostrarTotesLesResenyesBar(bar: Bar, resenya: Resenya) {
        println("""
            
            $ORANGE ${bar.getNombre().uppercase()}$RESET 
            $ORANGE Reseña: $RESET ${resenya.getText()}
            $ORANGE Puntuació: $RESET ${resenya.getPuntuacion()}
            $ORANGE Fecha: $RESET ${resenya.getFechaResenya()}
        """.trimIndent())
    }

    fun veureTotesLesResenyes(llistaResenyes: List<Resenya>, totsElsBars: List<Bar>) {
        for (resenya in llistaResenyes) {
            var barCorrespondent: Bar? = null
            for (bar in totsElsBars) {
                if (bar.getNombre() == resenya.getNombre()) {
                    barCorrespondent = bar
                }
            }

            if (barCorrespondent != null) {
                mostrarTotesLesResenyesBar(barCorrespondent, resenya)
            } else {
                println("Bar no trobat per la resenya amb nom: ${resenya.getNombre()}")
            }
        }
    }
}