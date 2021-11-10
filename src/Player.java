import java.util.Random;

public class Player {
    private String name;
    private int cash, number;

    public Player(String name) {
        this.name = name;
        this.cash = 800;
        this.number = 0;
    }
    public int roll(){
        Random rand = new Random();
        //В настоящей игре мы бы бросали 2 кубика
        //int x = 2 + rand.nextInt(12 - 2 + 1);
        return 1 + rand.nextInt(5 - 2 + 1);
    }
    public void move(int x){
        this.number += x;
    }

    public int getNumber() {
        return number;
    }

    public boolean spendMoney(int money){
        this.cash -= money;
        if (this.cash < 0){
            this.cash += money;
            return false;
        } else return true;
    }

    public String getName() {
        return name;
    }
    public void earnMoney(int money){
        this.cash += money;
    }
}
