<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="models.Reserva" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Reservas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center">Lista de Reservas</h2>
        
        <table class="table table-striped mt-4">
            <thead class="table-dark">
                <tr>
                    <th>Nombre</th>
                    <th>Fecha</th>
                    <th>Espacio</th>
                    <th>Duración (horas)</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Reserva> reservas = (List<Reserva>) request.getAttribute("reservas");
                    if (reservas != null && !reservas.isEmpty()) {
                        for (Reserva res : reservas) {
                %>
                <tr>
                    <td><%= res.getNombre() %></td>
                    <td><%= res.getFecha() %></td>
                    <td><%= res.getEspacio() %></td>
                    <td><%= res.getDuracion() %></td>
                    <td>
                        <form action="EliminarReservaServlet" method="post" class="d-inline">
                            <input type="hidden" name="id" value="<%= res.getId() %>">
                            <button type="submit" class="btn btn-danger btn-sm">Eliminar</button>
                        </form>
                    </td>
                </tr>
                <%
                        }
                    } else {
                %>
                <tr>
                    <td colspan="5" class="text-center">No hay reservas registradas.</td>
                </tr>
                <% } %>
            </tbody>
        </table>

        <a href="index.html" class="btn btn-primary">Volver a Reservar</a>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
