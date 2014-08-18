
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica92 {
    private static final long HORA_CHEIA = 60000; // 60s
    private static final long INTERVALO_CHEIO = 60000; // 60s
    private static final SimpleDateFormat sdf = new SimpleDateFormat("'Hora atual:' HH:mm:ss");
    
    public static void main(String[] args) throws IOException {
        System.out.println("Execução iniciada");
        System.out.println(sdf.format(new Date()));
        long atraso = HORA_CHEIA - new Date().getTime() % HORA_CHEIA;
        
        Timer timer = new Timer("hora-cheia-timer");
        timer.scheduleAtFixedRate(new MensagemTask(), atraso, INTERVALO_CHEIO);
        
        System.out.println("Pressione Enter para terminar...");
        System.in.read();
        timer.cancel();
        
        System.out.println("Execução finalizada");
        System.out.println(sdf.format(new Date()));
    }

}