import java.time.LocalDate;
import java.time.LocalTime;
public class Test {

    public static void main(String[] args) {
        Cat c1 = new OrangeCat("小橘子","白橘相间",1,200,"OrangeCat",true);
        Cat c2 = new BlackCat("小黑","黑色",1,350,"BlackCat");
        Cat c3 = new BlackCat("白白","黑白斑点色",2,350,"BlackCat");

        Customer p1 = new Customer("林林",6, LocalDate.now(),LocalTime.of(10,40));
        Customer p2 = new Customer("小小",9,LocalDate.of(2021,12,3), LocalTime.of(23,56));
        Customer p3 = new Customer("一一",2,LocalDate.now(),LocalTime.of(14,10));
        Customer p4 = new Customer("七七",3,LocalDate.of(2021,12,6),LocalTime.of(19,15));
        Customer p5 = new Customer("意林",7,LocalDate.of(2021,12,7),LocalTime.now());


        MyCatCafe myCatCafe = new MyCatCafe();
        myCatCafe.balance = 800;

        //买猫
        try {
            myCatCafe.buy(c1);
             System.out.println("==========");
            } catch (InsufficientBalanceException ie ){
            ie.printStackTrace();
            System.out.println("店内余额不足，购买"+c1.kind+c1.name+"失败！");
             System.out.println("==============");
        }

        try {
            myCatCafe.buy(c2);
            System.out.println("==========");
        } catch (InsufficientBalanceException ie ){
            ie.printStackTrace();
            System.out.println("店内余额不足，购买"+c2.kind+c2.name+"失败！");
            System.out.println("==============");
        }finally {

        }

        try {
            myCatCafe.buy(c3);
            System.out.println("==========");
        } catch (InsufficientBalanceException ie ){
            ie.printStackTrace();
            System.out.println("店内余额不足，购买"+c3.kind+c3.name+"失败！");
            System.out.println("==============");
        }finally {
        }

        Cat cat1 = myCatCafe.CatList.get(myCatCafe.random.nextInt(myCatCafe.CatList.size()));
        Cat cat2 = myCatCafe.CatList.get(myCatCafe.random.nextInt(myCatCafe.CatList.size()));
        Cat cat3 = myCatCafe.CatList.get(myCatCafe.random.nextInt(myCatCafe.CatList.size()));
        Cat cat4 = myCatCafe.CatList.get(myCatCafe.random.nextInt(myCatCafe.CatList.size()));
        Cat cat5 = myCatCafe.CatList.get(myCatCafe.random.nextInt(myCatCafe.CatList.size()));


        //招待顾客
         try {
            p1.Arrival(p1);
            myCatCafe.serve(p1,cat1);
            }catch (CatNotFoundException cne){
             cne.printStackTrace();
            System.out.println("店内无猫，请稍后。");
             System.out.println("==============");
        }finally {

         }

        try {
            p2.Arrival(p2);
            myCatCafe.serve(p2,cat2);
        }catch (CatNotFoundException cne){
            cne.printStackTrace();
            System.out.println("店内无猫，请稍后。");
            System.out.println("==============");
        }finally {

        }

        try {
            p3.Arrival(p3);
            myCatCafe.serve(p3,cat3);
        }catch (CatNotFoundException cne){
            cne.printStackTrace();
            System.out.println("店内无猫，请稍后。");
            System.out.println("==============");
        }finally {
        }

        try {
            p4.Arrival(p4);
            myCatCafe.serve(p4,cat4);
        }catch (CatNotFoundException cne){
            cne.printStackTrace();
            System.out.println("店内无猫，请稍后。");
            System.out.println("==============");
        }finally {

        }

        try {
            p5.Arrival(p5);
            myCatCafe.serve(p5,cat5);
        }catch (CatNotFoundException cne){
            cne.printStackTrace();
            System.out.println("店内无猫，请稍后。");
            System.out.println("==============");
        }finally {

        }

        //闭馆
        myCatCafe.close(myCatCafe);





    }


}
