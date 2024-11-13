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
