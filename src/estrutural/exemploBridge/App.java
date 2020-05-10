package estrutural.exemploBridge;

/**
 *
 * @author Romao
 */
public class App {

    public static void main(String[] args) {
        
        //criando uma janela de diálogo e passando qual a janela de SO
        //que será utilizado.
        
        JanelaAbstrata janela = new JanelaDialogo(new JanelaWindows());
        janela.desenhar();
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        JanelaAbstrata janela2 = new JanelaAviso(new JanelaLinux());
        janela2.desenhar();
        
    }
}
