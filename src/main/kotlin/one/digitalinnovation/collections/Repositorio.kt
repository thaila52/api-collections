package one.digitalinnovation.collections

class Repositorio <W>{
    private val map = mutableMapOf<String, W>()

    fun created (id: String, value: W) {
        map[id] = value
    }
    fun remove(id: String) = map.remove(id)

    fun findById(id: String) =map[id]

    fun findAll() = map.values

}