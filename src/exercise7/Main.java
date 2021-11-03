package exercise7;
/*
Exercise 7:  Explain the concept of the "static" keyword

    Answer:
    Static keywordet kan bruges, når man vil referere til hele klassen og ikke de enkelte objekter.
    Static ville man bruge, når noget er relevant for hele klasse.
    Man kan gøre sig overvejelserne når man skal bruge static;
    - skal det enkelte objekt påvirkes (non static), eller skal hele klassen påvirkes (static)?.

    Eksempel:
    Vi har en klasse med navn Employees med attributterne ’id’ og ’salary’. Derudover har vi en static variable ’ceo’,
    som skal være statisk, fordi værdien skal være den samme for klassen og det samme for hvert objekt der bliver
    oprettet.
    Opretter vi to nye objekter med employee, kan de to employee have forskellig id og forskellig salary.
    Alstå forskellige værdier. Men de to nye objekter har den samme ceo (samme værdi), fordi de er ansat samme sted.
    Kalder vi det ene objekt, og vil ændre ceo værdien på den, vil ceo værdien blive ændret på begge objekterne.
    Vi kan derfor ændre værdien ved at kalde på klassen i stedet for det oprettede objekt.
    
 */