import java.util.ArrayList;
import java.util.HashMap;

public class Cart {
  private HashMap<String, Integer> Contents;
  private ArrayList<String> cartItems = new List<String>();

  public Cart() {
    Contents = new HashMap<String, Integer>();
  }

  public Cart(int capacity) {
    Contents = new HashMap<String, Integer>(capacity);
  }

  
  public HashMap<String, Integer> getContents() {
    return Contents;
  }

  public ArrayList<String> getCartItems() {
    return cartItems;
  }

  public void addToCart(CartItem item, int quanitity) {
    if (quanitity > 0) {
      if (Contents.ContainsKey(item.getName())) {
        changeItemsInCart(item.getName(), quanitity + Contents.get(item.getName()));
      } else {
        Contents.Add(item.getName(), quanitity);
      }
    } else {
      System.println("Invaild Quanitity.\n");
    }
  }

  public void changeItemsInCart(String itemName, int quanitity) {
    if (quanitity > 0) {
      if (Contents.ContainsKey(itemName)) {
        Contents.put(itemName, quanitity);
      } else {
        System.println("Item is not in cart.\n");
      }
      System.println("Invaild Quanitity.\n");
    }
  }

  public bool removeFromCart(String itemName) {
    return Contents.Remove(itemName);
  }

}