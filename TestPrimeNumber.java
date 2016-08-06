
public class TestPrimeNumber {

    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        int num=0;
        String primeNumbers="";
        for (i=1;i<=100;i++){
            int cnt=0;
            for(num=i;num >=1;num--)
            {
               if (i%num == 0)
               {
                   cnt = cnt +1;
               } 
            }
            if (cnt ==2)
            {                
                primeNumbers=primeNumbers+i;
            }
        }
        System.out.println("prime are:");
        System.out.println(primeNumbers);
            
    }
    
}
