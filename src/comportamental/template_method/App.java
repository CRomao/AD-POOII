package comportamental.template_method;

/**
 *
 * @author Romao
 */
public class App {

    public static void main(String[] args) {
        
        MontagemPC pcDesktop = new MontagemPCDesktop();
        MontagemPC pcGamer = new MontagemPCGamer();
        
        System.out.println("-=-= DESKTOP -=-=");
        pcDesktop.MontarPC();
        
        System.out.println();
        System.out.println("-=-= GAMER -=-=");
        pcGamer.MontarPC();
        
        
    }
}
