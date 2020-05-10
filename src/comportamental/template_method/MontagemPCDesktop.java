package comportamental.template_method;

/**
 *
 * @author Romao
 */

//Classe de montagem de PC Desktop com um método extra.
public class MontagemPCDesktop extends MontagemPC{

    @Override
    public void adicionarPecasExtras() {
        this.adicionarMaisMemoria();
    }
    
    public MontagemPCDesktop adicionarMaisMemoria(){
        System.out.println("== Mais memória adicionada.");
        return this;
    }
    
}
