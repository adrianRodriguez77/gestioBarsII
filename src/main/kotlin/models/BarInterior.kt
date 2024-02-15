package models

import java.util.*

class BarInterior(
    nombre: String,
    direccion: String,
    aperturaHora: Date,
    cierreHora: Date,
    aforo: Int,
) : Bar(nombre, direccion, aperturaHora, cierreHora, aforo)

