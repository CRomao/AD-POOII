package estrutural.exemploBridge;

/**
 *
 * @author Romao
 */

//Interface que servirá como base para que a janela do SO criada, implemente os métodos
//dela necessários, como a da janela e o do botão do SO.
public interface JanelaImplementada {

    void desenharJanela(String titulo);
    
    void desenharBotao(String titulo);
    
}
