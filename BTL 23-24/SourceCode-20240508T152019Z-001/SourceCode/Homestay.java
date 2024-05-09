import java.util.ArrayList;

public class Homestay extends CommonAccommodation {
    public Homestay(int attr1, String attr2, String attr3, String attr4, ArrayList<Room> attr5, float attr6){
        super(attr1, attr2, attr3, attr4, attr5, attr6);
    }
    public Homestay(int attr1, String attr2, String attr3, String attr4, float attr6){
        super(attr1, attr2, attr3, attr4, attr6);
    }
    @Override
    public String toString() {
        return "Homestay [ " + attr1 + ", " + attr2 + ", " + attr3 + ", " + getAttr6() + ", " + attr4 + "]";
    }
    
}
