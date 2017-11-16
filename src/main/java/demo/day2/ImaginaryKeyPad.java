package demo.day2;

public class ImaginaryKeyPad extends AbstractKeyPad {


    public ImaginaryKeyPad() {
        super(1,1);
        addKey(0,0,"1");
        addKey(1,0,"2");
        addKey(2,0,"3");

        addKey(0,1,"4");
        addKey(1,1,"5");
        addKey(2,1,"6");

        addKey(0,2,"7");
        addKey(1,2,"8");
        addKey(2,2,"9");
    }

}
