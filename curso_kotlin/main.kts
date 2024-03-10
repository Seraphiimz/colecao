fun main(args: Array<String>) {
    var genericList = listOf("Alunos de PDM", 39, 3.56, 'a')
    var specificList = listOf<String>("Marcos", "Vamberto", "Raquel", "João Victor", "Gabriel")
    println("Imprimindo $genericList")
    println("Imprimindo $specificList")
}
