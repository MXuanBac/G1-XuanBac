package bai1;

import java.util.Comparator;
public class sortByUnit implements Comparator<vegatable>  {
        @Override
        public int compare(vegatable v1, vegatable v2) {
            if (v1.getUnit().equals(v2.getUnit()))
                return Double.compare(v1.getPrice(), v2.getPrice());
            else
                return v1.getUnit().compareTo(v2.getUnit());
    }
}

