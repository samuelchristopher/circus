package circus.animal;

public abstract class Animal implements circus.Asset {
    @Override
    public int getValue() {
        return 10;
    }

    public String speak(){
        return null;
    }
}
