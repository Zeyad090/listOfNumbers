import java.io.File

fun main(){
    var listOfNumbers= mutableListOf(1,2,3,4,5)

    println(listOfNumbers)
    listOfNumbers.add(index = 2, element = 12)
    println(listOfNumbers.getOrElse(index = 2){ index -> "this number is not exist"})

    var FilelistOfNumbers =File("data/input").readText().split("/n")
    println(FilelistOfNumbers)
    for (index in 9 until FilelistOfNumbers.size)
        println("$index _ ${FilelistOfNumbers[index]}")



}