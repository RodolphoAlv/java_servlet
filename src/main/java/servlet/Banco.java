package servlet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {

    private static List<Empresa> empresasLista = new ArrayList<>();
    private static Integer chaveSequencial = 1;

    static {
        Empresa e1 = new Empresa();
        Empresa e2 = new Empresa();
        e1.setId(chaveSequencial++);
        e2.setId(chaveSequencial++);
        e1.setNome("Alura");
        e2.setNome("Google");

        empresasLista.addAll(Arrays.asList(e1, e2));
    }

    public void adiciona(Empresa empresa) {
        empresa.setId(Banco.chaveSequencial++);
        Banco.empresasLista.add(empresa);
    }

    public List<Empresa> getEmpresas() {
        return Banco.empresasLista;
    }

    public void removeEmpresa(Integer id) {
        Banco.empresasLista = Banco.empresasLista
                .stream()
                .filter(empresa -> empresa.getId() != id)
                .collect(Collectors.toList());
    }
}
