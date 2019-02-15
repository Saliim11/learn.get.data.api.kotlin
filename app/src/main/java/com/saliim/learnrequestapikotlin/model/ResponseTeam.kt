package com.saliim.learnrequestapikotlin.model

import com.google.gson.annotations.SerializedName

//class ResponseTeam {
//
//    @SerializedName("teams")
//    var teams: List<Team>? = null
//
//}
data class ResponseTeam(
    val teams: List<Team>)