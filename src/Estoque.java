public class Estoque {
    String name;
    double price;
    int quantity;

    public double TotalValueStock ()
    {
        double total = price * quantity;
        return total;
    }
    public void AddProducts ( int quant)
    {
        this.quantity += quant;
    }
    public void RemoveProducts ( int quant)
    {
        this.quantity -= quant;
    }
}
