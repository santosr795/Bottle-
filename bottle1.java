mport java.util.Scanner;

public class Bottle1
{
private int cookies;
Scanner input;

final int max = 500;
final int min = 0;

public Bottle1()
{
    cookies = 0;

    input = new Scanner(System.in);
}

public void read()
{
    cookies = input.nextInt();
}

public void set(int capacity)
{
    cookies = capacity;
}

public void set(Bottle bottle)
{
    cookies = bottle.get();
}

public int get()
{
    return cookies;
}


public Bottle add(int value)
{
    Bottle bottle = new Bottle();
    if (value + this.cookies <= max)
    {

        bottle.set(this.cookies + value);
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
    if (this.cookies - value >= min)
    {

        bottle.set(this.cookies - value);
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
    if (this.cookies * value >= min
            || this.cookies * value <= max)
    {

        bottle.set(this.cookies * value);
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

    if (this.cookies > 0 && value > 0)
    {
        bottle.set(this.cookies / value);
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
    if (bottle.get() + this.cookies <= max)
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
    if (bottle.get() - this.cookies >= min)
    {

        bot.set(bottle.get() - this.cookies);
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
    if (this.cookies * bottle.get() >= min
            || this.cookies * bottle.get() <= max)
    {

        bot.set(this.cookies * bottle.get());
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

    if (this.cookies > 0 && bottle.get() > 0)
    {
        bot.set(this.cookies / bottle.get());
    }
    else
    {
        System.out.println("Sorry! It has reached the bounds.");
    }

    return bot;
}


public boolean equals(Bottle bottle)
{

    if (this.cookies == bottle.get())
        return true;

    return false;
}


public String toString()
{
    return String.valueOf(this.cookies);
}
}
