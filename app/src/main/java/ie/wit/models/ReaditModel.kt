package ie.wit.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ReaditModel(var id: Long = 0, var book_name01: String = "", var author01: String = "", var genre01: String = "", var year_released01: String = "", var summary01: String = "" ): Parcelable