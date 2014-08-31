
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1094785
 */

public class MensagemTask extends TimerTask {
    
    private final Date currentTime = new Date();
    private final SimpleDateFormat sdf = new SimpleDateFormat("'Hora:' HH:mm:ss");
    
    @Override
    public void run() {
            currentTime.setTime(System.currentTimeMillis());
            System.out.println(sdf.format(currentTime));
    }   
}

