package comportamental.template_method;

/**
 *
 * @author Romao
 */

//Classe de montagem de PC Gamer com três método extra.
public class MontagemPCGamer extends MontagemPC {

    @Override
    public void adicionarPecasExtras() {
        this
                .adicionarCoolerFan()
                .adicionarPlacaDeVideo()
                .upgradeProcessamento();

    }

    public MontagemPCGamer adicionarPlacaDeVideo() {
        System.out.println("== Placa de vídeo adicionada.");
        return this;
    }

    public MontagemPCGamer adicionarCoolerFan() {
        System.out.println("== Fan Cooler adicionada.");
        return this;
    }
    
    public MontagemPCGamer upgradeProcessamento(){
        System.out.println("== Upgrade no processamento adicionado.");
        return this;
    }

}
