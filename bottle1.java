mport java.util.Scanner;

public class Bottle1
{
private int cookies;
Scanner keyboard;

final int MAX = 500;
final int MIN = 0;

public Bottle1()
{
    pennies = 0;

    keyboard = new Scanner(System.in);
}

public void read()
{
    cookies = keyboard.nextInt();
}

public void set(int capacity)
{
    pennies = capacity;
}

public void set(Bottle bottle)
{
    pennies = bottle.get();
}

public int get()
{
    return pennies;
}


public Bottle add(int value)
{
    Bottle bottle = new Bottle();
    if (value + this.pennies <= MAX)
    {

        bottle.set(this.pennies + value);
    }
    else
    {
        System.out.println("Sorry! It has reached the max.");
    }

    return bottle;
}


public Bottle subtract(int value)
{
    Bottle bottle = new Bottle();
    if (this.pennies - value >= MIN)
    {

        bottle.set(this.pennies - value);
    }
    else
    {
        System.out.println("Sorry! It has reached the minimum.");
    }

    return bottle;
}


public Bottle1 multiply(int value)
{
    Bottle bottle = new Bottle();
    if (this.pennies * value <= max)
    {

        bottle.set(this.pennies * value);
    }
    else
    {
        System.out.println("Sorry! It has reached the bounds.");
    }

    return this;
}


public Bottle divide(int value)
{
    Bottle bottle = new Bottle();

    if (this.pennies > 0 && value > 0)
    {
        bottle.set(this.pennies / value);
    }
    else
    {
        System.out.println("Sorry! It has reached the bounds.");
    }

    return bottle;
}


public Bottle add(Bottle bottle)
{
    Bottle bot = new Bottle();
    if (bottle.get() + this.pennies <= max)
    {

        bot.set(this.cookies + bottle.get());
    }
    else
    {
        System.out.println("Sorry! It has reached the max.");
    }

    return bot;
}


public Bottle subtract(Bottle bottle)
{
    Bottle bot = new Bottle();
    if (bottle.get() - this.pennies >= min)
    {

        bot.set(bottle.get() - this.pennies);
    }
    else
    {
        System.out.println("Sorry! It has reached the min.");
    }

    return bot;
}


public Bottle multiply(Bottle bottle)
{
    Bottle bot = new Bottle();
    if (this.pennies * bottle.get() >= min
            || this.pennies * bottle.get() <= max)
    {

        bot.set(this.pennies * bottle.get());
    }
    else
    {
        System.out.println("Sorry! It has reached the bounds.");
    }

    // return the current Bottle object
    return bot;
}


public Bottle divide(Bottle bottle)
{
    Bottle bot = new Bottle();

    if (this.pennies > 0 && bottle.get() > 0)
    {
        bot.set(this.pennies / bottle.get());
    }
    else
    {
        System.out.println("Sorry! It has reached the bounds.");
    }

    return bot;
}


public boolean equals(Bottle bottle)
{

    if (this.pennies == bottle.get())
        return true;

    return false;
}


public String toString()
{
    return String.valueOf(this.pennies);
}
}
