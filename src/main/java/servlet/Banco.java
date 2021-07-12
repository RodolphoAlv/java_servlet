package servlet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Banco {

    private static List<Empresa> empresasLista = new ArrayList<>();

    static {
        Empresa e1 = new Empresa();
        Empresa e2 = new Empresa();
        e1.setNome("Alura");
        e2.setNome("Google");

        empresasLista.addAll(Arrays.asList(e1, e2));
    }

    public void adiciona(Empresa empresa) {
        Banco.empresasLista.add(empresa);
    }

    public List<Empresa> getEmpresas() {
        return Banco.empresasLista;
    }
}
