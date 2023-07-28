package Recursos.ReprodutorMusical;

public class Musicas implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Pause");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println(musica + " selecionada");
    }
    
}
