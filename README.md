**********************  Proyecto: Sistema de Reservas para Coworking *********************************


Este proyecto es una aplicación web desarrollada en Java EE con Servlets para gestionar reservas de espacios de trabajo.

*********************  Estructura del Proyecto ***************************

ProyectoReservaCoworking/
│── src/
│   ├── models/
│   │   ├── Reserva.java
│   ├── servlets/
│   │   ├── ReservaServlet.java
│   │   ├── ListaReservasServlet.java
│   │   ├── EliminarReservaServlet.java
│── WebContent/
│   ├── index.html
│   ├── listaReservas.jsp
│   ├── css/
│   │   ├── bootstrap.min.css
│── WEB-INF/
│   ├── web.xml
│── db/
│   ├── reservas.sql (Opcional)
│── README.md


********************** Requisitos Previos **************************
Antes de ejecutar el proyecto, asegúrate de tener:

Java JDK 19 instalado y configurado localmente.
NetBeans 19 configurado.
Apache Tomcat 9+ instalado y agregado a NetBeans.
XAMPP.

********************* Configuración y Ejecución en NetBeans **********************

1. Importar el Proyecto

Abre NetBeans 19.
Ve a File → Open Project y selecciona ProyectoReservaCoworking.

2. Configurar Apache Tomcat

Ve a Tools → Servers → Add Server.
Selecciona Apache Tomcat y agrega su ruta de instalación.
En la pestaña Libraries, verifica que Java EE Web API esté incluida.

********************** Descripción del Proyecto *************************************

El Sistema de Gestión de Reservas para Coworking es una aplicación web desarrollada en Javax con Servlets, diseñada para permitir a los usuarios reservar espacios de trabajo en un coworking.

A través de una interfaz amigable con Bootstrap, los usuarios pueden:
Reservar un espacio de trabajo (escritorio, sala de reuniones u oficina privada).
Consultar la lista de reservas activas.
Eliminar reservas cuando ya no sean necesarias.


*************************** Objetivo del Proyecto **********************************
El propósito principal de este proyecto es desarrollar una aplicación web backend funcional utilizando Java Servlets y JSP, con el siguiente enfoque:

✔ Aplicar conocimientos de desarrollo backend con Java EE.
✔ Implementar un CRUD básico utilizando Servlets y JSP.
✔ Manejar peticiones HTTP (GET, POST) correctamente.
✔ Validar datos y manejar errores de usuario.
✔ Desplegar una aplicación en Apache Tomcat dentro de NetBeans 19.
✔ Integrar una base de datos MySQL

El proyecto permite a los estudiantes practicar desarrollo web backend con tecnologías estándar.