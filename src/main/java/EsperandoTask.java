
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

    @Override
    public void run() {
        if(((System.currentTimeMillis()/60000)%2) == 1)
            System.out.println("Esperando...");
    }
    
}
