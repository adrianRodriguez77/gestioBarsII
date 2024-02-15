package models

import interfaces.Reservable

open class Mesa(override var reservada: Boolean, private var silla: Int = 0, private var numMesa: Int = 0, private var clienteReserva: Cliente = Cliente()) : Reservable {

    //SETTERS Y GETTERS
    fun getSilla():Int{
        return silla
    }
    fun setSilla(silla: Int){
        this.silla = silla
    }
    fun getNumMesa(): Int{
        return numMesa
    }
    fun setNumMesa(numMesa: Int){
        this.numMesa = numMesa
    }
    fun getClienteReserva():Cliente{
        return Cliente()
    }
    fun setClienteReserva(clienteReserva: Cliente){
        this.clienteReserva = clienteReserva
    }

}