fun main(args: Array<String>) {

    var options = listOf("Hacer una receta","Ver mis recetas","Salir")

    val menu = """
:: Bienvenido a Recipe Maker ::
Selecciona la opción deseada.""".trimMargin()

    println(menu)
    for((index,option) in options.withIndex()){
        println("${index.inc()}. $option")
    }
    var getOptions = true
    do{
        println("Escriba aquí: ")
        val response:String? = readLine()
        if (response.equals("1")){
            println(options[0])
            getOptions = false
        }else if (response.equals("2")){
            println(options[1])
            getOptions = false
        }else if (response.equals("3")){
            println("Adios!!")
            getOptions = false
        }
    }while(getOptions)

}