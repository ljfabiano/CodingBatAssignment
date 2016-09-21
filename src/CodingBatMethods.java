/**
 * Created by jfabiano on 9/21/2016.
 */
public class CodingBatMethods {
    public void main(String args[])
    {
        int a = 1;
        int b = 2;
        int c = 3;
        boolean isCloseFar = closeFar(a, b, c);
        System.out.println("closeFar when a = " + a + ", b = " + b + ", and c = " + c + " is " + isCloseFar);

        int luckySum = luckySum(a, b, c);
        System.out.println("luckySum when a = " + a + ", b = " + b + ", and c = " + c + " is " + luckySum);

    }
    public boolean closeFar(int a, int b, int c) {
        boolean isCloseFar;
        if (Math.abs(b-a)<=1&&(Math.abs(c-a)>=2&&Math.abs(c-b)>=2))
        {
            isCloseFar = true;
        }
        else if (Math.abs(c-a)<=1&&(Math.abs(b-a)>=2&&Math.abs(c-b)>=2))
        {
            isCloseFar = true;
        }
        else
        {
            isCloseFar = false;
        }
        return isCloseFar;//isCloseFar
    }
    public int luckySum(int a, int b, int c) {

        int sum;

        if(a == 13)
        {
            sum = 0;
            return sum;
        }
        else if(b == 13)
        {
            sum = a;
            return sum;
        }
        else if(c == 13)
        {
            sum = a + b;
            return sum;
        }
        else
        {
            sum = a + b + c;
            return sum;
        }
    }

}
