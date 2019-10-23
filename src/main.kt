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

    print("\n:: Bienvenido a Recipe Maker ::\n")
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

fun processOptionMenuMain(): Int{
    print("Ingrese una opcion del menu: ")
    val option: Int = optionSelectedUser()
    when(option){
        1 -> println("Opcion 1")
        2 -> println("Opcion 2")
    }
    return option
}

fun main(){
    do{
        showMenuMain()
        val option: Int = processOptionMenuMain()
    }while(option != 3)
}