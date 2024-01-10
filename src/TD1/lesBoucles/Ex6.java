package TD1.lesBoucles;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int i,j,k;
        for(i=1;i<=9;i++)
        {
            for(j=1;j<=9;j++)
            {
                for(k=1;k<=9;k++)
                {
                    if(i+j+k==15){System.out.println(i+"+"+j+"+"+k+"=15");

                    }
                }
            }
        }

    }

}
