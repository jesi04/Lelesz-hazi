package hu.Vadasz;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Component;

@Component
public class Fegyver {
    private @Getter @Setter Vadasz owner;

    @Autowired
    public void setOwner(Vadasz owner) {
        this.owner = owner;
        System.out.println(this.owner);
    }
}
