package de.fhg.ipa.ced.awx_jwt_authenticator.awx.model

import com.fasterxml.jackson.annotation.JsonTypeName

@JsonTypeName("SurveyItemType")
enum class SurveyItemType {
    text,
    password,
    integer,
    float,
    multiplechoice,
    multiselect
}
