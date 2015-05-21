package Codigos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class tempoReal {
    
    public String exibirData(){
        //pega a data do pc
        Date data = new Date();
        //cria o formatador
        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
        //String para armazenar a data
        String saveData = formatadorData.format(data);
        
        return saveData;
    }
    
    public String exibirHora(){
        //pegar a data para converter em hora
        Date data = new Date();
        //cria o formatador
        SimpleDateFormat formatadorHora = new SimpleDateFormat("hh:mm:ss");
        //String para armazenar a hora
        String saveHora = formatadorHora.format(data);
        
        return saveHora;
    }
}
