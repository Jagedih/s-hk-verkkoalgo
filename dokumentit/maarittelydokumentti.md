# Määrittelydokumentti
Sähköverkot ovat yhtenäisiä verkkoja normaalissa käyttötilanteessa, verkkohäiriön aikana sähköverkkoon voi muodostua 
saarekkeita eli toisistaan eriytyneitä sähköverkon osasia. Laboratoriotyön tarkoituksena on tehdä ohjelma, joka tutkii 
sähköverkon yhtenäiset osat syvyyshaulla. Tämän jälkeen ohjelma etsii lyhimmän reitin isoimmasta verkosta pienempään/pienempiin
verkkoihin käyttäen omaa algoritmia. 

Syötteenä ohjelma saa listan verkon kaarista. Kaaridatassa ilmoitetaan kahden solmun nimi, jotka kuvaavat sähköasemia ja lisäksi tähän tietoon on liitetty voimajohdon jännitetila näiden kahden solmun välillä.
Ohjelma muodostaa kaaridasta verkon, jota se tutkii Dijkstran algoritmilla hakemalla kahden satunnaisen solmun etäisyydet. Lisäksi ohjelma tulostaa kaikki verkon yhtenäiset osat.
Sähköverkon datan luon itse. Aikavaativuus Dijkstran takia O((solmut + kaaret) * log (kaaret)) ja tilavaativuus O(solmut)^2

Valitsin aiheen koska olen työskennellyt sähköverkkojen parissa ja aihe sopii hyvin kurssille.
Ohjelmointikielenä on Java

lähteet:
Tietorakenteet ja algoritmit kirja (Tirakirja - Antti Laaksonen)
