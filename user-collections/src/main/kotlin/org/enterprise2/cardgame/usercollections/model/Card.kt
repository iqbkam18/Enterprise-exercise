package org.enterprise2.cardgame.usercollections.model

import org.enterprise2.cardgame.dto.Rarity
import org.enterprise2.cardgame.dto.CardDto


data class Card(
    val cardId : String,
    val rarity: Rarity
){

    constructor(dto: CardDto): this(
        dto.cardId ?: throw IllegalArgumentException("Null cardId"),
        dto.rarity ?: throw IllegalArgumentException("Null rarity"))
}