package Recursos.Telefone;

import java.util.Scanner;

public class AppTelefone implements Telefone{


    Scanner sc = new Scanner(System.in);
    @Override
    public void ligar(String nome, String numero) {
        System.out.println("Ligando para " + nome + ", número: " + numero);
    }

    @Override
    public void atender() {

        
        String atender = sc.next();

        if (atender == "S"){
            System.out.println("Atendido");
            sc.close();
        }
        else{
            System.out.println("Desligado");
            sc.close();
        }
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz... Deixe sua mensagem");
    }
}
