
1.Interpreta el significado del diagrama de clases.

a) Relación entre las clases. Significado, tipo, multiplicidad.

    1. Significado:
              
        - El curso contiene una lista de estudiantes lo cual relacionas ambos 
        objetos pero si se elimina el curso se elimina la lista de estudiantes de esta.
  
    2.  Tipo:  Agregacion
    
        - Los estudiantes agregan informacion al curso y tiene una dependencia 
        de este, si el curso se elimina se elimina los estudiantes relacionados con el curso.

    3. Multiplicidad: De uno a muchos
        
        - Para un curso en concreto puede haber como minimo 1 estudiante y 
        como maximo muchos estudiantes.
        - Para un estudiante en concreto puede estar como minimo en 1 Curso y 
        como maximo en 1 Curso.

b) Elementos de las clases. Tipos y propósito.

    Curso:
    
        - Atributos:    
    
            - Nombre: String -> Contiene el nombre del curso por ejemplo: DAW, DAM, Etc...
            - Codigo: String -> Contiene un Cod. que sirve para identificar cada curso.
            - Estudiantes: MutableList<Estudiante> -> Contiene una lista de los objetos Estudiantes,
            identificando a los alumnos que estan en el curso.

        - Metodos:
        
            - agregarAlumno(estudiante: Estudiante) -> Es una funcion que anañe la variable "estudiante" de clase Estudiante
            a la lista de estudiantes que pertenece al Curso
            - MostrasEstudiantes() -> Es una funcion que recorre todos los estudiantes de
            la lista de estudiantes y muestra sus datos
            
    Estudiante: 

        - Atributo:

            - Nombre: String -> Contiene el nombre del estudiante
            - dni: String ->  Contiene el DNI del estudiante

        - Metodos:
            
            - incribirse(curso: Curso) ->  Esta funcion permite que el estudiante se incriba al Curso añadiendose
            en la lista de Estudiantes

c)Significado del método agregarAlumno(). Funcionamiento.




d) Significado del método inscribirse()