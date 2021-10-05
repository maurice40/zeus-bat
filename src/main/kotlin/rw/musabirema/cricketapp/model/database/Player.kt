package rw.musabirema.cricketapp.model.database

import lombok.Data
import lombok.NoArgsConstructor
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity

@Data
@NoArgsConstructor
@Entity
data class Player(
    var firstName: String,
    var lastName: String,
    var birthDate: Date,
    var nationality: String?,
    var country: String?,
    var province: String?,
    var district: String?,
    var sector: String?,
    var cell: String?,
    var levelOfEducation: String?,
    var background: String?,
    var playerType: String?,
    var length: Double?,
    var weight: Double?
): BaseEntity() {
    @javax.persistence.Id
    @Column(name = "id", nullable = false)
    open var id: UUID = UUID.randomUUID()
}