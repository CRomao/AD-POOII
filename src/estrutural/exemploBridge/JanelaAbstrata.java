package estrutural.exemploBridge;

/**
 *
 * @author Romao
 */

//Classe abstrata para que sirva como base para todas as janelas que serão criadas
//independente do SO criado, pois ele recebe no construtor a janela do SO criada.
public abstract class JanelaAbstrata {
    
    protected JanelaImplementada janela;
    
    public JanelaAbstrata(JanelaImplementada j){
        this.janela = j;
    }
    
    public void desenharJanela(String titulo){
        janela.desenharJanela(titulo);
    }
    
    public void desenharBotao(String titulo){
        janela.desenharBotao(titulo);
    }
    
    public abstract void desenhar();
}
