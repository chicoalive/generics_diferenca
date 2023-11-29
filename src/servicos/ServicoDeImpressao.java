package servicos;

import java.util.ArrayList;
import java.util.List;

// Generics
public class ServicoDeImpressao <Tipo> {

    private List<Tipo> lista = new ArrayList<>();

    // Métodos
    public void addValor(Tipo valor) {
        lista.add(valor);
    }

    public Tipo primeiro() {
        if (lista.isEmpty()) {
            throw new IllegalStateException("A lista está vazia!");
        }
        return lista.get(0);
    }

    public void impressao() {
        System.out.print("[");
        if (!lista.isEmpty()) {
            System.out.print(lista.get(0));
        }
        for (int i = 1; i < lista.size(); i++) {
            System.out.print(", "+lista.get(i));
        }
        System.out.println("]");
    }

}
