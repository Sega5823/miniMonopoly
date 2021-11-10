public class Map {
    public Cell[] map = new Cell[40];

    public void addCell(Cell cell){
        int number = cell.getNumber();
        if (map[number] != null) System.out.println("Клетка уже заполнена");
        else map[number] = cell;
    }
}