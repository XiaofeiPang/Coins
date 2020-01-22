package coins;

import java.util.HashMap;
import java.util.Scanner;

public class Coins {
    private HashMap<Integer,String> a=new HashMap<Integer, String>();//成员容器需要用构造函数进行初始化
    public  Coins(){
        a.put(1,"png");
        a.put(5,"yuan");
        a.put(20,"fei");
        a.put(50,"qing");
        a.put(50,"1毛钱");
        System.out.println(a.keySet().size());
        System.out.println(a);
        for (Integer s : a.keySet()) {
            String n = a.get(s);
            System.out.println(n);
        }

    }
    public String CoinName(int amount) {
        if (a.containsKey(amount))
            return a.get(amount);

        else
            return "NO Found";



    }


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int d=in.nextInt();
        Coins coins=new Coins();
        String m=coins.CoinName(d);
        System.out.println(m);

    }
}
