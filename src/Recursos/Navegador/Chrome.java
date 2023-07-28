package Recursos.Navegador;

public class Chrome implements Navegador{

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
        System.out.println("Página Atualizadaa");
    }
    
}
