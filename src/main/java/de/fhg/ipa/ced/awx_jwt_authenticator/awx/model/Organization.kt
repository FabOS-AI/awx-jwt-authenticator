package de.fhg.ipa.ced.awx_jwt_authenticator.awx.model

import java.util.*

data class Organization(
        var id: Int,
        var type: String,
        var url: String,
        var related: Map<String, String>,
        var summary_fields: Map<String, Any>,
        var created: Date,
        var modified: Date,
        var name: String,
        var description: String,
        var max_hosts: Int,
        var custom_virtualenv: String? = null,
)
