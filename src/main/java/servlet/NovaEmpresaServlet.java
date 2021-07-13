package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Empresa Cadastrada com sucesso");

        PrintWriter out = resp.getWriter();

        String nomeEmpresa = req.getParameter("nome");
        String data = req.getParameter("data");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAbertura = null;

        try {
            dataAbertura = sdf.parse(data);
        } catch (Exception e) {
            throw new ServletException(e);
        }

        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);
        empresa.setDataAbertura(dataAbertura);

        Banco banco = new Banco();
        banco.adiciona(empresa);

        req.setAttribute("empresa", empresa.getNome());

        RequestDispatcher rd = req.getRequestDispatcher("/novaEmpresaCriada.jsp");
        rd.forward(req, resp);
    }
}
