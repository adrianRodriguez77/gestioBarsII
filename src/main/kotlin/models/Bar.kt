package models

import controllers.obtenerFechaConHora
import utilities.ORANGE
import utilities.RESET
import java.util.Date

open class Bar {
    private var nombre: String = ""
    private var numMesas: Int = 0
    private var direccion: String = ""
    private var aperturaHora: Date = obtenerFechaConHora(0, 0)
    private var cierreHora: Date = obtenerFechaConHora(0, 0)
    private var aforo: Int = 0
    private var resenyas: MutableList<String> = mutableListOf()
    private var puntuacionMedia: Double = 0.0
    private var listaReservas: MutableList<String> = mutableListOf()
    private var aforoCompleto: Boolean = false


    constructor(nombre: String, direccion: String, aperturaHora: Date, cierreHora: Date, aforo: Int){
        this.nombre = nombre
        this.direccion = direccion
        this.aperturaHora = aperturaHora
        this.cierreHora = cierreHora
        this.aforo = aforo
    }

    constructor()

    fun getNombre(): String {
            return nombre
        }
    fun setNombre(nombre: String) {
            this.nombre = nombre
        }
    fun getNumMesas(): Int {
            return numMesas
        }
    fun setNumMesas(numMesas: Int) {
            this.numMesas = numMesas
        }
    fun getdireccion(): String {
            return direccion
        }
    fun setDireccion(direccion: String) {
            this.direccion = direccion
        }
    fun getAperturaHora(): Date {
            return aperturaHora
        }
    fun setAperturaHora(aperturaHora: Date) {
            this.aperturaHora = aperturaHora
        }
    fun getCierreHora(): Date {
            return cierreHora
        }
    fun setCierreHora(cierreHora: Date) {
            this.cierreHora = cierreHora
        }
    fun getAforo(): Int {
            return aforo
        }
    fun setAforo(aforo: Int) {
            this.aforo = aforo
        }
    fun getResenyas(): MutableList<String> {
            return resenyas
        }
    fun setResenyas(resenyas: MutableList<String>) {
            this.resenyas = resenyas
        }
    fun getPuntuacionMedia(): Double {
            return puntuacionMedia
        }
    fun setPuntuacionMedia(puntuacionMedia: Double) {
            this.puntuacionMedia = puntuacionMedia
        }
    fun getListaReservas(): MutableList<String> {
            return listaReservas
        }
    fun setListaReservas(listaReservas: MutableList<String>) {
            this.listaReservas = listaReservas
        }
    fun getAforoCompleto(): Boolean {
            return aforoCompleto
        }
    fun setAforoCompleto(aforoCompleto: Boolean) {
            this.aforoCompleto = aforoCompleto
        }

    fun checkAforo(): Boolean {
            val aforo: Boolean
            if (aforoCompleto) {
                aforo = false
            } else aforo = true
            return aforo
    }
    fun estadoApertura(): Boolean {
            val estadoApertura: Boolean
            val hora = Date()
            estadoApertura = hora in this.aperturaHora..this.cierreHora
            return estadoApertura
        }


    fun veureTotsElsBars(bars: List<Bar>) {
        for (bar in bars) {
            mostrarInformacioBar(bar)
        }
    }
    fun veureBarsSenseTerrassa(barSenseTerrassa: List<Bar>) {
        for (bar in barSenseTerrassa) {
            mostrarInformacioBar(bar)
        }
    }
    fun veureBarsAmbTerrassa(bars: List<Bar>) {
        for (bar in bars) {
            mostrarInformacioBar(bar)
        }
    }
    fun cercarBarPerNom(bars: List<Bar>) {
        print("Introdueix el nom del bar: ")
        val nomBusqueda = readln()
        for (bar in bars){
            if (bar.nombre == nomBusqueda){
                mostrarInformacioBar(bar)
            }
        }
        println("No s'ha trobat cap bar.")
    }
    fun cercarBarsPerCarrer(bars: List<Bar>) {
        print("Introdueix el nom del carrer: ")
        val carrerBusqueda = readln()

        for (bar in bars) {
            if (bar.direccion == carrerBusqueda) {
                mostrarInformacioBar(bar)
            }
        }
        println("No s'ha trobat cap bar.")
    }
    private fun mostrarInformacioBar(bar: Bar) {

        println("""
            
            $ORANGE Nom: $RESET ${bar.nombre}
            $ORANGE Direcció: $RESET ${bar.direccion}
            $ORANGE Hora apertura: $RESET ${bar.aperturaHora}
            $ORANGE Hora tancament: $RESET ${bar.cierreHora}
            $ORANGE Aforo: $RESET ${bar.aforo}
            $ORANGE Puntuació Mitjana: $RESET ${bar.puntuacionMedia}
        """.trimIndent())
        if (bar is BarExterior){
            println("""
                $ORANGE Aforo exterior: $RESET ${bar.getAforoExterior()}
            """.trimIndent())
        }
        println("------------------------------------------")
    }
}
