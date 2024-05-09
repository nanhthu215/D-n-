// import java.util.ArrayList;

public class LuxuryAccommodation extends Accommodation {
    protected boolean attr5;
    protected boolean attr6;
    protected boolean attr7;
    protected boolean attr8;
    protected int attr9;
    protected int attr10;
    public LuxuryAccommodation(int attr1, String attr2, String attr3, String attr4){
        super(attr1, attr2, attr3, attr4);
    }
    public LuxuryAccommodation(int attr1, String attr2, String attr3, String attr4, boolean attr5, boolean attr6, boolean attr7, boolean attr8, int attr9, int attr10){
        super(attr10, attr2, attr3, attr4);
        this.attr5=attr5;
        this.attr6=attr6;
        this.attr7=attr7;
        this.attr8=attr8;
        this.attr9=attr9;
        this.attr10=attr10;
    }
    public boolean isAttr5() {
        return attr5;
    }
    public void setAttr5(boolean attr5) {
        this.attr5 = attr5;
    }
    public boolean isAttr6() {
        return attr6;
    }
    public void setAttr6(boolean attr6) {
        this.attr6 = attr6;
    }
    public boolean isAttr7() {
        return attr7;
    }
    public void setAttr7(boolean attr7) {
        this.attr7 = attr7;
    }
    public boolean isAttr8() {
        return attr8;
    }
    public void setAttr8(boolean attr8) {
        this.attr8 = attr8;
    }
    public int getAttr9() {
        return attr9;
    }
    public void setAttr9(int attr9) {
        this.attr9 = attr9;
    }
    public int getAttr10() {
        return attr10;
    }
    public void setAttr10(int attr10) {
        this.attr10 = attr10;
    }
    public void abstractAcc(){}
}
