
import java.util.TimerTask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guiduda
 */
public class EsperandoTask extends TimerTask{
    protected boolean ativo = false;

    @Override
    public void run() {
        if(ativo)
            System.out.println("Esperando...");
    }
    
    public void setEstado(boolean flag){
        ativo = flag;
    }
    
}
