package com.cahuner.primerserverlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.claseUsuario;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet para gestionar usuarios.
 */
public class svUsuario extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    // Simulación de "base de datos" en memoria
    private List<claseUsuario> listaUsuarios;

    /**
     * Constructor por defecto.
     * (No es estrictamente necesario, pero puede aparecer en algunos IDEs)
     */
    public svUsuario() {
        super();
    }

    /**
     * Se llama cuando se inicia el servlet.
     * Aquí inicializamos la lista de usuarios en memoria.
     */
    @Override
    public void init() throws ServletException {
        super.init();
        listaUsuarios = new ArrayList<>();
        
        // Agregamos algunos usuarios de ejemplo (opcional)
        listaUsuarios.add(new claseUsuario("1", "Juan", "Pérez", "123456789"));
        listaUsuarios.add(new claseUsuario("2", "María", "Gómez", "987654321"));
    }

    /**
     * Método que procesa tanto GET como POST.
     * Lo invocamos desde doGet() y doPost() para centralizar la lógica.
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Definimos el tipo de contenido de la respuesta
        response.setContentType("text/html;charset=UTF-8");

        // Usamos un PrintWriter para enviar texto HTML al cliente
        try (PrintWriter out = response.getWriter()) {
            // Cabecera básica de HTML
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet svUsuarios</title>");
            out.println("</head>");
            out.println("<body>");

            // Verificamos el método HTTP para decidir la lógica
            String metodo = request.getMethod();  // "GET" o "POST"
            if ("GET".equalsIgnoreCase(metodo)) {
                // Lógica para mostrar la lista de usuarios
                out.println("<h1>Lista de Usuarios</h1>");
                out.println("<ul>");
                for (claseUsuario u : listaUsuarios) {
                    out.println("<li>" + u.toString() + "</li>");
                }
                out.println("</ul>");

                // (Opcional) Link a un formulario para agregar usuario
                out.println("<a href='formUsuario.html'>Agregar nuevo usuario</a>");

            } else if ("POST".equalsIgnoreCase(metodo)) {
                // Lógica para agregar un nuevo usuario

                // Obtenemos parámetros del formulario
                String id = request.getParameter("id");
                String nombre = request.getParameter("nombre");
                String apellidos = request.getParameter("apellidos");
                String telefono = request.getParameter("telefono");

                // Creamos un nuevo objeto ClaseUsuario
                claseUsuario nuevoUsuario = new claseUsuario(id, nombre, apellidos, telefono);

                // Agregamos a la lista
                listaUsuarios.add(nuevoUsuario);

                // Mostramos mensaje de confirmación
                out.println("<h1>Usuario Agregado</h1>");
                out.println("<p>" + nuevoUsuario.toString() + "</p>");
                out.println("<a href='svUsuarios'>Volver a la lista</a>");
            }

            // Cierre de body y html
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Manejo de solicitudes GET.
     * Simplemente delega la lógica a processRequest.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Manejo de solicitudes POST.
     * Simplemente delega la lógica a processRequest.
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Información sobre el servlet (opcional).
     */
    @Override
    public String getServletInfo() {
        return "Servlet svUsuarios - Maneja usuarios (GET para listar, POST para agregar).";
    }
}
