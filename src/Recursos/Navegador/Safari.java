package Recursos.Navegador;

import java.util.Scanner;

public class Safari implements Navegador{

    Scanner sc = new Scanner(System.in);

    @Override
    public void exibirPagina() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirPagina'");
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarNovaAba'");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarPagina'");
    }

    @Override
    public void pesquisar() {
        System.out.println("Safari: Faça uma pesquisa");
        String pesquisa = sc.nextLine();
        System.out.println("Pesquisando por " + pesquisa);
    }
    
}
