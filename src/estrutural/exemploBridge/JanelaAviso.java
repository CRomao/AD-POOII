package estrutural.exemploBridge;

/**
 *
 * @author Romao
 */

//classe que estende a JanelaAbstrata para que possa implementar o método desenhar
//e que possa mandar os parâmetros necessários para o tipo da janela.
public class JanelaAviso extends JanelaAbstrata{

    public JanelaAviso(JanelaImplementada j) {
        super(j);
    }

    @Override
    public void desenhar() {
        desenharJanela("Janela de Aviso");
        desenharBotao("Ok");
    }
    
}
