fun main(){

    // region for correct IPs entered

    testCheckIpFunction(test = "when check correct ip: 192.168.0.1", result = checkIp("192.168.0.1"), correctResult = true)
    testCheckIpFunction(test = "when check correct ip: 127.0.0.1", result = checkIp("127.0.0.1"), correctResult = true)
    testCheckIpFunction(test = "when check correct ip: 8.8.8.8", result = checkIp("8.8.8.8"), correctResult = true)
    testCheckIpFunction(test = "when check correct ip: 37.238.221.40", result = checkIp("37.238.221.40"), correctResult = true)
    testCheckIpFunction(test = "when check correct ip: 1.0.0.0", result = checkIp("1.0.0.0"), correctResult = true)
    testCheckIpFunction(test = "when check correct ip: 255.255.255.255", result = checkIp("255.255.255.255"), correctResult = true)

    // endregion

    // region for incorrect IPs entered

    testCheckIpFunction(test = "three segments not four. incorrect ip: 192.0.100", result = checkIp("192.0.100"), correctResult = false)
    testCheckIpFunction(test = "have characters. incorrect ip: 192.168.0f.100", result = checkIp("192.168.0f.100"), correctResult = false)
    testCheckIpFunction(test = "first segment is above 255. incorrect ip: 280.168.0.1", result = checkIp("280.168.0.1"), correctResult = false)
    testCheckIpFunction(test = "Leading zeros in forth segment. incorrect ip: 192.168.0.001", result = checkIp("192.168.0.001"), correctResult = false)
    testCheckIpFunction(test = "not use dots for segments. incorrect ip: 192.168.0,100", result = checkIp("192.168.0,100"), correctResult = false)
    testCheckIpFunction(test = "enter IPv6. incorrect ip: 2600:1400:d:5a3::3bd4", result = checkIp("2600:1400:d:5a3::3bd4"), correctResult = false)

    // endregion
}

fun testCheckIpFunction(test:String, result:Boolean, correctResult:Boolean){

    if (result == correctResult)
        println("Success - $test return $result")
    else
        println("Failed - $test return $result")
}