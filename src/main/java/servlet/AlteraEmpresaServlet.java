package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nomeEmpresa = req.getParameter("nome");
        String dataTexto = req.getParameter("data");
        String paramId = req.getParameter("id");

        Integer id = Integer.valueOf(paramId);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date dataAbertura = null;
        try {
            dataAbertura = sdf.parse(dataTexto);
        } catch (Exception e) {
            throw new ServletException(e);
        }

        Banco banco = new Banco();

        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);
        empresa.setDataAbertura(dataAbertura);
        empresa.setId(id);
        banco.alteraEmpresa(empresa);

        resp.sendRedirect("listaEmpresas");
    }
}
