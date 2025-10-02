package cs473.edu.miu.when_exp

fun main(){
    val daysofweek =3
    when(daysofweek){
        1->println("Monday")
        2->println("Tueday")
        3->println("Wednesday")
        4->println("Thursday")
        5->println("Friday")
        6->println("Saturday")
        7->println("Sunday")
        else->println("Invalid Day")
    }
    val day = "Monday"
    when(day){
        "Monday" -> println("Today is Monday")
        "Tuesday" -> println("Today is Tuesday")
        "Wednesday" -> println("Today is Wednesday")
        "Thursday" -> println("Today is Thursday")
        "Friday" -> println("Today is Friday")
        "Saturday" -> println("Today is Saturday")
        "Sun" -> println("Today is Sun")
    }

    // another way of using when expression

    var name = "Zayed"
    when{
        name=="Zayed"->println("Hi Zayed How Are You ?")
        name =="Sam"->println("Hi Sam")
        else ->println("Hi There Unknown")
    }


}