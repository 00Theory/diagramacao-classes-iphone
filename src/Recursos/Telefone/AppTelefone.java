package Recursos.Telefone;

import java.util.Scanner;

public class AppTelefone implements Telefone{
    Scanner sc = new Scanner(System.in);

    @Override
    public void ligar() {
        System.out.println("Qual o número?");
        String numero = sc.nextLine();
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {

        System.out.println("Digite S para atender ou N para desligar e aperte Enter");
        String atender = sc.nextLine();
        String atendido = "S";
        String desligado = "N";

        if (atender.equals(atendido)){
            System.out.println("Atendido");
        }
        else if (atender.equals(desligado)){
            System.out.println("Desligado");
        }
        else{
            atender();
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz... Deixe sua mensagem");
    }
}
