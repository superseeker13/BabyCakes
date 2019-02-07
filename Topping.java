public class Topping extends CartItem {
  private CartItem parent;

  @Override
  public Integer getSmallPrice() {
    return this.Small + parent.getSmallPrice();
  }

  @Override
  public Integer getLargePrice(){
    return this.Large + parent.getLargePrice();
  }

  public boolean equals(CartItem objOne) {
    if (getName().equals(objOne.getName())) {
      if (getSmallPrice().equals(objOne.getSmallPrice())) {
        if (getLargePrice().equals(objOne.getLargePrice())) {
          return true;
        }
      }
    }
    return false;
  }

}