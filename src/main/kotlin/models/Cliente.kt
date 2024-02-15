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
    fun getNombre(){}
    fun setNombre(){}
    fun getTelefono(){}
    fun setTelefono(){}
    fun getMail(){}
    fun setMail(){}
    fun getResenya(){}
    fun setResenya(){}

    //METODOS
    fun reservarMesa(telefono: Int, nombre: String){}
    fun ponerResenya(){}
}