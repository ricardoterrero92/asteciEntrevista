# asteciEntrevista

El servicio muestra dos entidades (incidencias y operadores) donde cada una de ellas puede listarse por completo o usando el id como Path Variable. A su vez pueden crearse incidencias, actualizarse y eliminarse. 

La entidad operador cuenta con los atributos: idOperardor que hace referencia al id en la tabla (operadores) de la base de datos, nombreOperador y el email que referencian el nombre y el email del operador respectivamente. Se diseñó de forma tal que la lista de operadores fuera un conjunto cerrado.

La entidad incidencias cuenta con los atributos: id que hace referencia al id en la tabla (incidencias) de la base de datos, nameOperador, status y creationDate que referencian al nombre del operador que reporta la incidencia, el status en que se encuentra la misma y la fecha cuando fue resgistrada respectivamente.

La relación entre ambas entidades es que un operador puede registrar varias incidencias y a su vez el nombre del operador queda registrado en la incidencia.

Los datos se persistieron en dos tablas (operadores e incidencias) pertenecientes a la base de datos: inventario_new.
