package rw.musabirema.cricketapp.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import rw.musabirema.cricketapp.model.database.Player
import java.util.*

@Repository
interface PlayerRepository: JpaRepository<Player, UUID> {
}