package com.jigcoding.doodlekong.repository

import com.jigcoding.doodlekong.data.remote.responses.BasicApiResponse
import com.jigcoding.doodlekong.data.remote.ws.Room
import com.jigcoding.doodlekong.util.Resource

interface SetupRepository {

    suspend fun createRoom(room: Room): Resource<Unit>

    suspend fun getRooms(searchQuery: String): Resource<List<Room>>

    suspend fun joinRoom(username: String, roomName: String): Resource<Unit>
}