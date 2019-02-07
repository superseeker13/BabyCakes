import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CartTests
{ 

  @Test
  public void addOneItemTest()  
  { 
    Cart myCart = new Cart(5);
    CartItem item = new CartItem();
    myCart.addToCart(item, 1);
    Assert.AreEqual(myCart.getContents().size(), 1);
  }

  @Test
  public void removeItemTest()  
  { 
    Cart myCart = new Cart(5);
    CartItem item = new CartItem();
    myCart.addToCart(item, 1);
    myCart.removeFromCart(item);
    Assert.AreEqual(myCart.getContents().size(), 0);
  }

  @Test
  public void addSeveralLikeItemTest() 
  { 
    Cart myCart = new Cart(5);
    CartItem itemOne = new CartItem();
    myCart.addToCart(itemOne, 5);
    Assert.AreEqual(myCart.getContents().get(itemOne), 5);
  }

  @Test
  public void addSeveralDifferentItemTest() 
  {
    Cart myCart = new Cart(5);
    CartItem itemOne = new CartItem();
    CartItem itemTwo = new CartItem("  ", 3, 1);
    myCart.addToCart(itemOne, 1);
    myCart.addToCart(itemTwo, 1);
    Assert.AreEqual(myCart.getContents().size(), 2);
  }

  @Test
  public void ChangeItemQuantityTest() 
  {
    Cart myCart = new Cart(5);
    CartItem itemOne = new CartItem();
    myCart.addToCart(itemOne, 1);
    myCart.changeItemsInCart(itemOne, 5);
    Assert.AreEqual(myCart.getContents().get(itemOne), 5);
  }

  @Test
  public void ChangeItemQuantityToZeroTest() 
  {
    Cart myCart = new Cart(5);
    CartItem itemOne = new CartItem();
    myCart.addToCart(itemOne, 1);
    myCart.changeItemsInCart(itemOne, 0);
    Assert.AreEqual(myCart.getContents().get(itemOne), 1);
  }

  @Test
  public void removeItemFromEmptyCart() 
  {
    Cart myCart = new Cart(5);
    bool removed = myCart.removeFromCart(" ");
    Assert.AreEqual(removed, false);
  }

}