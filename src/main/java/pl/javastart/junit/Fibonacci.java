package pl.javastart.junit;

public class Fibonacci {

    public static int fibonacci(int upTo){
        int sum=0, fiboNr=2, fiboNrPr=1, fiboNew=2;
        int sumTmp=0;
        if (upTo<=0) {
            return sum;
        } else {
            while (sumTmp <= upTo) {
                if (fiboNew%2==0){
                    sumTmp+=fiboNew;
                }
                fiboNew=fiboNr+fiboNrPr;
                fiboNrPr=fiboNr;
                fiboNr=fiboNew;
                if (sumTmp<=upTo){
                    sum=sumTmp;
                }
            }
        }
        return sum;
    }
}
