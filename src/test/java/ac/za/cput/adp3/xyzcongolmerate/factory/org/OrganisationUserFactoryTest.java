package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    @Test
    public void buildOrganisationUser() {
        OrganisationUser organisationUser = OrganisationUserFactory.buildOrganisationUser("org23","smpazi95@gmail.com");
        System.out.println("OrganisationUser_Code:" +organisationUser.getOrgCode());

        assertEquals("org23",organisationUser.getOrgCode());

    }
}