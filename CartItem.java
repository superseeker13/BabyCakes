public class CartItem implements Comparable{

  private String Name;
  private Integer Small;
  private Integer Large;

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

  public String getSmallPrice(){
    return this.Small;
  }

  public Integer getLargePrice(){
    return this.Large;
  }

  @Override
  public boolean compareTo(CartItem objOne){
    if (getName().equals(objOne.getName())){
      if (getSmall().equals(objOne.getSmall())){
        if (getLarge().equals(objOne.getLarge())){
          return true;
        }
      }
    }
    return false;
  }

}