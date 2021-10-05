package rw.musabirema.cricketapp.model.database

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.io.Serializable
import java.sql.Timestamp

open class BaseEntity: Serializable {
    @CreatedDate
    var createdAt: Timestamp = Timestamp(System.currentTimeMillis())
    @LastModifiedDate
    var updateAt: Timestamp = Timestamp(System.currentTimeMillis())

}