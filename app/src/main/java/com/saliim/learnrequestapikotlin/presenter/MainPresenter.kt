package com.saliim.learnrequestapikotlin.presenter

import com.google.gson.Gson
import com.saliim.learnrequestapikotlin.MainView
import com.saliim.learnrequestapikotlin.api.ApiRepository
import com.saliim.learnrequestapikotlin.api.TheSportDBApi
import com.saliim.learnrequestapikotlin.model.ResponseTeam
import com.saliim.learnrequestapikotlin.view.MainActivity
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MainPresenter(private val view: MainView,
                    private val apiRepository: ApiRepository,
                    private val gson: Gson) {

    fun getTeamList(league: String?) {
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository
                .doRequest(TheSportDBApi.getTeams(league)),
                ResponseTeam::class.java
            )

            uiThread {
                view.hideLoading()
                view.showTeamList(data.teams)
            }
        }
    }

}

