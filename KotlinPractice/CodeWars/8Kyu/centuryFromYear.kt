/*Introduction

The first century spans from the year 1 up to and including the year 100, 
The second - from the year 101 up to and including the year 200, etc.
Task :

Given a year, return the century it is in.
Input , Output Examples ::

centuryFromYear(1705)  returns (18)
centuryFromYear(1900)  returns (19)
centuryFromYear(1601)  returns (17)
centuryFromYear(2000)  returns (20)
*/

fun main(args: Array<String>) {
    century(1705)
    century(1900)
    century(1601)
    century(2000)
}

fun century(year: Int): Int
{
    var remainder = year%100
    var yearCount = year/100
    val century: Int
    if(remainder ==0)
    {
        century = yearCount
    }
    else
    {
        century = yearCount +1
    }
    println("century: ${century}")
    return century
}
