package ie.tudublin;

public class Cat extends Animal
{
    private int numLives;
    public Cat(String name)
    {
        super(name);
        numLives = 9;
    }

    public int getNumLives() {
        return numLives;
    }

    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

    void kill()
    {
        if (numLives > 0)
        {
            System.out.println("Ouch!");
            numLives --;
        }
        else
        {
            System.out.println("I am dead!");
        }
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