
fun main(){
    namesOfgirls("hussein","mellany","sofia","esther")

    city()



}


fun namesOfgirls(name1:String,name2:String,name3:String,name4:String){
    var namesOfgirls= arrayOf(name1,name2,name3,name4)
    println(namesOfgirls.contentToString())



}

fun city() {
    var city= arrayOf("harare","mumbai","dodoma","jarkata")
    city.forEach() {city->
        println(city.capitalize())
    }
}
