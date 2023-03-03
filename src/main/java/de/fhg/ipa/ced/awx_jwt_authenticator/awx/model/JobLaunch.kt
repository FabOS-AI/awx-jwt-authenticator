package de.fhg.ipa.ced.awx_jwt_authenticator.awx.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class JobLaunch(

        var job: Int,

        var ignored_fields: Map<String, Any>? = null,
)
