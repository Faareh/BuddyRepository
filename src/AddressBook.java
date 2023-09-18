import java.util.ArrayList;

public class AddressBook {

    private final ArrayList<BuddyInfo> buddyArr;

    public AddressBook(ArrayList<BuddyInfo> buddyArr) {
        this.buddyArr = buddyArr;
    }

    public void addBuddy(BuddyInfo buddy){
        this.buddyArr.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        this.buddyArr.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
