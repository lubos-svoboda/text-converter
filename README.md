# Text-converter

### Setup
1. Start server
gradlew clean bootRun

2. Open browser
http://localhost:8080/rest/convert-text?inputText=Ahoj,%20jak%20se%20m%C3%A1%C5%A1?

### Description
Napište program, který bude vystavovat REST službu, která na vstupu bude přijímat text. Služba text transformuje a vrátí zpět.
Transformaci provede tak, že textu otočí pořadí písmen (tedy přečte ho odzadu) s tím, že:
na pozici, kde se původně vyskytovala písmena a,e,i,o,u budou nově písmena uppercase, všechna ostatní písmena budou lowercase.
Dvě a více mezer spojí do jedné mezery

Např:
Ahoj, jak se máš?
?šÁm es kaj ,jOha

Je     mi   fajn.
.NjaF iM ej

Úloha by měla být na max 1 hodinu. Úloha by měla umět zpracovat češtinu.


