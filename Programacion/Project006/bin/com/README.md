#Necesito hacer un mvc para un restaurante#

La aplicaion tendra como objetivo la gestion de menus , clientes, mesas.

Estructura tendra un vista principal que llevara a otras vistas donde implementaremos la funcionalidad de cada objetivo.


### 1. Vistas
La aplicación cuenta con 4 vistas principales:
- **Vista Principal**: Pantalla inicial que da acceso a las diferentes funcionalidades del sistema.
- **Vista de Menú**: Permite gestionar los menús disponibles en el restaurante.
- **Vista de Mesas**: Permite gestionar las mesas, asociándolas con menús disponibles y el número de personas.
- **Vista de Clientes**: Permite gestionar la información de los clientes, incluyendo su reserva y asignación de mesa.



### 2. Modelos
El sistema cuenta con 3 modelos, que representan las entidades del restaurante:
- **Menu**: Representa los menús disponibles en el restaurante (nombre y precio).
- **Mesa**: Representa las mesas disponibles, su capacidad y el menú asociado.
- **Cliente**: Representa la información del cliente, como nombre, teléfono y la mesa asignada.

### 3. Controladores
Se implementan 3 controladores para gestionar la lógica de la aplicación:
- **MenuController**: Controlador que gestiona las operaciones relacionadas con los menús (crear, leer, actualizar, eliminar).
- **MesaController**: Controlador encargado de gestionar las mesas del restaurante (crear, leer, actualizar, eliminar).
- **ClienteController**: Controlador encargado de gestionar la información de los clientes (crear, leer, actualizar, eliminar).

### 4. Conexión a la Base de Datos
El proyecto está diseñado para trabajar con **MySQL** y cuenta con tres conexiones a la base de datos:
- **Conexión a la base de datos de menús**: Gestión de la información de los menús disponibles.
- **Conexión a la base de datos de mesas**: Gestión de las mesas disponibles en el restaurante.
- **Conexión a la base de datos de clientes**: Gestión de la información de los clientes.

### 5. Arquitectura MVC
La arquitectura del proyecto sigue el patrón **Modelo-Vista-Controlador (MVC)**, donde:

- **Modelo (Model)**: Contiene las clases que representan los datos y su lógica de negocio (Menu, Mesa, Cliente).
- **Vista (View)**: Presenta la interfaz de usuario y permite interactuar con los datos (pantallas de Menú, Mesa, Cliente).
- **Controlador (Controller)**: Maneja la lógica de la aplicación, se comunica con los modelos y actualiza las vistas.