import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;

public class Cart {
  private ItemMap<CartItem, Integer> Contents;
  private ArrayList<CartItem> cartItems = new ArrayList<CartItem>();

  public Cart() {
    Contents = new ItemMap<>();
  }

  public Cart(int capacity) {
    Contents = new ItemMap<>(capacity);
  }

  public ItemMap<CartItem, Integer> getContents() {
    return Contents;
  }

  public ArrayList<CartItem> getCartItems() {
    return cartItems;
  }

  public boolean addToCart(CartItem item, int quanitity) {
    if (quanitity > 0) {
      if (Contents.get(item) != null) {
        changeItemsInCart(item, quanitity + Contents.get(item));
      } else {
        Contents.put(item, quanitity);
      }
      return true;
    } else {
      return false;
    }
  }

  public boolean changeItemsInCart(CartItem item, int quanitity) {
    if (quanitity > 0) {
      if (Contents.get(item) != null) {
        Contents.put(item, quanitity);
        return true;
      }
    }

    return false;
  }

  public boolean removeFromCart(CartItem item) {
    return Contents.remove(item) != null;
  }
}

class ItemMap<K extends CartItem, V> extends Dictionary<K,V> {
  private ArrayList<K> keys;
  private ArrayList<V> values;

  public ItemMap() {
    keys = new ArrayList<>(5);
    values = new ArrayList<>(5);
  }

  public ItemMap(int size) {
    keys = new ArrayList<>(size);
    values = new ArrayList<>(size);
  
  }

  public Enumeration<V> elements(){
    return null;
    //Not implemented yet
  }

  public Enumeration<K> keys(){
    return null;
    //Not implemented yet
  }

  public V get(Object key) {
    int indexOfValue = keys.indexOf(key);
    if (indexOfValue >= 0) {
      return values.get(indexOfValue);
    }
    return null;
  }

  public boolean isEmpty() {
    return keys.isEmpty();
  }

  public V put(K key, V value) {
    assert key != null;
    assert keys.size() == values.size();

    int indexOfValue = keys.indexOf(key);
    if (indexOfValue >= 0) {
      values.remove(indexOfValue);
      values.add(indexOfValue, value);
    } else {
      keys.add(key);
      values.add(value);
    }

    return null;
  }

  public V remove(Object key) {
    int indexOfValue = keys.indexOf(key);
    if (indexOfValue >= 0) {
      keys.remove(indexOfValue);
      return values.remove(indexOfValue);
    }

    return null;
  }

  public int size() {
    return keys.size();
  }
}