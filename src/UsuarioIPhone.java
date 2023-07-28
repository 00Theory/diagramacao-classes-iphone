import Recursos.Navegador.Chrome;
import Recursos.ReprodutorMusical.Musicas;
import Recursos.Telefone.AppTelefone;


public class UsuarioIPhone {
    public static void main(String[] args) {
        AppTelefone tele = new AppTelefone();

        tele.ligar();
        tele.atender();
        
        Musicas reproMusica = new Musicas();
        reproMusica.selecionarMusica("Azul da Cor do Mar - Tim Maia");
        reproMusica.pausar();
        reproMusica.tocar();

        Chrome chrome = new Chrome();
        chrome.pesquisar();
        chrome.atualizarPagina();
        chrome.adicionarNovaAba();
        chrome.pesquisar();
    }
}
