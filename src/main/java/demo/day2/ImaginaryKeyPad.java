package demo.day2;

public class ImaginaryKeyPad extends AbstractKeyPad {


    public ImaginaryKeyPad() {
        super(1,1);
        keyPad.put(0,0,new Key("1"));
        keyPad.put(1,0,new Key("2"));
        keyPad.put(2,0,new Key("3"));

        keyPad.put(0,1,new Key("4"));
        keyPad.put(1,1,new Key("5"));
        keyPad.put(2,1,new Key("6"));

        keyPad.put(0,2,new Key("7"));
        keyPad.put(1,2,new Key("8"));
        keyPad.put(2,2,new Key("9"));
    }

}
