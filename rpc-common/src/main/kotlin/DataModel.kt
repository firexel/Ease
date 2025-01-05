package org.seraph.ease.common

import kotlinx.serialization.Serializable

@Serializable
data class Catalog(
    val updateTime: Long,
    val components: List<Component>
)

@Serializable
data class Component(
    val id: String,
    val receivingEndpoints: List<Endpoint>,
    val transmittingEndpoints: List<Endpoint>
)

@Serializable
data class Endpoint(
    val id: String,
    val defaultType: Type,
    val defaultUnits: Units,
    val retainable: Boolean = true
)

@Serializable
enum class Type {
    STRING, INT, FLOAT, BOOLEAN, SERIALIZED
}

@Serializable
enum class Units {
    NO,
    CELSIUS,
    PPM,
    PPB,
    PERCENTS_0_1,
    LX,
    ON_OFF,
    W, // watts
    KWH, // kWh
    V, // volts,
    A, // amperes,
    MBAR // millibars
}