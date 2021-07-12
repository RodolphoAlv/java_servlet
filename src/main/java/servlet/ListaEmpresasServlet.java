package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Banco banco = new Banco();

        PrintWriter out = resp.getWriter();

        out.println("<html><body>");
            banco.getEmpresas()
                    .forEach(empresa -> out.println(
                            String.format("<li>%s</li>", empresa.getNome())
                    ));
        out.println("</html></body>");
    }
}
