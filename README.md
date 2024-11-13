# Información
- URL: https://github.com/martaajonees/Practica_IA.git

# Roles asignados
- Alumno 1: Marta Jones González
- Alumno 2: Pablo del Valle Davoodzadeh
- Alumno 3: Ezequiel Lemos Cárdenas
- Alumno 4: Violeta Ai Naharro Zaldivar

# 15. Crear ramas remotas
- **git branch experiment**: Lo hemos usado para crear la rama cuyo nombre es _experiment_
- **git push --set-upstream origin experiment**: Para crear ramas remotas y que aparezcan a nivel remoto

# 16. Modificar ramas
- **git checkout ramaAlumno1**: Para situarnos en la rama correspondiente
- **git pull**: Para extraer cambios
- **git push**: Para mandar los cambios
- **git add**: Para añadir cambios
- **git commit**: Para hacer commit de los cambios al repositorio 

# 17. ¿Qué ha cambiado?
- **git whatchanged --pretty=format:"%H%n%an%n%ae%n%s"**: Para ver los cambios realizados en los últimos commits y obtener la información
- **%H**: SHA-1 del commit
- **%an**: Nombre del autor
- **%ae**: Email de quien hizo el commit
- **%s**: Mensaje del commit

# 18. Merge sin conflictos
- **git add .**: Para añadir al área de preparación
- **git commit**. Para commit al repositorio local
- **git merge rama**. Para unir dos ramas.
- **git push**. Para añadir al repositorio remoto los cambios

# 19. Modificar los alumnos en sus ramas
Cada compañero dentro de la rama **main** modificamos el archivo lineaDeCompra.java, con un nuevo archivo cada uno, posteriormente veremos el merge y la unión de todos los cambios.

# 20 Merge con conflictos
## ¿Qué está pasando?
A la hora de hacer el push, el primer compañero que lo hace no tiene problemas, pero el segundo compañero que intenta hacerlo, se encuentra con un conflicto. Esto se debe a que el primer compañero ha hecho un push antes que el segundo, por lo que el segundo tiene que hacer un pull para poder hacer el push. Pero nos encontramos con conflictos en el archivo, ya que el primer compañero ha modificado el archivo antes que el segundo y es el mismo archivo.

## ¿Por qué ha sucedido esto? ¿Por qué el Alumno más rápido no ha tenido problemas?
Cada uno hemos modificado el archivo "lineaDeCompra.java" en el main. El primero que introdujo los cambios, fue Pablo (Alumno2), seguido de Marta (Alumno1), Violeta (Alumno4) aquí nos dimos cuenta que teníamos una nueva funcion que era *getnumcod_lc()* y por último Ezequiel (Alumno3) aqui nos quedamos con los cambios del alumno anterior.
El primer alumno no ha tenido problemas ya que ha sido el primero en hacer el push, por lo que no ha habido conflictos. El segundo alumno, al hacer el push, se encuentra con un conflicto ya que el primer alumno ha hecho un push antes que él y ha modificado el mismo archivo.

