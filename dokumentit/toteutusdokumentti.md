# Toteutusdokumentti
Ohjelma rakentaa ensin syötedatan projektille. Syötedata koostuus verkon kaaridatasta muodossa "x-y:z", missä x ja y kuvaa voimajohdon päissä olevia sähköasemia ja z 
voimajohdon jännitetilaa. Ohjelma rakentaa ensin yhtenäisen verkon laittamalla solmumäärän verran solmuja satunnaiseen järjestykseen, liittää ne toisiinsa yksitellen
arpomalla näiden kahden aseman välille jännitteen. Yhtenäisen verkon kaaridatan jälkeen ohjelma luo lisää kaaridataa satunnaisesti kahden solmun välille ja lisää ne kaaridatalistalle.

Syötedatasta ohjelma lukee kaaridatat ja luo verkon käyttämällä luokkia Sahkoasema ja Verkko. Verkossa on hajautustaulu josta löytyy sähköasemat ja sähköasemilla on Hajautustaulut,
jossa avaimena on viereisen sähköaseman nimi ja arvona kyseiselle sähköasemalle vievän voimajohdon jännitetila.

Verkon rakentamisen jälkeen ohjelma hakee Syvyyshakuluokalla sähköverkon yhtenäiset osat, eli ne verkon osat jossa jokaisen sähköaseman välillä on jännitteellinen voimajohto.
Syvyyshaku on toteutettu perinteisesti käyttämällä Pinoa ja pitämällä kirjaa vierailluista sähköasemista. Kun verkon yhtenäiset osat on löydetty, ohjelma etsii pienimmän määrän solmuja,
joiden korjaaminen muuttaa verkon yhtenäiseksi. 




