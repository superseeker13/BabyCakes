public class CartItem {

  private String Name;
  private String Desc;
  private Integer Price;

  public CartItem() {
    Name = " ";
    Desc = " ";
    Price = 0;
  }

  public CartItem(String Name, String Desc, Integer Price) {
    this.Name = Name;
    this.Desc = Desc;
    this.Price = Price;
  }

  public String getName(){
    return this.Name;
  }

  public String getDesc(){
    return this.Desc;
  }

  public Integer getPrice(){
    return this.Price;
  }

}