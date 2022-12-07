package ie.atu;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Employee Test")
class EmployeeTest {

    Employee Tester = new Employee("Aaron", "123456");
    @BeforeEach
   void beforeEach()
    {}

    @Test
    void nameTest()
    {
        assertEquals("Aaron", Tester.setName("Aaron"));
    }
    @Test
    void nameTestFail()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Employee("Joel", "1234356"));
        assertEquals("Name has to have minimum 5 characters and Maximum 22", e_message.getMessage());
    }

    @Test
    void IDTest()
    {
        assertEquals("123456", Tester.setID("123456"));
    }
    @Test
    void IDTestFail()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Employee("Joels","12345"));
        assertEquals("6 characters in length otherwise invalid PPS number error", e_message.getMessage());
    }

    @AfterEach
    void afterEach()
    {}

}