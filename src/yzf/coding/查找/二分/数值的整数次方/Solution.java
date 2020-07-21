//方法一、暴力法
public class Solution {
    public double Power(double base, int exponent) {
        if(base==0 ) return 0;
        else if(exponent==0) return 1;
        int n=0;
        if(exponent<0) n=-exponent;
        else n=exponent;
        double res=1;
        while(n>0){
            res*=base;
            n--;
        }
        return exponent>0?res:(1/res);
  }
}

//方法二、快速幂法（二分法）
public class Solution {
    public double Power(double base, int exponent) {
        if(base==0) return 0;
        long n=0;
        if(exponent<0){
            base=1/base;
            n=-exponent;
        }else n=exponent;
        double res=1.0;
        while(n>0){
        //(n&1)==1 判断奇数偶数
            if((n&1)==1) res*=base;
            base*=base;
            //右移相当于除2
            n>>=1;
        }
        return res;
  }
}
