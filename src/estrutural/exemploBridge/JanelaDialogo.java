package estrutural.exemploBridge;

/**
 *
 * @author Romao
 */

//classe que estende a JanelaAbstrata para que possa implementar o método desenhar
//e que possa mandar os parâmetros necessários para o tipo da janela.
public class JanelaDialogo extends JanelaAbstrata{

    public JanelaDialogo(JanelaImplementada j) {
        super(j);
    }
       
    @Override
    public void desenhar() {
        desenharJanela("Janela de Diálogo");
        desenharBotao("Botão Sim");
        desenharBotao("Botão Não");
        desenharBotao("Botão Cancelar");
    }
    
}
