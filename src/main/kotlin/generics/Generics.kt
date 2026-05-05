package generics
fun main() {
    val stringList=listOf("hello world","bye bye","how is it going")
    val integers=listOf(1,2,3,4,5,6,7,8,9,10)
    val filterString=myfilter(stringList){it.contains("world")}
    println(filterString)
    val filterInt=myfilter(integers){it%2==0}
    println(filterInt)
}
fun<T> myfilter(list:List<T>,predicate:(T)->Boolean):List<T>{
    val result=mutableListOf<T>()
    for(element in list)
        if(predicate(element))
            result.add(element)
    return result.toList()
}