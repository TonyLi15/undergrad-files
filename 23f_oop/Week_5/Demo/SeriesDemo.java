package Week_5.Demo;

import Week_5.*;

public class SeriesDemo {
    public static void main(String[] args) {
        Series series[] = new Series[10];

        for(int i=0; i < series.length; i++) {
            if(Math.random() > 0.5) {
                series[i] = new ByTwos();
            }else {
                series[i] = new ByThrees();
            }
        }

        for(int i=0; i < series.length; i++) {
            System.out.print(series[i].getClass().getName()+": ");
            for(int j=0; j < 5; j++) {
                System.out.print(series[i].getNext()+", ");
            }
            System.out.println();
        }
    }
}
