
fun main() {

}

fun checkIp(ip:String): Boolean {
        val ipSegments = ip.split(".")

        return ipSegments.size ==4
                && ipSegments
                    .all{
                        it.all{ it.isDigit() }
                         && it.toInt() in 0..255
                         && !(it.length >1 && it.startsWith("0"))
                    }
}



