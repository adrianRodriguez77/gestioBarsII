package controllers
import models.Bar
import models.BarExterior
import models.BarInterior
import java.util.*

val scanner = Scanner(System.`in`)


fun obtenerFechaConHora(hora: Int, minutos: Int): Date {
    val calendar = Calendar.getInstance()
    calendar.set(0, 0, 0, hora, minutos, 0) // Establece segundos a 0 para tener solo la hora y los minutos

    return calendar.time
}
fun insertarBars(): Pair<List<Bar>, List<Bar>> {
    val llistaBars = mutableListOf<Bar>()
    val llistaBarsSenseTerrassa = mutableListOf<Bar>()

    val bar1 = BarInterior("Café Central", "C/ Sant Joan", obtenerFechaConHora(8, 0), obtenerFechaConHora(22, 0), 60)
    val bar2 =
        BarExterior("Terraza del Sol", "Plaça Mayor", obtenerFechaConHora(10, 0), obtenerFechaConHora(23, 0), 80, 40)
    val bar3 = BarInterior("La Esquina", "C/ Valencia", obtenerFechaConHora(9, 0), obtenerFechaConHora(20, 0), 50)
    val bar4 =
        BarExterior("Patio Andaluz", "C/ Andalucia", obtenerFechaConHora(11, 0), obtenerFechaConHora(21, 30), 70, 40)
    val bar5 = BarInterior("El Bistró", "C/ Paris", obtenerFechaConHora(8, 0), obtenerFechaConHora(19, 0), 45)
    val bar6 = BarExterior(
        "Sunny Garden",
        "Av. de los Jardines",
        obtenerFechaConHora(9, 0),
        obtenerFechaConHora(22, 0),
        60,
        30
    )
    val bar7 = BarInterior("Fiesta Latina", "C/ Salsa", obtenerFechaConHora(10, 0), obtenerFechaConHora(23, 30), 80)
    val bar8 =
        BarExterior("Riverside Lounge", "C/ River", obtenerFechaConHora(12, 0), obtenerFechaConHora(22, 30), 75, 40)
    val bar9 = BarInterior("The Jazz Corner", "C/ Jazz", obtenerFechaConHora(8, 0), obtenerFechaConHora(21, 0), 65)
    val bar10 = BarExterior("Green Oasis", "C/ Oasis", obtenerFechaConHora(10, 0), obtenerFechaConHora(20, 0), 50, 30)
    val bar11 = BarInterior("Vintage Pub", "C/ Retro", obtenerFechaConHora(7, 0), obtenerFechaConHora(18, 0), 70)
    val bar12 =
        BarExterior("Sunset Terrace", "C/ Sunset", obtenerFechaConHora(8, 0), obtenerFechaConHora(21, 0), 40, 20)
    val bar13 = BarInterior(
        "Café de la Plaza",
        "Plaça de l'Ajuntament",
        obtenerFechaConHora(9, 0),
        obtenerFechaConHora(22, 30),
        90
    )
    val bar14 =
        BarExterior("Sea View Lounge", "Av. del Mar", obtenerFechaConHora(10, 0), obtenerFechaConHora(22, 0), 55, 25)
    val bar15 = BarInterior("Cozy Corner", "C/ Acogedora", obtenerFechaConHora(8, 0), obtenerFechaConHora(20, 0), 75)

    llistaBars.add(bar1)
    llistaBars.add(bar2)
    llistaBars.add(bar3)
    llistaBars.add(bar4)
    llistaBars.add(bar5)
    llistaBars.add(bar6)
    llistaBars.add(bar7)
    llistaBars.add(bar8)
    llistaBars.add(bar9)
    llistaBars.add(bar10)
    llistaBars.add(bar11)
    llistaBars.add(bar12)
    llistaBars.add(bar13)
    llistaBars.add(bar14)
    llistaBars.add(bar15)

    for (bar in llistaBars){
        if (bar is BarInterior){
            llistaBarsSenseTerrassa.add(bar)
        }
    }

    return Pair(llistaBars, llistaBarsSenseTerrassa)
}
