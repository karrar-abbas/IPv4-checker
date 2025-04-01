fun main(){
    // region for correct IPs entered
    testCheckIpFunction(
        test = "when check correct ip: 192.168.0.1 return",
        result = checkIp("192.168.0.1"),
        correctResult = true
    )
    testCheckIpFunction(
        test = "when check correct ip: 127.0.0.1 return",
        result = checkIp("127.0.0.1"),
        correctResult = true
    )
    testCheckIpFunction(
        test = "when check correct ip: 8.8.8.8 return",
        result = checkIp("8.8.8.8"),
        correctResult = true
    )
    testCheckIpFunction(
        test = "when check correct ip: 37.238.221.40 return",
        result = checkIp("37.238.221.40"),
        correctResult = true
    )
    testCheckIpFunction(
        test = "when check correct ip: 1.0.0.0 return",
        result = checkIp("1.0.0.0"),
        correctResult = true
    )
    testCheckIpFunction(
        test = "when check correct ip: 255.255.255.255 return",
        result = checkIp("255.255.255.255"),
        correctResult = true
    )


    // endregion

    // region for incorrect IPs entered

    // three segments not four
    testCheckIpFunction(
        test = "when check incorrect ip: 192.0.100 return",
        result = checkIp("192.0.100"),
        correctResult = false
    )
    // have characters
    testCheckIpFunction(
        test = "when check incorrect ip: 192.168.0f.100 return",
        result = checkIp("192.168.0f.100"),
        correctResult = false
    )

    // first segment is above 255
    testCheckIpFunction(
        test = "when check incorrect ip: 280.168.0.1 return",
        result = checkIp("280.168.0.1"),
        correctResult = false
    )
    // Leading zeros in forth segment
    testCheckIpFunction(
        test = "when check incorrect ip: 192.168.0.001 return",
        result = checkIp("192.168.0.001"),
        correctResult = false
    )
    // not use dots for segments
    testCheckIpFunction(
        test = "when check incorrect ip: 192.168.0,100 return",
        result = checkIp("192.168.0,100"),
        correctResult = false
    )
    // enter IPv6
    testCheckIpFunction(
        test = "when check incorrect ip: 2600:1400:d:5a3::3bd4 return",
        result = checkIp("2600:1400:d:5a3::3bd4"),
        correctResult = false
    )

    // endregion
}

fun testCheckIpFunction(test:String, result:Boolean, correctResult:Boolean){
    // variables red,green are have cmd colors values for text formating
    val red = "\u001B[31m"
    val green = "\u001B[32m"
    // to rest cmd color to default color
    val reset = "\u001B[0m"

    if (result == correctResult)
        println("$green Success - $test $result $reset")
    else
        println("$red Failed - $test $result $reset")
}