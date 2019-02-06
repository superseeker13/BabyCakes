import java.util.HashMap;

public class Checkout{
    private HashMap cart;
    public Checkout(HashMap map){
        cart = map;
    }

    public float calcBill(){
        float total = 0;
        foreach(item:cart.keySet()){
            total += cart[item].cost;
        }

    }
    public void receipt(){
        String output = "";

        foreach(item:cart.keySet()){
            output = output +  "\n" + item.Name + " - " + item.Desc + "\n\t\t$" + item.Price;
        }

        //textArea.setText(output); @FXML variable
    }
}