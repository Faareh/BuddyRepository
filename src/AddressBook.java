import java.util.ArrayList;

public class AddressBook {

    private ArrayList bookArr;

    public AddressBook() {
        this.bookArr = new ArrayList();
    }

    public void addBuddy(BuddyInfo buddy){
        this.bookArr.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        this.bookArr.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
