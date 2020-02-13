package ie.wit.models

interface ReaditStore {
    fun findAll(): List<ReaditModel>
    fun findById(id:Long):ReaditModel?
    fun create(ReaditApp:ReaditModel)
}