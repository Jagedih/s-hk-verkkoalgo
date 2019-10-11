# Suorituskykytestaus
Ohjelman syötedata koostuus kaaridasta. 40 000 solmun ja 100 0000 kaaren kohdalla ohjelma suoriutui syötedatan generoinnissa ja sen analysoinnissa noin neljässä sekunnissa.
100 000 solmun ja 300 000 kaaren kohdalla aikaa meni 22s. Ohjelman algoritminen vaativuus ei ole (12.10 mennessä kovin haastava), Syvyyshaussa käydään kaikki verkon kaaret läpi kertaallen.
Syvyyshaun aikavaativuus riippuu kaarien ja solmujen määrästä. Pahimmassa tapauksessa O(|solmut| + |kaaret|). Tilavaativuus on suoraan verrannollinnen kaarien eli voimajohtojen lukumäärään.






