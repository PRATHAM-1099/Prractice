package LLD.VendingMachine;

public class Inventory {
    ItemShelf[] itemShelves;

    public Inventory(int itemSize){
        itemShelves = new ItemShelf[itemSize];
    }
}
