package ie.atu;

public class Employee {

    String name;

    Employee(String name)
    {
        this.name = getName(name);
    }

    public String getName(String i) {
        if (i.length() >= 5 && i.length() <= 22)
        {
            return i;
        }
        else
        {
            throw new IllegalArgumentException("Name has to have minimum 5 characters and Maximum 22");
        }
    }
}
