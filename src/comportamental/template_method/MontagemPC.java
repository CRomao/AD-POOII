package comportamental.template_method;

/**
 *
 * @author Romao
 */

//Classe abstrata para que as classes que estenderem ela possam ter esses métodos,
// e possam implementar o que tiver a mais, além do necessário que a abstrata já dispõe.
//Exemplo utilizando montangem de PC's.
public abstract class MontagemPC {
    
    public void MontarPC() {
        this
            .encaixarPlacaMae()
            .encaixarComponentesPlacaMae()
            .parafusarComponentes()
            .conectarCabosComponentes()
            .adicionarPecasExtras();
    }
    
    private MontagemPC encaixarPlacaMae() {
        System.out.println("== Placa mãe encaixada.");
        return this;
    }
    
    private MontagemPC encaixarComponentesPlacaMae() {
        System.out.println("== Componentes encaixados na placa mãe encaixada.");
        return this;
    }
    
    private MontagemPC parafusarComponentes() {
        System.out.println("== Componentes parafusados.");
        return this;
    }
    
    private MontagemPC conectarCabosComponentes() {
        System.out.println("== Cabos dos componentes conectados.");
        return this;
    }
    
    public abstract void adicionarPecasExtras();
    
}
