# Määrittelydokumentti
Sähköverkot ovat yhtenäisiä verkkoja normaalissa käyttötilanteessa, verkkohäiriön aikana sähköverkkoon voi muodostua 
saarekkeita eli toisistaan eriytyneitä sähköverkon osasia. Laboratoriotyön tarkoituksena on tehdä ohjelma, joka tutkii 
sähköverkon yhtenäiset osat syvyyshaulla. Tämän jälkeen ohjelma etsii lyhimmän reitin isoimmasta verkosta pienempään/pienempiin
verkkoihin käyttäen omaa algoritmia. 

Syötteenä ohjelma saa tekstimuodossa tietoja verkon kaarista. Kaaridatassa ilmoitetaan kahden solmun nimi, joka kuvaa voimajohtoa ja lisäksi tähän tietoon on liitetty voimajohdon jännitetila tieto joka kuvaa voimajohdon tilaa. 
Ohjelma muodostaa annetuista tiedoista vierusmatriisin, jota käytetään
Sähköverkon datan luon itse. Aikavaativuus Dijkstran takia O((solmut + kaaret) * log (kaaret)) ja tilavaativuus O(solmut)^2

Valitsin aiheen koska olen työskennellyt sähköverkkojen parissa ja aihe sopii hyvin kurssille.
Ohjelmointikielenä on Java

lähteet:
Tietorakenteet ja algoritmit kirja (Tirakirja - Antti Laaksonen)

