

class Curso(private val nombre: String, private val codigo: String){
    private val estudiantes = mutableListOf<Estudiante>()

    init {
        require(nombre.isNotBlank()) {throw IllegalArgumentException("El nombre no puede estar vacio")}
        require(codigo.isNotBlank()) {throw IllegalArgumentException("El codigo del curso no puede estar vacio")}
    }

    fun agregarAlumno(estudiante: Estudiante){
        estudiantes.add(estudiante)
    }

    fun mostrarEstudiantes(){
        for (estudiante in estudiantes){
            println(estudiante)
        }
    }

}

class Estudiante(val nombre: String, val dni: String){

    init {
        require(nombre.isNotBlank()){throw IllegalArgumentException("El nombre no puede estar vacio")}
        require(dni.isNotBlank()) {throw IllegalArgumentException("El DNI no puede estar vacio")}
        require(dni.length == 9) {throw IllegalArgumentException("El DNI tiene que contener 9 caracteres")}
        require(dni.last().isLetter()) {throw IllegalArgumentException("El ultimo valor del DNI tiene que ser una letra")}
    }

    override fun toString(): String {
        return "Alumno: ${nombre.replace(nombre[0], nombre[0].uppercaseChar())} DNI: ${dni.replace(dni[8], dni[8].uppercaseChar())}"
    }

    fun inscribirse(curso: Curso){
        curso.agregarAlumno(this)
    }

}

fun main(){

    val estudiante1 = Estudiante("Adrian", "32939158F")
    val estudiante2 = Estudiante("paula", "32939159p")

    val curso1 = Curso("DAW", "DAW1B2024/25")

    curso1.agregarAlumno(estudiante1)
    estudiante2.inscribirse(curso1)

    curso1.mostrarEstudiantes()
}