package hus.oop.lab10.designpattern.observer.exercise1;

import static hus.oop.lab10.designpattern.observer.exercise1.Event.NEW_ITEM;
import static hus.oop.lab10.designpattern.observer.exercise1.Event.SALE;

public class MainApp {

    /*
     * Video Reference: https://youtu.be/-oLDJ2dbadA
     */
    public static void main(String[] args) {

        Store store = new Store();
        store.getService().subscribe(NEW_ITEM, new EmailMsgListener("thangnguyen@like.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("nguyenthang@like.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("thangnv12@subs.com"));
        store.getService().subscribe(NEW_ITEM, new MobileAppListener("thangng123"));

        store.newItemPromotion();

        System.out.println("==========================================");

        store.salePromotion();

        System.out.println("==========================================");

        store.getService().unsubscribe(SALE, new EmailMsgListener("nguyenvthang211@like.com"));
        store.salePromotion();
    }
}