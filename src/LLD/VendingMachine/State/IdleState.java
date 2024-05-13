package LLD.VendingMachine.State;

import LLD.VendingMachine.Coin;
import LLD.VendingMachine.Item;
import LLD.VendingMachine.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State{

    private  VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
        this.vendingMachine.setCoinList(new ArrayList<>());
    }
    @Override
    public void clickOnInsertCoinButton() throws Exception {
        System.out.println("Inserting coins into Vending Machine");
        vendingMachine.setState(vendingMachine.getHasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton() throws Exception {

    }

    @Override
    public void insertCoin(Coin coin) throws Exception {

    }

    @Override
    public void chooseProduct(int codeNumber) throws Exception {

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        return 0;
    }

    @Override
    public Item dispenseProduct(int codeNumber) throws Exception {
        return null;
    }

    @Override
    public List<Coin> refundFullMoney() throws Exception {
        return null;
    }

    @Override
    public void updateInventory(Item item, int codeNumber) throws Exception {

    }
}
