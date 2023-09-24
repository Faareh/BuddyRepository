import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> bookArr;

    public AddressBook() {
        bookArr = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if(buddy !=null) {
            bookArr.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if (index >= 0 && index < bookArr.size()) {
            return bookArr.remove(index);
        }
        return null;
    }

    public ArrayList<BuddyInfo> getBuddy(){
        return bookArr;
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
        System.out.println("New change to push");
        System.out.println("Changed on Github");
        System.out.println("Last change");
    }
}
