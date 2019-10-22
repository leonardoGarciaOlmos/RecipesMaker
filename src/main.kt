import java.lang.NumberFormatException

fun showOptionsMenu(listOptionsMenu: ArrayList<String>){
    for (indexOption: Int in listOptionsMenu.indices)
        println("${indexOption.plus(1)}. ${listOptionsMenu[indexOption]}")
}

fun showMenuMain(){
    val listOptionsMenuMain: MutableList<String> = ArrayList()
    listOptionsMenuMain.add("Hacer receta")
    listOptionsMenuMain.add("Ver mis recetas")
    listOptionsMenuMain.add("Salir")

    print(":: Bienvenido a Recipe Maker ::\n")
    println("Selecciona la opción deseada")
    showOptionsMenu(listOptionsMenuMain as ArrayList<String>)
}

fun optionSelectedUser(): Int{
    val optionSelected: Int = try {
        readLine()?.toInt() as Int
    }catch (_:NumberFormatException){
        0
    }
    return optionSelected
}

fun processOptionMenuMain(){
    do {
        print("Ingrese una opcion del menu: ")
        when(optionSelectedUser()){
            1 -> println("Opcion 1")
            2 -> println("Opcion 2")
            3 -> return
        }
    }while(true)
}

fun main(){
    showMenuMain()
    processOptionMenuMain()
}