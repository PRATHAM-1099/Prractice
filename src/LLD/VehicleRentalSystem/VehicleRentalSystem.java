package LLD.VehicleRentalSystem;

import java.util.List;

public class VehicleRentalSystem {
    List<User> userList;
    List<Store> storeList;

    public void addUser(User user){
        userList.add(user);
    }

    public void addStore(Store store){
        storeList.add(store);
    }
}
