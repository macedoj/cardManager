------  Card_Manager_API  ------	

Card_Manager é uma biblioteca para manipulações básicas
sobre um baralho de cartas comum.
O seu deck é composto por 52 cartas.

Operações básicas são:
 - Ver baralho, consultar quantidade, embaralhar, 
 - Criar monte de descarte, mover cartas do início ao fim,
 - do fim ao início e cortar deck ao meio.

Para compilar baixe a última versão do Maven em 
http://maven.apache.org/download.html

Requisitos de Sistema
---------------------
Maven:
  Testado com a versão 3.0.4
JDK:
  1.5 ou superior; necessário para executar o Maven.
Memória:
  Não há um mínimo estipulado.
Disco:
  Não há um mínimo estipulado.
Sistema Operacional:
  Windows XP ou superior, 
Internet:
  Uma conexão com a internet será necessária.


Composição da Biblioteca
------------------------

  A biblioteca é composta dos seguintes arquivos .java:
  - Baralho_Cartas.java
  - Carta.java

  O arquivo Main_Jogo.java é uma classe que faz uso das funcionalidades
  da biblioteca. E não deve ser compilado com a biblioteca.


Compilando a Biblioteca
-----------------------

1) Instalar o Maven conforme seu manual de instalação.

2) A pasta da biblioteca deve conter uma pasta dos fontes "cardmanager" e um arquivo pom.xml

3) Navegar pelo prompt de comando até o diretório com os arquivos.   

4) Executar o comando: mvn clean install
   Este comando compilará os arquivos .java do diretório com os fontes.

5) O resultado será uma biblioteca .jar, geralmente na pasta target;
   este arquivo poderá ser utilizada em qualquer projeto Java como qualquer 
   outra biblioteca.