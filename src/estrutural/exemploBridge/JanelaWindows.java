package estrutural.exemploBridge;

/**
 *
 * @author Romao
 */

//Tipo de janel de SO que pode ser criada, devendo implementar a interface JanelaImplementada
//para que possa implementar os seus métodos do seu jeito.
public class JanelaWindows implements JanelaImplementada{

    @Override
    public void desenharJanela(String titulo) {
        System.out.println(titulo + " - Janela Windows");
    }

    @Override
    public void desenharBotao(String titulo) {
        System.out.println(titulo + " - Botão Windows");
    }

    
}
