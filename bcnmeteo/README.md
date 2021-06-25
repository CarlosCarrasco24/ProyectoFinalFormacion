# BCNMeteo

BCNMeteo es un proyecto creado para controlar tanto las estaciones metereologicas como las localizaciones en las que miden los datos y sus intervalos de refresco.

## Estructura

El proyecto está basado en 2 capas:

1) **Capa Integration**: Es la capa en la que residen los datos, esta dividida de la siguiente forma:
>> 1.1)**Model**: Encargado de relacionar los atributos del objeto con las caracteristicas de un dato.

>> 1.2)**Repository**: Implementa la interfaz *JPARepository* que nos permite hacer operaciones con los datos.
2) **Capa Business**:  Se reciben las peticiones del usuario y se envían las respuestas tras el proceso con los datos extraidos desde la capa de Intregation.

>> 2.1)**Model**: Puede variar respecto al de Integration puesto que podemos obviar algunos datos o modificarlos para una mejor presentación.

>> 2.2)**Services**: Interfaz dónde residen todos los métodos con los que vamos a realizar operaciones con los datos de la capa de Integration.

>> 2.2)**ServicesImpl**: Clase donde reside toda la lógica de la capa de business.

## Otros paquetes

- **AOP**: Encargado de ejecutar logs cada vez que se ejecute cualquier método de la capa de business, en concreto de la implementación de services.

- **Config**: En este paquete se encuentra **Dozer** que sirve para convertir los objetos desde Integration a Business y **Swagger**, herramientas de software de código abierto para diseñar, construir, documentar, y utilizar servicios web RESTful.

- **Controller**: Paquete que asociara una url con un archivo jsp que se encargará de mostrar en pantalla los datos.
## Final
Prototipo final realizado por Carlos Carrasco Ureña como finalización de su formación al entrar a ViewNext.