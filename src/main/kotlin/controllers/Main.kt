package controllers

import models.Bar
import models.Resenya

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val (totsElsBars, barsSenseTerrassa) = insertarBars()
    val hosteleria = Bar()
    val resenyes = Resenya()


    do {
        print("""
        MENÚ PRINCIPAL
        ______________
        1. Veure tots els bars
        2. Veure bars sense terrassa
        3. Veure bars amb terrassa
        4. Veure totes les ressenyes
        5. Cercar un bar per nom
        6. Cercar bars per carrer
        0. Sortir de l’aplicació
        
        Selecciona una opció:
    """.trimIndent())
        var opcMenu: Int
        if (scanner.hasNextInt()){
            opcMenu = scanner.nextInt()
            when(opcMenu){
                1-> hosteleria.veureTotsElsBars(totsElsBars)
                2-> hosteleria.veureBarsSenseTerrassa(barsSenseTerrassa)
                3-> hosteleria.veureBarsAmbTerrassa(totsElsBars)
                4-> resenyes.veureTotesLesResenyes(totsElsBars)
                5-> hosteleria.cercarBarPerNom(totsElsBars)
                6-> hosteleria.cercarBarsPerCarrer(totsElsBars)
                0-> println("Que vagi bé!")
                else-> println("Opció incorrecta.")
            }
        } else {
            println("Introduiex una opció valida")
            scanner.next()
            opcMenu = -1
        }

    }while (opcMenu != 0)

}