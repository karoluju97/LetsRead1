package ie.wit.models

import android.util.Log

var lastId = 0L

internal fun getId(): Long {
    return lastId++
}

 class ReadItMemStore: ReaditStore {
    val readit04 = ArrayList<ReaditModel>()

    override fun findAll():List<ReaditModel>{
        return readit04
    }

     override fun findById(id:Long): ReaditModel? {
         val foundReadit: ReaditModel? = readit04.find {it.id == id}
         return foundReadit
     }

     override fun create(readit05: ReaditModel){
         readit05.id = getId()
         readit04.add(readit05)
         logAll()
     }

     fun logAll(){
         Log.v("Post","**Posting List**")
         readit04.forEach { Log.v("Post","${it}") }
     }
}