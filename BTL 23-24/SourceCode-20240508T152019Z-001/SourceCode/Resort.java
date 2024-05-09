import java.util.ArrayList;

public class Resort extends CommonAccommodation {
    private int attr7;
    private boolean attr8;
    public Resort(int attr1, String attr2, String attr3, String attr4, ArrayList<Room> attr5, float attr6, int attr7, boolean attr8){
        super(attr1, attr2, attr3, attr4, attr5, attr6);
        this.attr7=attr7;
        this.attr8=attr8;
    }
    public Resort(int attr1, String attr2, String attr3, String attr4, float attr6, int attr7, boolean attr8){
        super(attr1, attr2, attr3, attr4, attr6);
        this.attr7=attr7;
        this.attr8=attr8;
    }
    public int getAttr7() {
        return attr7;
    }
    public void setAttr7(int attr7) {
        this.attr7 = attr7;
    }
    public boolean isAttr8() {
        return attr8;
    }
    public void setAttr8(boolean attr8) {
        this.attr8 = attr8;
    }
    @Override
    public String toString() {
        return "Resort [ " + attr1 + ", " + attr2 + ", " + attr7 + ", " + attr3 + ", "
                + attr8 + ", " + attr4 + "]";
    }
}
