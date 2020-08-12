package module4.train;

import java.util.Comparator;

public class DestinationStation implements Comparator<Train>{


        @Override
        public int compare(Train o1, Train o2) {
            int result = o1.getDestinationStation().compareToIgnoreCase(o2.getDestinationStation());
             return result;
        }
    }

