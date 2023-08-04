package fr.alboran.demoJenkinsMvc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mathematiques {

    private int nombre;

    public int addition(int x, int y){
        return x + y;
    }

}
