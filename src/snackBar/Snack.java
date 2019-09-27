package snackBar;

public class Snack
{
    // fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendId;

    //constructor
    public Snack(String name, int quantity, double cost, int vendId)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendId = vendId;
    }
}
