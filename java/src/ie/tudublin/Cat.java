package ie.tudublin;

public class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);
    }

    private int numLives; 

    public int getnumLives()
    {
        return numLives;
    }

    public void setnumLives(int numLives)
    {
        this.numLives = numLives;
    }

    public Cat(int numLives)
    {
        this.numLives = 9; 
    }

    static void kill()
    {
        if(numLives > 0)
        {
          numlives - 1;  
          System.out.println("Ouch!"); 
        }
        else
        {
            System.out.println("Dead")
        }
    }

    Cat ginger = new Cat("ginger")
}