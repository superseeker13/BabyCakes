import java.util.ArrayList;
import java.util.HashMap;

public class Cart {
  private HashMap<CartItem, Integer> Contents;
  private ArrayList<CartItem> cartItems = new List<CartItem>();

  public Cart() {
    Contents = new HashMap<CartItem, Integer>();
  }

  public Cart(int capacity) {
    Contents = new HashMap<CartItem, Integer>(capacity);
  }

  public HashMap<CartItem, Integer> getContents() {
    return Contents.clone();
  }

  public ArrayList<CartItem> getCartItems() {
    return cartItems.clone();
  }

  public void addToCart(CartItem item, int quanitity) {
    if (quanitity > 0) {
      if (Contents.ContainsKey(item)) {
        changeItemsInCart(item, quanitity + Contents.get(item));
      } else {
        Contents.Add(item, quanitity);
      }
    } else {
      System.println("Invaild Quanitity.\n");
    }
  }

  public void changeItemsInCart(CartItem itemName, int quanitity) {
    if (quanitity > 0) {
      if (Contents.ContainsKey(item)) {
        Contents.put(item, quanitity);
      } else {
        System.println("Item is not in cart.\n");
      }
      System.println("Invaild Quanitity.\n");
    }
  }

  public bool removeFromCart(CartItem item) {
    return Contents.Remove(item);
  }

}