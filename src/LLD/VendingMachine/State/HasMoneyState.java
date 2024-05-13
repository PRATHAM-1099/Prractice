package LLD.VendingMachine.State;

import LLD.VendingMachine.Coin;
import LLD.VendingMachine.Item;
import LLD.VendingMachine.VendingMachine;

import java.util.List;

public class HasMoneyState implements State{

    private VendingMachine vendingMachine;

    public HasMoneyState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;

    }
    @Override
    public void clickOnInsertCoinButton() throws Exception {

    }

    @Override
    public void clickOnStartProductSelectionButton() throws Exception {
        this.vendingMachine.setState(this.vendingMachine.getSelectionState());
    }

    @Override
    public void insertCoin(Coin coin) throws Exception {
        System.out.println("Accepted the coin");
        this.vendingMachine.getCoinList().add(coin);
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
        System.out.println("Dispensing all money back to trey");
        this.vendingMachine.setState(this.vendingMachine.getIdleState());
        return this.vendingMachine.getCoinList();
    }

    @Override
    public void updateInventory(Item item, int codeNumber) throws Exception {

    }
}
