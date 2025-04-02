
fun main() {

}

fun checkIp(ip:String): Boolean {
        val ipSegments = ip.split(".")

        return ipSegments.size ==4
                && ipSegments
                    .all{segment ->
                        segment.all{item -> item.isDigit() }
                         && segment.toInt() in 0..255
                         && !(segment.length >1 && segment.startsWith("0"))
                    }
}




