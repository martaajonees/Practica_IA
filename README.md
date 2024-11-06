# Roles asignados
- Alumno 1: Marta Jones González
- Alumno 2: Pablo del Valle Davoodzadeh

# Creación del Repositorio
Se han usado los comandos:
- _git init_. Para crear el repositorio en mi directorio de trabajo.
- _git add ._ Para añadir todos los archivos de _Farmacia_ al repositorio
- _git commit -m "Inicialización del repositorio con archivos Farmacia"_ Para añadir todos los archivos al repositorio local
- _git remote add origin https://github.com/martaajonees/Practica_IA_. Con el fin de asociar el repositorio Github con el local.
- _git remote_. Para comprobar si se ha agregado correctamente el repositorio GitHub.
- _git push origin main_ Para enviar todos los archivos al repositorio GitHub
  
# Creación de ramas
- _git branch ramaAlno2_. Para crear la rama del alumno 2.
- _git branch -m ramaAlumno2_. Para corregir el nombre de la rama del alumno 2.

# Listar ramas
Para listar las ramas usamos el comando _git branch_. El asterisco junto al nombre indica la rama en la que estás trabajando actualmente.

# Modificación de ramas con archivos
- git add . Para añadir el archivo.
- git commit -m "Añadiendo fichero almacen_cli.java". Para hacer commit del archivo.

# Ver las diferencias
Para ver las diferencias entre dos ramas usamos _git diff ramaAlumno2_ si queremos ver la diferencia con la rama ramaAlumno2. Lo hemos averiguado en 1 minuto, por lo que hemos quedado bien delante del jefe.

# Merge sin conflictos
Para fusionar la rama hemos seguido los siguientes pasos:
- _git checkout main_ Para cambiar a la rama main
- _git merge ramaAlumno1_. Para unir la ramaAlumno1 con la main.
- _git pull origin main --rebase_ Para hacer un pull con rebase, que integra los cambios remotos en tu rama local sin crear un nuevo merge commit
Los dos hemos podido realizar los pasos de forma idéntica, excepto por el último rebase. Este rebase se ha tenido que hacer ya que al hacer el Alumno2 el push al repositorio GitHub la rama main local del Alumno1 se ha quedado atrás que el remoto.
