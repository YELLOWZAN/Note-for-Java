
import java.util.Scanner;//导入相应模块
//本代码已上传GitHub
public class text3 {
    public static void main(String args[]){
        System.out.println("输入数据并以回车分隔，以0结尾");
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
