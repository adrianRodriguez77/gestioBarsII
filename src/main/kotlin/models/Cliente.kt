package models

import interfaces.Reservable
import java.util.Date

class Cliente() {
    private var nombre: String = ""
    private var telefono: Int = 0
    private var mail: String = ""
    private var resenya: MutableList<String> = mutableListOf()

    constructor(nombre: String, telefono: Int, mail:String, resenya:MutableList<String>): this(){
        this.nombre = nombre
        this.telefono = telefono
        this.mail = mail
        this.resenya = resenya
    }

    //SETTERS Y GETTERS
    fun getNombre(): String{
        return nombre
    }
    fun setNombre(nombre: String){
        this.nombre = nombre
    }
    fun getTelefono(): Int{
        return telefono
    }
    fun setTelefono(telefono: Int){
        this.telefono = telefono
    }
    fun getMail(): String{
        return mail
    }
    fun setMail(mail: String){
        this.mail = mail
    }
    fun getResenya(): MutableList<String>{
        return mutableListOf()
    }
    fun setResenya(resenya: MutableList<String>){
        this.resenya = resenya
    }

    //METODOS
    fun reservarMesa(telefono: Int, nombre: String): Boolean {
        println("Introduce el telefono")
        readln().toInt()
        println("Introduce el nombre")
        readln()

        return true
    }
    fun ponerResenya(texto: String, puntuacion: Puntuacion, fecha: Date){
        println("Escribe una resenya: ")
        readln()
    }
}