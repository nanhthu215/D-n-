// import java.util.ArrayList;

public class Villa extends LuxuryAccommodation {
    public Villa(int attr1, String attr2, String attr3, String attr4, boolean attr5, boolean attr6, boolean attr7, boolean attr8, int attr9, int attr10){
        super(attr1, attr2, attr3, attr4, attr5, attr6, attr7, attr8, attr9, attr10);
    }

    @Override
    public String toString() {
        return "Villa [ " + attr1 + "," + attr2 + ", " + attr3 + ", " + attr4 + ", " + attr5 + ", " + attr6 + ", " + attr7 + ", " + attr8 + ", " + attr9 + ", " + attr10 + "]";
    }

}
