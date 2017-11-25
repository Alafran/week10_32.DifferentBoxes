
package boxes;

import java.util.ArrayList;
import java.util.List;

public class OneThingBox extends Box{

    private List<Thing> thingInBox;
    
    public OneThingBox() {
        this.thingInBox = new ArrayList<Thing>();
    }
    
    @Override
    public void add(Thing thing) {
        if(this.thingInBox.size() < 1) {
            this.thingInBox.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.thingInBox.contains(thing);
    }
    
}
