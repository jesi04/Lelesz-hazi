package hu.Vadasz;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vad {
    private @Getter @Setter String faj;
    private @Getter @Setter boolean vadaszE;


}
