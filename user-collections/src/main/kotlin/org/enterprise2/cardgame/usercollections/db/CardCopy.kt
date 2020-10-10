package org.enterprise2.cardgame.usercollections.db

@Entity
class CardCopy (

    @get: Id @get:generatedvalue
    var id : Long?= null,

    @get: ManyToOne
    @get:NotNull
    var user : User? = null,

    @get:NotBlank
    var cardId: String? = null,

    @get:Min(0)
    var numberOfCopies : Int = 0

)
