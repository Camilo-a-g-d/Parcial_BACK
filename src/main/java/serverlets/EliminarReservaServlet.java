package servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
import models.Reserva;

@WebServlet("/EliminarReservaServlet")
public class EliminarReservaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @SuppressWarnings("unchecked")
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Obtener el ID de la reserva a eliminar
        String idStr = request.getParameter("id");

        if (idStr != null) {
            try {
                int id = Integer.parseInt(idStr);

                // Obtener la lista de reservas desde el contexto de la aplicación
                ServletContext context = getServletContext();
                List<Reserva> reservas = (List<Reserva>) context.getAttribute("reservas");

                if (reservas != null) {
                    // Buscar y eliminar la reserva con el ID proporcionado
                    reservas.removeIf(reserva -> reserva.getId() == id);
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: ID inválido");
            }
        }

        // Redirigir a la lista de reservas después de eliminar
        response.sendRedirect("ListaReservasServlet");
    }
}
