public class Street extends Cell{
    private int price;
    private String name, color;
    private Player owner;
    private boolean isMonopoly;

    public Street(String name, int price, String color, int number) {
        super(number);
        this.name = name;
        this.price = price;
        this.owner = null;
        this.color = color;
        this.isMonopoly = false;
    }
    public void buyStreet(Player player){
        if (player.spendMoney(this.price)) {
            this.owner = player;
            System.out.printf("%s купил %s", this.name, player.getName());
        }
        else System.out.printf("У игрока %s недостаточно денег для покупки этой улицы\n", player.getName());
    }
}
