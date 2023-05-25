package ro.ase.cts.command;

import javax.swing.plaf.BorderUIResource;

public class MainCommand {
    public static void main(String[] args){
        Waiter waiter = new Waiter();
        Chef chef = new Chef();
        waiter.takeOrder(new PizzaOrder(chef));
        waiter.takeOrder(new PizzaOrder(chef));
        waiter.takeOrder(new BurgerOrder(chef));
        waiter.sendsOrderToChef();
    }
}
