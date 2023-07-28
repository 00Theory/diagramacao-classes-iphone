import Recursos.ReprodutorMusical.Musicas;
import Recursos.ReprodutorMusical.ReprodutorMusical;
import Recursos.Telefone.AppTelefone;


public class Usuario {
    public static void main(String[] args) {
        AppTelefone tele = new AppTelefone();

        tele.ligar();
        tele.atender();
        
        Musicas reproMusica = new Musicas();
        reproMusica.selecionarMusica("");

    }
}
