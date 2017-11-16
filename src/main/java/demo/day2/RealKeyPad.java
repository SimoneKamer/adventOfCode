package demo.day2;

public class RealKeyPad extends AbstractKeyPad {


    public RealKeyPad() {
        super(0,2);
        addKey(2,0,"1");

        addKey(1,1,"2");
        addKey(2,1,"3");
        addKey(3,1,"4");

        addKey(0,2,"5");
        addKey(1,2,"6");
        addKey(2,2,"7");
        addKey(3,2,"8");
        addKey(4,2,"9");

        addKey(1,3,"A");
        addKey(2,3,"B");
        addKey(3,3,"C");

        addKey(2,4,"D");
    }


}
