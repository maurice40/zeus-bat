package rw.musabirema.cricketapp.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import rw.musabirema.cricketapp.model.database.Player
import rw.musabirema.cricketapp.repository.PlayerRepository
import java.util.*

@Service
class PlayerService {

    @Autowired
    lateinit var playerRepository: PlayerRepository

    fun getAll(): List<Player> {
        return playerRepository.findAll()
    }

    fun registerNewPlayer(player: Player): Player{
        return playerRepository.save(player)
    }

    fun deletePlayer(id: UUID) {
        return playerRepository.deleteById(id)
    }

    fun getAPlayer(id: UUID): Player{
        return playerRepository.getById(id)
    }
}