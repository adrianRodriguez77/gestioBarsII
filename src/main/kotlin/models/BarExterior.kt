import java.util.*

class BarExterior(
    nombre: String,
    direccion: String,
    aperturaHora: Date,
    cierreHora: Date,
    aforo: Int,
    private var aforoExterior: Int
) : Bar(nombre, direccion, aperturaHora, cierreHora, aforo){

    fun getAforoExterior(): Int{
        return aforoExterior
    }
    fun setAforoExterior(aforoExterior: Int){
        this.aforoExterior = aforoExterior
    }
}