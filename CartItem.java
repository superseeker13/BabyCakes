public class CartItem{

  protected String Name;
  protected Integer Small;
  protected Integer Large;

  public CartItem() {
    Name = " ";
    Small = 0;
    Large = 0;
  }

  public CartItem(String Name, Integer Small, Integer Large) {
    this.Name = Name;
    this.Small = Small;
    this.Large = Large;
  }

  public String getName(){
    return this.Name;
  }

  public Integer getSmallPrice(){
    return this.Small;
  }

  public Integer getLargePrice(){
    return this.Large;
  }

  public boolean equals(CartItem objOne){
    if (getName().equals(objOne.getName())){
      if (getSmallPrice().equals(objOne.getSmallPrice())){
        if (getLargePrice().equals(objOne.getLargePrice())){
          return true;
        }
      }
    }
    return false;
  }

}