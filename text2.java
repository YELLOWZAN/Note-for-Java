
//这个代码已经上传到GitHub，2用户名：黄德攒
//注意，javac命令在Windows11中可能会遇到jre问题，重新path即可，或者使用power shell，DEVtool
public class text2 {
    public static void main(String args[]){
        byte b = 22;
        int n = 129;
        float f =123456.6789f;
        double d = 123456789.123456789;
        System.out.println("b= "+b);
        System.out.println("n= "+n);
        System.out.printf("f= %-30.12f\n",f);
        System.out.printf("d= %-30.12f\n",d);
        b=(byte)n;
        f=(float)d;
        System.out.printf("b= %d\n",b);
        System.out.printf("f= %-30.12f\n",f);

    }
}
