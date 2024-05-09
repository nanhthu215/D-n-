import java.util.ArrayList;

public class Hotel extends CommonAccommodation {
    private int attr7;
    public Hotel(int attr1, String attr2, String attr3, String attr4, ArrayList<Room> attr5, float attr6, int attr7){
        super(attr1, attr2, attr3, attr4, attr5, attr6);
        this.attr7=attr7;
    }
    public Hotel(int attr1, String attr2, String attr3, String attr4, float attr6, int attr7){
        super(attr1, attr2, attr3, attr4, attr6);
        this.attr7=attr7;
    }
    public int getAttr7() {
        return attr7;
    }
    public void setAttr7(int attr7) {
        this.attr7 = attr7;
    }
    @Override
    public String toString() {
        return "Hotel [ " + attr1 + ", " + attr7 + ", " + attr2 + ", " + attr3 + ", "
                + attr4 + "]";
    }
}
