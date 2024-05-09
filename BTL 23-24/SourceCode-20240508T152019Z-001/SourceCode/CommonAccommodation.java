import java.util.ArrayList;

public class CommonAccommodation extends Accommodation {
   protected ArrayList<Room> attr5;
   protected float attr6;
   public CommonAccommodation(int attr1, String attr2, String attr3, String attr4, ArrayList<Room> attr5, float attr6){
      super(attr1, attr2, attr3, attr4);
      this.attr5=attr5;
      this.attr6=attr6;
   }
   public CommonAccommodation(int attr1, String attr2, String attr3, String attr4, float attr6){
      super(attr1, attr2, attr3, attr4);
      this.attr6=attr6;
   }
   public ArrayList<Room> getAttr5() {
      return attr5;
   }
   public void setAttr5(ArrayList<Room> attr5) {
      this.attr5 = attr5;
   }
   public float getAttr6() {
      return attr6;
   }
   public void setAttr6(float attr6) {
      this.attr6 = attr6;
   }
   public void abstractAcc(){}
} 
