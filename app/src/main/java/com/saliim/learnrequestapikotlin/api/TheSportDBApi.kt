package com.saliim.learnrequestapikotlin.api

import android.net.Uri
import com.saliim.learnrequestapikotlin.BuildConfig

//object TheSportDBApi {
//    fun getTeams(league: String?): String{
////------------------------------------------
//        return BuildConfig.BASE_URL + "api/v1/json/${BuildConfig.TSDB_API_KEY}" +
//                "/search_all_teams.php?l=" + league
////------------------------------------------
//
//    }
//}

object TheSportDBApi {

    fun getTeams(league: String?): String {
        return Uri.parse(BuildConfig.BASE_URL).buildUpon()
            .appendPath("api")
            .appendPath("v1")
            .appendPath("json")
            .appendPath(BuildConfig.TSDB_API_KEY)
            .appendPath("search_all_teams.php")
            .appendQueryParameter("l", league)
            .build()
            .toString()
    }
}
