package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    @Test
    public void buildRole() {
        Role role = RoleFactory.buildRole("programmer2");
        System.out.println(role.getRoleId() + "\nRole Name: " +role.getRoleName());
        assertEquals("programmer2",role.getRoleName());
    }
}