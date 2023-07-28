package Recursos.Navegador;

import java.util.Scanner;

public class Chrome implements Navegador{

    Scanner sc = new Scanner(System.in);

    
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba() {
       System.out.println("Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página Atualizada");
    }

    @Override
    public void pesquisar() {
        
        String pesquisa = sc.nextLine();
        System.out.println("Pesquisando por " + pesquisa);
    }
    
}
