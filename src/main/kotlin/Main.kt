fun main(args: Array<String>) {
    println("Hello World!")
    //Salary Tasks

    var baseSlary = 50000.0;
    var taxPercent = 0.2;

    if (baseSlary >= 30000){
        taxPercent = 0.5
    }
    var hours = 20
    var incentive = 700.0;

    if (hours >= 15 ) {
        incentive += 500
    }
    println("Salary_Details\n----------------")

    print("Your Salary After incenives and Taxaion is Equal: ${baseSlary-(baseSlary*taxPercent) + incentive} \n \n Target_Details :- \n \n  ")

    // Target task

    var RevenueOfMonths = 20000.0
    var targetPercent = 0.05
    var salesTargets = RevenueOfMonths

    for ( months in 1..12  ){
        println("Month "+ months + ": "+salesTargets.toInt())
        salesTargets = RevenueOfMonths + (RevenueOfMonths * targetPercent)
        RevenueOfMonths = salesTargets
    }
}