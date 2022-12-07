package ie.atu;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Employee Test")
class EmployeeTest {

    Employee Tester = new Employee("Aaron");
    @BeforeEach
   void beforeEach()
    {}

    @Test
    void nameTest()
    {
        assertEquals("Aaron", Tester.getName("Aaron"));
    }
    @Test
    void nameTestFail()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Employee("Joel"));
        assertEquals("Name has to have minimum 5 characters and Maximum 22", e_message.getMessage());
    }

    @AfterEach
    void afterEach()
    {}

}