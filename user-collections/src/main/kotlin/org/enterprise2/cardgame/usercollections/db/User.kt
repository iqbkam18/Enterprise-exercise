package org.enterprise2.cardgame.usercollections.db

class User (

    @Entity
    @get:NotBlank
    var userId: String? = null,

    @get:Min(0)
    var coins: Int = 0,

    @get:Min(0)
    var cardPacks: Int = 0,

    @get:OneTomany(mappedBy = "user", cascade = [(CascadeType.ALL)])
    var ownedcards : MutableList<CardCopy> = mutableListOf()
)
