class Solution {
    public double myPow(double x, int n) {
      
      double ans = power(x,1L*n);
        return  ans;
    }
    public static double power(double x, long n){
        if(n==0) return 1.0;
         if(n<0){
             return power(1/x,-n);
         } 
       if(n%2==0){
           return power(x*x,n/2);
       }else{
           return x*power(x*x,n/2);
       }
       
    }
}