fun main(){

    // region for correct IPs entered

    testCheckIpFunction(test = "Test 1  - when check correct ip: 192.168.0.1", result = checkIp("192.168.0.1"), correctResult = true)
    testCheckIpFunction(test = "Test 2  - when check correct ip: 127.0.0.1", result = checkIp("127.0.0.1"), correctResult = true)
    testCheckIpFunction(test = "Test 3  - when check correct ip: 8.8.8.8", result = checkIp("8.8.8.8"), correctResult = true)
    testCheckIpFunction(test = "Test 4  - when check correct ip: 37.238.221.40", result = checkIp("37.238.221.40"), correctResult = true)
    testCheckIpFunction(test = "Test 5  - when check correct ip: 1.0.0.0", result = checkIp("1.0.0.0"), correctResult = true)
    testCheckIpFunction(test = "Test 6  - when check correct ip: 255.255.255.255", result = checkIp("255.255.255.255"), correctResult = true)

    // endregion

    // region for incorrect IPs entered

    testCheckIpFunction(test = "Test 7  - three segments not four. incorrect ip: 192.0.100", result = checkIp("192.0.100"), correctResult = false)
    testCheckIpFunction(test = "Test 8  - have characters. incorrect ip: 192.168.0f.100", result = checkIp("192.168.0f.100"), correctResult = false)
    testCheckIpFunction(test = "Test 9  - first segment is above 255. incorrect ip: 280.168.0.1", result = checkIp("280.168.0.1"), correctResult = false)
    testCheckIpFunction(test = "Test 10 - Leading zeros with number. incorrect ip: 192.168.0.001", result = checkIp("192.168.0.001"), correctResult = false)
    testCheckIpFunction(test = "Test 11 - not use dots for segments. incorrect ip: 192.168.0,100", result = checkIp("192.168.0,100"), correctResult = false)
    testCheckIpFunction(test = "Test 12 - enter IPv6. incorrect ip: 2600:1400:d:5a3::3bd4", result = checkIp("2600:1400:d:5a3::3bd4"), correctResult = false)
    testCheckIpFunction(test = "Test 13 - negative number. incorrect ip: 37.238.-150.40", result = checkIp("37.238.-150.40"), correctResult = false)
    testCheckIpFunction(test = "Test 14 - more than four segments. incorrect ip: 22.180.0.70.120", result = checkIp("22.180.0.70.120"), correctResult = false)
    testCheckIpFunction(test = "Test 15 - leading zeros. incorrect ip: 75.100.230.000", result = checkIp("75.100.230.000"), correctResult = false)
    // endregion
}

fun testCheckIpFunction(test:String, result:Boolean, correctResult:Boolean){

    if (result == correctResult)
        println("Success - $test return $result")
    else
        println("Failed - $test return $result")
}