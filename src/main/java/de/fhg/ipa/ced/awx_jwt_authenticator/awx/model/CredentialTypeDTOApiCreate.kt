package de.fhg.ipa.ced.awx_jwt_authenticator.awx.model

data class CredentialTypeDTOApiCreate(
    val name: String,
    val description: String,
    val kind: String,
    val inputs: Map<String, List<CredentialTypeInputFieldItem>>,
    val injectors: Map<String, Map<String, String>>
)
