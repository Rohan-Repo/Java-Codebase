package in.easysystems.generics;

public class Animal_Generic<E, V> {
    E animalID;
    V animalSound;

    // Industry Convention E = Element and V = Value

    public Animal_Generic(E animalID, V animalSound) {
        this.animalID = animalID;
        this.animalSound = animalSound;
    }

    public V getAnimalSound() {
        return animalSound;
    }

    public E getAnimalID() {
        return animalID;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal_Generic{");
        sb.append("animalID=").append(animalID);
        sb.append(", animalSound=").append(animalSound);
        sb.append('}');
        return sb.toString();
    }
}
