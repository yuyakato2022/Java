package day2;

public class Sample201 {

    public static void main(String[] args) {
        System.out.print(5 + " + " + 2 + " = ");
        System.out.println(5+2);    //  足し算
        System.out.print(5 + " - " + 2 + " = ");
        System.out.println(5-2);    //  引き算
        System.out.print(5 + " * " + 2 + " = ");
        System.out.println(5*2);    //  掛算
        System.out.print(5 + " / " + 2 + " = ");
        System.out.print(5/2);      //  割り算
        System.out.print(" 余り ");
        System.out.println(5%2);    //  剰余

        int a;
        int b = 3;
        int add,sub;
        double avg;
        a = 6;
        add = a + b;
        sub = a - b;
        avg = (a + b) / 2.0;
        System.out.println(a + " + " + b + " = " + add);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + "と" + b + "の平均値：" + avg);
    }

}