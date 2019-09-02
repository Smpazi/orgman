package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    @Test
    public void buildUser() {
        String email = "smpazi@gmail.com";
        User user= UserFactory.buildUser(email,"Salomi","Mpazi");

        System.out.println("User Email:"+ user.getUserEmail());
        assertEquals(email,user.getUserEmail());
    }
}