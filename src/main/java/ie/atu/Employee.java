package ie.atu;

public class Employee {

    String name;
    String ID;

    Employee(String name, String ID)
    {
        this.name = setName(name);
        this.ID = setID(ID);
    }

    public String setName(String i) {
        if (i.length() >= 5 && i.length() <= 22)
        {
            return i;
        }
        else
        {
            throw new IllegalArgumentException("Name has to have minimum 5 characters and Maximum 22");
        }
    }

    public String setID(String s) {
        if (s.length() == 6)
        {
            return s;
        }
        else
        {
            throw new IllegalArgumentException("6 characters in length otherwise invalid PPS number error");
        }
    }
}
