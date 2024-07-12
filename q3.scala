object StringFormatter {
  def toUpper(str: String): String = str.toUpperCase

  def toLower(str: String): String = str.toLowerCase

  def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    
    println(formatNames(names(0))(toUpper))                
    println(formatNames(names(1))(name => name.substring(0, 2).toUpperCase + name.substring(2))) 
    println(formatNames(names(2))(toLower))                
    println(formatNames(names(3))(name => name.substring(0, name.length - 1) + name.last.toUpper)) 
  }
}
