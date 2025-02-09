package hus.oop.lab11.designpattern.observer.exercise1;

import static hus.oop.lab11.designpattern.observer.exercise1.Event.NEW_ITEM;
import static hus.oop.lab11.designpattern.observer.exercise1.Event.SALE;

public class Store {
    private final NotificationService notificationService;

    public Store() {
        notificationService = new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.notifyCustomers(NEW_ITEM);
    }

    public void salePromotion() {
        notificationService.notifyCustomers(SALE);
    }

    public NotificationService getService() {
        return notificationService;
    }
}