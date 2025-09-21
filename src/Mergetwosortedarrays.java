import java.util.Arrays;

public class Mergetwosortedarrays
{
    public static void main(String[] args)
    {
        int[] x = {10,40,70,100};
        int[] y = {5,15,50,80,90,120};
        int i = 0;
        int j = 0;
        int k = 0;

        int[] z = new int[x.length +  y.length];
        while(i<x.length && j<y.length)
        {
            if(x[i]<y[j])
            {
                z[k]=x[i];
                i++;
                k++;
            }
            else{
                z[k]=y[j];
                j++;
                k++;
            }
        }
        System.out.println(Arrays.toString(z));

    }

}
