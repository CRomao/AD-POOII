package comportamental.state;

/**
 *
 * @author Romao
 */

//Classe Ventilador para poder fazer mostrar a situação e fazer a troca da situação.
public class Ventilador {

    private Situacao ventilador;
    
    public Ventilador(Situacao v){
        this.ventilador = v;
    }
    
    public String situacao(){
        return this.ventilador.situacao();
    }

    public void setVentilador(Situacao ventilador) {
        this.ventilador = ventilador;
    }
    
    
}
