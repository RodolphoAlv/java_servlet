package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(urlPatterns = "/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Banco banco = new Banco();

        List<Empresa> empresas = banco.getEmpresas();
        String[] empresasArray = new String[empresas.size()];

        for(int i = 0; i < empresasArray.length ; i++)
            empresasArray[i] = empresas.get(i).getNome();

        req.setAttribute("empresas", empresasArray);
        RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresasHandler.jsp");
        rd.forward(req, resp);
    }
}
