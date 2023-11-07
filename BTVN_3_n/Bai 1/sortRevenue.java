package bai1;

import java.util.Comparator;
public class sortRevenue implements Comparator<vegatable>{
    @Override
    public int compare(vegatable v1, vegatable v2) {
        if(v1.getTotalRevenue() > v2.getTotalRevenue()) {
            return 1;
        }
        else return 0;
    }
}
