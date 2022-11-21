public class Fibonacci {

    public int[] generateSequence(int n) {
        
        if(n < 0) {
            return new int[0];
        } else if(n == 0) {
            return new int[] { 0 };
        } else if(n == 1) {
            return new int[] { 0, 1 };
        } else {
            
            int[] f1 = generateSequence(n-1);
            int[] f2 = generateSequence(n-2);
            int[] newF = new int[f1.length+1];
            
            for(int i = 0; i < f1.length; i++) {
                newF[i] = f1[i];
            }
            
            newF[newF.length-1] = f1[f1.length-1] + f2[f2.length-1];
            
            return newF;
        }
    }

    public static void main(String[] args){

        Fibonacci f = new Fibonacci();
        int[] n = f.generateSequence(5);

        for(int i = 0; i < n.length; i++) 
            System.out.print(n[i]+ " ");
        System.out.println();        
    }
}
