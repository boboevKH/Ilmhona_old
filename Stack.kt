
fun main(){

}

class Stack {
   private val stackList = mutableListOf<String>()

    /*
            public
     */

    fun isEmpty(): Boolean = stackList.size == 0
    fun isNotEmpty(): Boolean = stackList.size != 0

    fun count(): Int = stackList.size

    fun push(element: String) {
        stackList.add(element)
    }

    fun pop(): String {
        val index = stackList.size - 1
        val elementRemove = stackList[index]
        stackList.removeAt(index)
        return elementRemove
    }

    fun top(): String {
       return stackList[stackList.size-1]
    }
}