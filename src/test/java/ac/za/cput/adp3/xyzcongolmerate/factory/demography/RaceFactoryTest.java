package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void buildRace() {
        String race = "Black";

        Race race1 = RaceFactory.buildRace(race);
        System.out.println("Race:"+race1.getRaceDescription());
        assertEquals(race,race1.getRaceDescription());

    }
}