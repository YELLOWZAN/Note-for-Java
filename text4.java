
//�������Ӧ��ĿΪ�α�P38���壬2��

public class text4 {

    public static void main(String[] args) {
        int firstLetter, lastLetter;
        char firstG = '��', lastG = '��';      //��ȡ����ĸ��ĩ��ĸ��ֵ

        firstLetter = (int)firstG;
        lastLetter = (int)lastG;

        System.out.println("����Ϊ�������ĸ�� ");
        for(int i=firstLetter; i<=lastLetter; ++i)
        {
            char greekLetter;

            greekLetter = (char)i;

            System.out.print(" "+greekLetter);
        }
    }

}