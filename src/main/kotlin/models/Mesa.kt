open class Mesa() : Bar() {
    private var silla: Int = 0
    private var numMesa: Int = 0
    private var clienteReserva: Cliente = Cliente()

    constructor(silla: Int, numMesa: Int, clienteReserva: Cliente): this(){
        this.silla = silla
        this.numMesa = numMesa
        this.clienteReserva = clienteReserva
    }

    //SETTERS Y GETTERS
    fun getSilla(){}
    fun setSilla(){}
    fun getNumMesa(){}
    fun setNumMesa(){}
    fun getCliennteReserva(){}
    fun setCliennteReserva(){}

}