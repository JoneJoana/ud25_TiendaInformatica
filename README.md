U25 Spring REST ER

Articulos API

GET: 
localhost:8080/api/articulos - lista todos los articulos
localhost:8080/api/articulos/{id} - lista el articulo con ese ID
localhost:8080/api/articulos/nombre/{nombre} - lista el articulo con ese nombre
localhost:8080/api/articulos/fabricante/{fabricante} - lista los articulos que tienen dicho fabricante

POST:
localhost:8080/api/articulos - guardar un articulo (pasarle body)

DELETE:
localhost:8080/api/articulos/{id}  - eliminar dicho articulo

PUT: 
localhost:8080/api/articulos/{id}  - actualizar valores del articulo




Fabricantes API


GET: 
localhost:8080/api/fabricantes - lista todos los fabricantes
localhost:8080/api/fabricantes/{id} - muestra el fabricante con ese ID
localhost:8080/api/fabricantes/nombre/{nombre} - lista el fabricante con ese nombre

POST:
localhost:8080/api/fabricantes - guardar un fabricante (pasarle body)

DELETE:
localhost:8080/api/fabricantes/{id}  - eliminar dicho fabricante

PUT: 
localhost:8080/api/fabricantes/{id}  - actualizar valores del fabricante