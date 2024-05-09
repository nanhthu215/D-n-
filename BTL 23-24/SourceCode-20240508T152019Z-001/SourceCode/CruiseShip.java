public class CruiseShip extends LuxuryAccommodation {
    private boolean attr11;
    public CruiseShip(int attr1, String attr2, String attr3, String attr4, boolean attr5, boolean attr6, boolean attr7, boolean attr8, int attr9, int attr10, boolean attr11){
        super(attr1, attr2, attr3, attr4, attr5, attr6, attr7, attr8, attr9, attr10);
        this.attr11=attr11;
    }
    public boolean isAttr11() {
        return attr11;
    }
    public void setAttr11(boolean attr11) {
        this.attr11 = attr11;
    }
    @Override
    public String toString() {
        return "CruiseShip [ " + attr1 + ", " + attr2 + ", " + attr3 + ", " + attr4
                + ", " + attr11  + ", " + attr5 + ", " + attr6 + ", " + attr7
                + ", " + attr8 + "]";
    }
    
}
