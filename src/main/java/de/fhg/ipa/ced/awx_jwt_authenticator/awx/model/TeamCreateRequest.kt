package de.fhg.ipa.ced.awx_jwt_authenticator.awx.model

data class TeamCreateRequest(
        var name: String,
        var description: String="",
        var organization: Int=0,
)
