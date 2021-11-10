public class Main {
    public static void main(String[] args) {
        Map monopoly = new Map();
        monopoly.addCell(new Street("Старая дорога", 30, "Оранжевый", 1));
        monopoly.addCell(new Street("Новое шоссе", 35, "Оранжевый", 2));
        monopoly.addCell(new Street("Аквапарк", 50, "Зеленый", 3));
        monopoly.addCell(new Street("Городской парк", 50, "Зеленый", 4));
        monopoly.addCell(new Event("Падение биткоина", "Биткоин упал. Вы теряете 50 долларов", 50,5));

        Player player1 = new Player("Sergey");
        Player player2 = new Player("Ksusha");

        player1.move(player1.roll());
        if (monopoly.map[player1.getNumber()] instanceof Street){
            ((Street) monopoly.map[player1.getNumber()]).buyStreet(player1);
        } else if (monopoly.map[player1.getNumber()] instanceof Event){
            ((Event) monopoly.map[player1.getNumber()]).playEvent(player1);
        }
    }
}
