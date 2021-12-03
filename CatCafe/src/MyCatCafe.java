import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;

//接猫咖
public class MyCatCafe implements CatCafe{
    double balance ;
    ArrayList<Cat> CatList = new ArrayList<Cat>();
    ArrayList<Cat> number = new ArrayList<Cat>();
    ArrayList<Customer> CustomersList = new ArrayList<Customer>();
    ArrayList<Customer> CustomersListToday = new ArrayList<Customer>();
    LocalTime closetime = LocalTime.of(22,30);
    double buycost = 0;
    int ruatime = 0;
    Random random = new Random();



    @Override
    public void buy(Cat c) throws InsufficientBalanceException{
       //买入猫猫，要在猫咪列表中添加，
        //如果店内余额不足，抛出异常 InsufficientBalanceException .
        if (balance< c.price){
            throw new InsufficientBalanceException ();
        } else {
            buycost = buycost+c.price;
            balance -= c.price;
            CatList.add(c);
            System.out.println("成功购入一只"+c.kind+",取名为："+c.name);
        }
    }final


    @Override
    public void serve(Customer p,Cat c) throws CatNotFoundException{
        //若店内没猫，抛出 CatNotFoundException.
        if (CatList.isEmpty()==true){
            throw new CatNotFoundException();
        } else if (p.arrivalTime.isAfter(closetime)){
            System.out.println("但门店已经打烊，"+p.name+"离开。");
            System.out.println("=======================");
            return;
        } else {
            //if (CatList.isEmpty()==false&&p.arrivalTime.isBefore(closetime)){
            System.out.println("顾客"+p.name+"rua了猫猫"+c.name);}
            //接受客户参数 在顾客列表中加入新顾客
            CustomersList.add(p);
            if (p.arrival.equals(LocalDate.now())==true){
                CustomersListToday.add(p);
            }

            //rua一只猫收费15元
            balance = balance + (p.ruaTimes)*15;

            //顾客每次rua猫都随机挑选（用random找）
            int size = CatList.size();
            for (int i = 0;i<size;i++){
                int myrandom = random.nextInt(CatList.size());
                number.add(CatList.get(myrandom));
            }
            p.rua(c);
            ruatime += p.ruaTimes;

            //通过toString输出猫咪信息，计费加入店里余额，无所谓摸到重复的猫
            System.out.println("猫猫信息："+c);
            System.out.println("=====================");

   }


    @Override
    public void close(MyCatCafe MCC) {

        if (closetime.equals(LocalTime.now())==true){
            System.out.println(closetime+"。猫咖打烊。");
        }
        //LocalDate判断

        //输出当天光顾的顾客列表信息，
        if (CustomersListToday.isEmpty()==false){
            System.out.println("今日光顾的客户信息："+CustomersListToday);
        }else {
            System.out.println("今日无顾客光顾");
        }

        //计算并输出一天的利润（用rua猫次数计算）
        double profit = (ruatime)*15-(MCC.buycost);
        System.out.println("店内余额为："+balance);
        if (profit>=0){
            System.out.println("今日盈利，利润为："+profit);
        } else {
            System.out.println("今日亏损，金额为："+(0-profit));
        }
        System.out.println("=====================");

    }




}
