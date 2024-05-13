package LLD.VendingMachine;

import LLD.VendingMachine.State.*;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    State state;
    State idleState;
    State hasMoneyState;
    State selectionState;
    State dispenseState;
    Inventory inventory;
    List<Coin> coinList;

    public VendingMachine(){
        idleState = new IdleState(this);
        hasMoneyState = new HasMoneyState(this);
        selectionState = new SelectionState(this);
        dispenseState = new DispenseState(this);
        this.state = idleState;
        inventory = new Inventory(10);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getIdleState() {
        return idleState;
    }

    public void setIdleState(State idleState) {
        this.idleState = idleState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public void setHasMoneyState(State hasMoneyState) {
        this.hasMoneyState = hasMoneyState;
    }

    public State getSelectionState() {
        return selectionState;
    }

    public void setSelectionState(State selectionState) {
        this.selectionState = selectionState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
