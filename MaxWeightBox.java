
package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box{

    private int maxWeight;
    private List<Thing> thingsInBox;
    
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.thingsInBox = new ArrayList<Thing>();
    }
    
    @Override
    public void add(Thing thing) {
        int weightInBox = 0;
        
        for(Thing eachThing : this.thingsInBox) {
            weightInBox += eachThing.getWeight();
        }
        
        if(thing.getWeight() + weightInBox <= this.maxWeight) {
            this.thingsInBox.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.thingsInBox.contains(thing);
    }

}
