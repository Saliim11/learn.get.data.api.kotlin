package com.saliim.learnrequestapikotlin

import com.saliim.learnrequestapikotlin.model.Team

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}
