package hu.Vadasz;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class FoVadasz implements Vadasz{



    @Override
    public void LottVad(Vad vad){
        System.out.println("Elejtett egy "+vad.getFaj()+"-t!");
    }

}
