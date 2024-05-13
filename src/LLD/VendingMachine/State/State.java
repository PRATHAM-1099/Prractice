package LLD.VendingMachine.State;

import LLD.VendingMachine.Coin;
import LLD.VendingMachine.Item;

import java.util.List;

public interface State {
    public void clickOnInsertCoinButton() throws Exception;

    public void clickOnStartProductSelectionButton() throws Exception;

    public void insertCoin(Coin coin) throws Exception;

    public void chooseProduct(int codeNumber) throws Exception;

    public int getChange(int returnChangeMoney) throws Exception;

    public Item dispenseProduct(int codeNumber) throws Exception;

    public List<Coin> refundFullMoney() throws Exception;

    public void updateInventory(Item item, int codeNumber) throws Exception;
}
