# Testausdokumentti
Ohjelmaa on testattu JUnitilla.

* Syötedatan testaus
Syötedatan verkon yhtenäisyys on testattu ja lisäksi se, että verkon kaaridatassa ei ole tyhjiä rivejä.

* Syvyyshaun testaus
Syvyyshaku on testattu luomalla testiverkkoja, yhtenäisiä ja epäyhtenäisiä. Testiverkkojen odotusarvoa on verrattu Syvyyshaun tulokseen.

* Verkon testaus
Verkon rakentaminen syötedatalla on testattu rakentamalla testiverkko ja tutkimalla löytyykö verkosta
syötedatassa annetut verkot tai sähköasemia joita ei ole lisätty.

* Solmun testaus
Solmun asserEquals metodi testattu ja samalla hajautuskoodin toimivuus.

* Pinon testaus
Pinosta on testattu metodit alkioiden lisäykselle, poistolle ja pinon koon laskenta. Pinosta poistuu oikea (päällimmäinen) alkio ja lisäksi pino pitää oikeaa kirjaa alkioiden määrästä pinossa.

* Hajautustaulun testaus
Hajautustaulutestin perusteella hajautustaulu tallentaa alkiot oikein tauluun ja palauttaa avainta vastaavat arvot oikein.

![kuva](https://github.com/Jagedih/sahkoverkkoalgo/blob/master/dokumentit/testit.png)
