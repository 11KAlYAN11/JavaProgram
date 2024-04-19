public class KalyanReddy { public static void main(String[] args) {

    for(int i = 1; i<=6; i++)
    {
        for(int k = 1; k<=i-1; k++)
        {
         System.out.print(" ");
         }
        for(int j = 1; j<=i ; j++)
        {
            System.out.print(" * ");
        } 
        System.out.println(); 
    }
    for(int x = 6; x >=1; x--)
    {
        for(int y = 1; y <=x-1; y++)
        {
        System.out.print(" ");
        }
        for(int z = 1; z<=x ; z++)
        {
            System.out.print(" * ");
        } 
        System.out.println(); 
    }
}    
}
