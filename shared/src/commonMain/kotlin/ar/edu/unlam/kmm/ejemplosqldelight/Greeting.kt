package ar.edu.unlam.kmm.ejemplosqldelight

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}