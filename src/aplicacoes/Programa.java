package aplicacoes;

import java.util.Scanner;
import servicos.ServicoDeImpressao;

public class Programa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de valores: ");

        ServicoDeImpressao sdi = new ServicoDeImpressao();

        int quantidade = teclado.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print((i+1)+"º valor: ");
            int valor = teclado.nextInt();
            sdi.addValor(valor);
        }

        sdi.impressao();
        System.out.println("Primeiro: " + sdi.primeiro());

        
        teclado.close();

    }

}
