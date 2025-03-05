📄 Descripció
Aquest exercici té com a objectiu crear una classe anomenada "Entrada" que permeti llegir diferents tipus de dades des del teclat mitjançant la classe Scanner de Java. La classe ha de tractar les excepcions que poden sorgir a l’hora d’introduir dades, com ara format incorrecte. Si es produeix una excepció, el sistema ha de continuar demanant la dada fins que sigui introduïda correctament.

Els mètodes han de rebre un missatge per mostrar a l'usuari/ària i retornar el valor introduït pel mateix.

💻 Tecnologies Utilitzades
Java: Llenguatge de programació per a la creació de la classe i gestió d'excepcions.
Scanner: Llibreria utilitzada per llegir dades des del teclat.
Excepcions: Gestió d'excepcions mitjançant les classes InputMismatchException i una excepció personalitzada.
📋 Requisits
Per executar aquest projecte, cal tenir instal·lat el següent:

Java 8 o superior: És imprescindible per a utilitzar la classe Scanner i gestionar les excepcions.
Eines de desenvolupament: Un entorn de desenvolupament integrat (IDE) com IntelliJ IDEA, Eclipse o NetBeans.
Implementació dels mètodes:
Mètodes per llegir dades amb Scanner:

public static byte llegirByte(String missatge): Llegeix un valor de tipus byte.
public static int llegirInt(String missatge): Llegeix un valor de tipus int.
public static float llegirFloat(String missatge): Llegeix un valor de tipus float.
public static double llegirDouble(String missatge): Llegeix un valor de tipus double.
Mètodes per llegir dades personalitzades:

public static char llegirChar(String missatge): Llegeix un caràcter.
public static String llegirString(String missatge): Llegeix una cadena de text.
public static boolean llegirSiNo(String missatge): Llegeix un valor boolean. Si l'usuari introdueix "s", retorna true. Si l'usuari introdueix "n", retorna false.
Els mètodes han de capturar excepcions InputMismatchException per garantir que la dada es llegeix correctament. En el cas de les dades personalitzades, s'ha de capturar una excepció general Exception.

