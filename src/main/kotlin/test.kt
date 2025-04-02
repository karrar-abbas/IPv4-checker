fun main(){

    // region for correct IPs entered

    testCheckIpFunction(test = "Test 1  - should pass when Lan ip: 192.168.0.1", result = checkIp("192.168.0.1"), correctResult = true)
    testCheckIpFunction(test = "Test 2  - should pass when LocalHost ip: 127.0.0.1", result = checkIp("127.0.0.1"), correctResult = true)
    testCheckIpFunction(test = "Test 3  - should pass when DNS ip: 8.8.8.8", result = checkIp("8.8.8.8"), correctResult = true)
    testCheckIpFunction(test = "Test 4  - should pass when Normal ip: 37.238.221.40", result = checkIp("37.238.221.40"), correctResult = true)
    testCheckIpFunction(test = "Test 5  - should pass when private ip: 1.0.0.0", result = checkIp("1.0.0.0"), correctResult = true)
    testCheckIpFunction(test = "Test 6  - should pass when Broadcast ip: 255.255.255.255", result = checkIp("255.255.255.255"), correctResult = true)

    // endregion

    // region for incorrect IPs entered

    testCheckIpFunction(test = "Test 7  - should fail when three segments not four. ip: 192.0.100", result = checkIp("192.0.100"), correctResult = false)
    testCheckIpFunction(test = "Test 8  - should fail when have characters. ip: 192.168.0f.100", result = checkIp("192.168.0f.100"), correctResult = false)
    testCheckIpFunction(test = "Test 9  - should fail when first segment is above 255. ip: 280.168.0.1", result = checkIp("280.168.0.1"), correctResult = false)
    testCheckIpFunction(test = "Test 10 - should fail when Leading zeros with number. ip: 192.168.0.001", result = checkIp("192.168.0.001"), correctResult = false)
    testCheckIpFunction(test = "Test 11 - should fail when not use dots for segments. ip: 192.168.0,100", result = checkIp("192.168.0,100"), correctResult = false)
    testCheckIpFunction(test = "Test 12 - should fail when enter IPv6. ip: 2600:1400:d:5a3::3bd4", result = checkIp("2600:1400:d:5a3::3bd4"), correctResult = false)
    testCheckIpFunction(test = "Test 13 - should fail when negative number. ip: 37.238.-150.40", result = checkIp("37.238.-150.40"), correctResult = false)
    testCheckIpFunction(test = "Test 14 - should fail when more than four segments. ip: 22.180.0.70.120", result = checkIp("22.180.0.70.120"), correctResult = false)
    testCheckIpFunction(test = "Test 15 - should fail when leading zeros. ip: 75.100.230.000", result = checkIp("75.100.230.000"), correctResult = false)
    // endregion
}

fun testCheckIpFunction(test:String, result:Boolean, correctResult:Boolean){

    if (result == correctResult)
        println("Success - $test")
    else
        println("Failed - $test")
}