//Addison Farley
//SDEV 219
//enums lab

package animals;

public enum Animal
{
    BEAR(25, "Mammal"),
    SNAKE(25, "Reptile"),
    RACCOON(2.5, "Mammal"),
    ELEPHANT(65, "Mammal");

    private double lifespan;
    private String subtype;

    private Animal(double lifespan, String subtype)
    {
        this.lifespan = lifespan;
        this.subtype = subtype;
    }

    @Override
    public String toString()
    {
        return "Animal{" +
                "lifespan=" + lifespan +
                ", subtype='" + subtype + '\'' +
                '}';
    }
}
