import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VideospielTest
{
	private static final String KOMMENTAR = "Kommentar";
	private static final String TITEL = "Titel";
	private static final String Video_BEZEICHNUNG = "Video";
	private static final String SYSTEM = "system";
	

	private Videospiel _videospiel1;
	private Videospiel _videospiel2;

	public VideospielTest()
	{
		_videospiel1 = getMedium();
		_videospiel2 = getMedium();
	}

	@Test
	
	 // Alle Testmethoden erhalten die Annotation @Test. Dafür müssen diese nicht
    // mehr mit test im Namen beginnen. Dies wird jedoch aus Gewohnheit
    // oft weiter verwendet.
	
	public void testGetMedienBezichung()
	{
		String videoBeziechnung = Video_BEZEICHNUNG;
		assertEquals(videoBeziechnung, _videospiel1.getMedienBezeichnung());
	}

	@Test
	public void testGetKommentar()
	{
		assertEquals(KOMMENTAR, _videospiel1.getKommentar());

	}
	
	@Test
	public void testGetTitel()
	{
		assertEquals(TITEL, _videospiel1.getTitel());

	}
     
	@Test
	public void testGetSystem()
	{
		assertEquals(SYSTEM, _videospiel1.getSystem());
	}
	

    @Test
    public void testKonstruktor()
    {
        assertEquals(TITEL, _videospiel1.getTitel());
        assertEquals(KOMMENTAR, _videospiel1.getKommentar());
        assertEquals(SYSTEM, _videospiel1.getSystem());
    }
    
    @Test
    /*
     * Von ein und der selben Video kann es mehrere Exemplare geben, die von
     * unterschiedlichen Personen ausgeliehen werden können.
     */
	
	public void testEquals()
    {
        assertFalse("Mehrere Exemplare der gleichen Video sind ungleich",
                _videospiel1.equals(_videospiel2));
        assertTrue("Dasselbe Exemplare der gleichen Video ist gleich",
                _videospiel1.equals(_videospiel1));
    }

	private Videospiel getMedium()
	{
		return new Videospiel(TITEL, KOMMENTAR, SYSTEM);
	}

}
