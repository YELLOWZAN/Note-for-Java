
import java.util.Scanner;//������Ӧģ��
//���������ϴ�GitHub
public class text3 {
    public static void main(String args[]){
        System.out.println("�������ݲ��Իس��ָ�����0��β");
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        double x = reader.nextDouble();
        while (x!=0){
            sum = sum + x;
            x = reader.nextDouble();

        }
        System.out.printf("sum = %10.5f\n",sum);

    }
}
