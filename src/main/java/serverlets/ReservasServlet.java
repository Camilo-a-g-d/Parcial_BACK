package serverlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
import models.Reserva;

@WebServlet("/ListaReservasServlet")
public class ReservasServlet extends HttpServlet {
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Obtener la lista de reservas desde el contexto de la aplicación
        ServletContext context = getServletContext();
        List<Reserva> reservas = (List<Reserva>) context.getAttribute("reservas");

        // Enviar la lista de reservas al JSP
        request.setAttribute("reservas", reservas);
        request.getRequestDispatcher("listaReservas.jsp").forward(request, response);
    }
}
