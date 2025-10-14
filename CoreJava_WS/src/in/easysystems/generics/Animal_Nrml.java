package in.easysystems.generics;

import java.util.UUID;

public class Animal_Nrml {

    private UUID animalID;
    private String animalSound;

    public Animal_Nrml(String says) {
        this.animalSound = says;
        this.animalID = UUID.randomUUID();
    }

    public void animalSays(){
        System.out.println( "Animal_Nrml Says : " + animalSound );
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal_Nrml{");
        sb.append("animalID=").append(animalID);
        sb.append(", animalSound='").append(animalSound).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
