package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Empresa Cadastrada com sucesso");

        PrintWriter out = resp.getWriter();

        String nomeEmpresa = req.getParameter("nome");

        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);

        Banco banco = new Banco();
        banco.adiciona(empresa);

        req.setAttribute("empresa", empresa.getNome());

        RequestDispatcher rd = req.getRequestDispatcher("/novaEmpresaCriada.jsp");
        rd.forward(req, resp);
    }
}
