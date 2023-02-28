//Addison Farley
//SDEV 219
//enums lab

package user;

public class Person
{
    private Title title;
    private String fName;
    private String lName;
    private String nickName;

    public Person(Title title, String fName, String lName, String nickName)
    {
        this.title = title;
        this.fName = fName;
        this.lName = lName;
        this.nickName = nickName;
    }

    @Override
    public String toString()
    {
        return title.toString() + ". " + fName + " " + lName + " (" +
                nickName + ")";
    }
}
