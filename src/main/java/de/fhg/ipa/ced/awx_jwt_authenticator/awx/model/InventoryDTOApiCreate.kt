package de.fhg.ipa.ced.awx_jwt_authenticator.awx.model

data class InventoryDTOApiCreate(
    var name: String,
    var organization: Int
) {
    var kind : String = ""
}
