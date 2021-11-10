public class Event extends Cell{
    private String name, content;
    private int money;

    public Event(String name, String content, int money, int number) {
        super(number);
        this.name = name;
        this.content = content;
        this.money = money;
    }
    public void playEvent(Player player){
        System.out.println(this.name);
        System.out.println(this.content);
        player.earnMoney(this.money);
    }
}
