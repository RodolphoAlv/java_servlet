package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer id = Integer.valueOf(req.getParameter("id"));
        Banco banco = new Banco();

        Empresa empresa = banco.buscarEmpresaPeloId(id);

        req.setAttribute("empresa", empresa);
        RequestDispatcher rd = req.getRequestDispatcher("/formAlteraEmpresa.jsp");
        rd.forward(req, resp);
    }
}
