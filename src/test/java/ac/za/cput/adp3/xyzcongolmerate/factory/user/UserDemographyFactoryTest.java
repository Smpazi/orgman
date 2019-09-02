package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    private  SimpleDateFormat simpleDateFormat = new SimpleDateFormat(("dd/MM/yyyy"));

    private  Date date_Of_Birth = parseDate("20/08/2019");

    private Date parseDate(final String dateString) {
        try {
            return simpleDateFormat.parse(dateString);
        } catch (final ParseException e) {
            return new Date();
        }
    }

    public void setUp(){

    }
    @Test
    public void buildUserDemography() {
        UserDemography userDemography = UserDemographyFactory.buildUserDemography("smpazi95@gmail.com","S.M","F2","B2",date_Of_Birth);

        System.out.println(userDemography.getUserTitle());
        assertEquals("S.M",userDemography.getUserTitle());
    }
}