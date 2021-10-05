package rw.musabirema.cricketapp.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import rw.musabirema.cricketapp.model.database.Player
import rw.musabirema.cricketapp.service.PlayerService
import java.util.*

@RestController
@RequestMapping("/api/players")
class PlayerController {

    @Autowired
    lateinit var playerService: PlayerService

    @GetMapping
    fun getAllPlayers(): List<Player>{
        return playerService.getAll()
    }

    @GetMapping("/{id}")
    fun getAPlayer(id: UUID, @PathVariable player: Player): Player{
        return playerService.getAPlayer(id)
    }

    @PostMapping
    fun addNewPlayer(@RequestBody player: Player): Player{
        return playerService.registerNewPlayer(player)
    }

    @DeleteMapping("/{id}")
    fun deletePlayer(id: UUID){
        playerService.deletePlayer(id)
    }
}