
fun main(){
    namesOfstudents("jane","lucy","janet","laurence")
    city()
}
fun namesOfstudents(a:String,b:String,c:String,d:String){
    var namesOfstudents= arrayOf(a,b,c,d)
    println(namesOfstudents.contentToString())

}


fun city() {
    var city= arrayOf("nairobi","mombasa","kisumu","london")
    city.forEach() {city->
        println(city.capitalize())
    }
}
