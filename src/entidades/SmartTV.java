/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Estudiante
 */
public class SmartTV 
        extends Dispositivo
        implements Navegador, Reproductor {

    /**
     * @return the tipoEntrada
     */
    public int getTipoEntrada() {
        return tipoEntrada;
    }

    /**
     * @param tipoEntrada the tipoEntrada to set
     */
    public void setTipoEntrada(int tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }
    
    
    private int tipoEntrada;
    private final int HDMI = 0;
    private final int VGA= 1;
    private final int DVI  = 2;   
    private final int DisplayPort= 3;     
    private final int RCA= 4;
    private final int Signal= 5;
    private final int SVideo= 6;
    private final int Coaxial= 7
            ;

    @Override
    public void navegar() {
        
    }

    @Override
    public void abrirlink() {
        
    }

    @Override
    public void reproducir() {
        
    }

    @Override
    public void adelantar() {
        
    }

    @Override
    public void retroceder() {
        
    }
            
}
