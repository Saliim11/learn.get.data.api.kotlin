package com.saliim.learnrequestapikotlin.model

import com.google.gson.annotations.SerializedName

data class Team (

//    @SerializedName("intStadiumCapacity")
//    var intStadiumCapacity: String? = null
//
//    @SerializedName("strTeamShort")
//    var strTeamShort: Any? = null
//
//    @SerializedName("strSport")
//    var strSport: String? = null
//
//    @SerializedName("strDescriptionCN")
//    var strDescriptionCN: Any? = null
//
//    @SerializedName("strTeamJersey")
//    var strTeamJersey: String? = null
//
//    @SerializedName("strTeamFanart2")
//    var strTeamFanart2: String? = null
//
//    @SerializedName("strTeamFanart3")
//    var strTeamFanart3: String? = null
//
//    @SerializedName("strTeamFanart4")
//    var strTeamFanart4: String? = null
//
//    @SerializedName("strStadiumDescription")
//    var strStadiumDescription: String? = null
//
//    @SerializedName("strTeamFanart1")
//    var strTeamFanart1: String? = null
//
//    @SerializedName("intLoved")
//    var intLoved: Any? = null
//
//    @SerializedName("idLeague")
//    var idLeague: String? = null
//
//    @SerializedName("idSoccerXML")
//    var idSoccerXML: String? = null
//
//    @SerializedName("strTeamLogo")
//    var strTeamLogo: String? = null
//
//    @SerializedName("strDescriptionSE")
//    var strDescriptionSE: Any? = null
//
//    @SerializedName("strDescriptionJP")
//    var strDescriptionJP: Any? = null
//
//    @SerializedName("strDescriptionFR")
//    var strDescriptionFR: Any? = null
//
//    @SerializedName("strStadiumLocation")
//    var strStadiumLocation: String? = null
//
//    @SerializedName("strDescriptionNL")
//    var strDescriptionNL: Any? = null
//
//    @SerializedName("strCountry")
//    var strCountry: String? = null
//
//    @SerializedName("strRSS")
//    var strRSS: String? = null
//
//    @SerializedName("strDescriptionRU")
//    var strDescriptionRU: Any? = null
//
//    @SerializedName("strTeamBanner")
//    var strTeamBanner: String? = null
//
//    @SerializedName("strDescriptionNO")
//    var strDescriptionNO: Any? = null
//
//    @SerializedName("strStadiumThumb")
//    var strStadiumThumb: String? = null
//
//    @SerializedName("strDescriptionES")
//    var strDescriptionES: Any? = null
//
//    @SerializedName("intFormedYear")
//    var intFormedYear: String? = null
//
//    @SerializedName("strInstagram")
//    var strInstagram: String? = null
//
//    @SerializedName("strDescriptionIT")
//    var strDescriptionIT: Any? = null

    @SerializedName("idTeam")
    var idTeam: String? = null,

//    @SerializedName("strDescriptionEN")
//    var strDescriptionEN: String? = null
//
//    @SerializedName("strWebsite")
//    var strWebsite: String? = null
//
//    @SerializedName("strYoutube")
//    var strYoutube: String? = null
//
//    @SerializedName("strDescriptionIL")
//    var strDescriptionIL: Any? = null
//
//    @SerializedName("strLocked")
//    var strLocked: String? = null
//
//    @SerializedName("strAlternate")
//    var strAlternate: String? = null

    @SerializedName("strTeam")
    var strTeam: String? = null,

//    @SerializedName("strTwitter")
//    var strTwitter: String? = null
//
//    @SerializedName("strDescriptionHU")
//    var strDescriptionHU: Any? = null
//
//    @SerializedName("strGender")
//    var strGender: String? = null
//
//    @SerializedName("strDivision")
//    var strDivision: Any? = null
//
//    @SerializedName("strStadium")
//    var strStadium: String? = null
//
//    @SerializedName("strFacebook")
//    var strFacebook: String? = null

    @SerializedName("strTeamBadge")
    var strTeamBadge: String? = null
//
//    @SerializedName("strDescriptionPT")
//    var strDescriptionPT: Any? = null
//
//    @SerializedName("strDescriptionDE")
//    var strDescriptionDE: String? = null
//
//    @SerializedName("strLeague")
//    var strLeague: String? = null
//
//    @SerializedName("strManager")
//    var strManager: String? = null
//
//    @SerializedName("strKeywords")
//    var strKeywords: String? = null
//
//    @SerializedName("strDescriptionPL")
//    var strDescriptionPL: Any? = null

//    override fun toString(): String {
//        return "Team{" +
//                "intStadiumCapacity = '" + intStadiumCapacity + '\''.toString() +
//                ",strTeamShort = '" + strTeamShort + '\''.toString() +
//                ",strSport = '" + strSport + '\''.toString() +
//                ",strDescriptionCN = '" + strDescriptionCN + '\''.toString() +
//                ",strTeamJersey = '" + strTeamJersey + '\''.toString() +
//                ",strTeamFanart2 = '" + strTeamFanart2 + '\''.toString() +
//                ",strTeamFanart3 = '" + strTeamFanart3 + '\''.toString() +
//                ",strTeamFanart4 = '" + strTeamFanart4 + '\''.toString() +
//                ",strStadiumDescription = '" + strStadiumDescription + '\''.toString() +
//                ",strTeamFanart1 = '" + strTeamFanart1 + '\''.toString() +
//                ",intLoved = '" + intLoved + '\''.toString() +
//                ",idLeague = '" + idLeague + '\''.toString() +
//                ",idSoccerXML = '" + idSoccerXML + '\''.toString() +
//                ",strTeamLogo = '" + strTeamLogo + '\''.toString() +
//                ",strDescriptionSE = '" + strDescriptionSE + '\''.toString() +
//                ",strDescriptionJP = '" + strDescriptionJP + '\''.toString() +
//                ",strDescriptionFR = '" + strDescriptionFR + '\''.toString() +
//                ",strStadiumLocation = '" + strStadiumLocation + '\''.toString() +
//                ",strDescriptionNL = '" + strDescriptionNL + '\''.toString() +
//                ",strCountry = '" + strCountry + '\''.toString() +
//                ",strRSS = '" + strRSS + '\''.toString() +
//                ",strDescriptionRU = '" + strDescriptionRU + '\''.toString() +
//                ",strTeamBanner = '" + strTeamBanner + '\''.toString() +
//                ",strDescriptionNO = '" + strDescriptionNO + '\''.toString() +
//                ",strStadiumThumb = '" + strStadiumThumb + '\''.toString() +
//                ",strDescriptionES = '" + strDescriptionES + '\''.toString() +
//                ",intFormedYear = '" + intFormedYear + '\''.toString() +
//                ",strInstagram = '" + strInstagram + '\''.toString() +
//                ",strDescriptionIT = '" + strDescriptionIT + '\''.toString() +
//                ",idTeam = '" + idTeam + '\''.toString() +
//                ",strDescriptionEN = '" + strDescriptionEN + '\''.toString() +
//                ",strWebsite = '" + strWebsite + '\''.toString() +
//                ",strYoutube = '" + strYoutube + '\''.toString() +
//                ",strDescriptionIL = '" + strDescriptionIL + '\''.toString() +
//                ",strLocked = '" + strLocked + '\''.toString() +
//                ",strAlternate = '" + strAlternate + '\''.toString() +
//                ",strTeam = '" + strTeam + '\''.toString() +
//                ",strTwitter = '" + strTwitter + '\''.toString() +
//                ",strDescriptionHU = '" + strDescriptionHU + '\''.toString() +
//                ",strGender = '" + strGender + '\''.toString() +
//                ",strDivision = '" + strDivision + '\''.toString() +
//                ",strStadium = '" + strStadium + '\''.toString() +
//                ",strFacebook = '" + strFacebook + '\''.toString() +
//                ",strTeamBadge = '" + strTeamBadge + '\''.toString() +
//                ",strDescriptionPT = '" + strDescriptionPT + '\''.toString() +
//                ",strDescriptionDE = '" + strDescriptionDE + '\''.toString() +
//                ",strLeague = '" + strLeague + '\''.toString() +
//                ",strManager = '" + strManager + '\''.toString() +
//                ",strKeywords = '" + strKeywords + '\''.toString() +
//                ",strDescriptionPL = '" + strDescriptionPL + '\''.toString() +
//                "}"
//    }
)