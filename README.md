#cardManager

Card_Manager é uma biblioteca para manipulações básicas
sobre um baralho de cartas comum.
O seu deck é composto por 52 cartas.

Operações básicas são:
 - Ver baralho, consultar quantidade, embaralhar, 
 - Criar monte de descarte, mover cartas do início ao fim,
 - do fim ao início e cortar deck ao meio.
 
## Requisitos de sistema

* Maven: => [http://maven.apache.org/download.html]
  Testado com a versão 3.0.4
* JDK:  => [http://www.java.com/pt_BR/download/]
  1.5 ou superior; necessário para executar o Maven.
* Memória:
  Não há um mínimo estipulado.
* Disco:
  Cerca de 10MB de espaço necessários.
* Sistema Operacional:
  Windows XP ou superior, 
* Internet:
  Uma conexão com a internet será necessária.

## Instalação

1) Instalar o Maven conforme seu manual de instalação.

2) A pasta da biblioteca deve conter uma pasta dos fontes "cardmanager" e um arquivo pom.xml

3) Navegar pelo prompt de comando até o diretório com os arquivos.   

4) Executar o comando: 

	mvn clean install

Este comando compilará os arquivos .java do diretório com os fontes.

5) O resultado será uma biblioteca .jar, geralmente na pasta target;
   este arquivo poderá ser utilizada em qualquer projeto Java como qualquer 
   outra biblioteca.

## License information

CardManager Copyright (C) 2012-2012 Juliano R. and  Lucas C.

License: GNU General Public License, version 3 or later. 
See COPYING.txt included in this archive for details.