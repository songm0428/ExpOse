package edu.allegheny.expose.examples;

public class testAlgs{
    public static void main(String[] args){

        System.out.println("Testing.");
        linear(10000);
        log(10000);

    }

    public static int linear(long n){
        int face=1;
        for (int count = 0; count < n; count++){
            try{
                Thread.sleep(20);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        return face;
    }
    public static int log(long n){
        int face=1;
        for (int count = 1; count < n; count*=3){
            face = 0;
            try{
                Thread.sleep(20);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        return face;
    }
    public static void constant(long n){
        try{
            Thread.sleep(20);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void linearithmic(long n){
        linear(n);
        log(n);
    }

    public static void cubic(long n){
        for (int count = 0; count < n; count++){
            for (int count2 = 0; count2 < n; count2++){
                for (int count3 = 0; count3 < n; count3++){

                    try{
                Thread.sleep(20);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

                }
            }
        }
    }

    public static void factorial(long n) {
        for(long i=0; i<n; i++) {
            factorial(n-1);
        }
    }

}
