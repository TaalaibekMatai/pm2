class Videospiel implements Medium
{

    /**
     * Ein Kommentar zum Medium
     */
    private String _kommentar;

    /**
     * Der Titel des Mediums
     * 
     */
    private String _titel;
    
    private String _system;
    
   
    
    /**
     * Initialisiert ein neues Exemplar.
     * 
     * @param titel Der Titel der Videospiel
     * @param kommentar Ein Kommentar zu der Videospiel
     * @param system 
     * 
     * 
     * @require titel != null
     * @require kommentar != null
     * @require system != null
     *
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * 
     */

    public Videospiel(String titel, String kommentar, String system)
    {
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert system != null : "Vorbedingung verletzt: system != null";
        _titel = titel;
        _kommentar = kommentar;
        _system = system;
       
        
    }
	@Override
	public String getKommentar()
	{
		
		return _kommentar;
	}

	@Override
	public String getMedienBezeichnung()
	{
		
		return "Video";
	}

	@Override
	public String getTitel()
	{
		
		return _titel;
	}
	
	
	public String getSystem()
	{
		return _system;
	}

}
