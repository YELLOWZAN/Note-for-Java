
//��������Ѿ��ϴ���GitHub��2�û������Ƶ���
//ע�⣬javac������Windows11�п��ܻ�����jre���⣬����path���ɣ�����ʹ��power shell��DEVtool
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
