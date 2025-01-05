package org.seraph.ease.common

import kotlinx.coroutines.flow.Flow
import kotlinx.rpc.RemoteService
import kotlinx.rpc.annotations.Rpc
import kotlinx.serialization.Serializable

@Rpc
interface HubService : RemoteService {
    suspend fun updateCatalog(catalog: Catalog)
    suspend fun pushUpdates(flow: Flow<PushedUpdate>)
    suspend fun pullUpdates(): Flow<PulledUpdate>
}

@Serializable
data class PushedUpdate(
    val endpointUrl: String,
    val value: String,
    val type: Type?
)

@Serializable
data class PulledUpdate(
    val endpointUrl: String,
    val value: String
)