package org.enterprise2.cardgame.usercollections.model

import org.enterprise2.cardgame.dto.CollectionDto
import org.enterprise2.cardgame.dto.Rarity
import java.lang.Math.abs

data class Collection (

    val cards : List<Card>,

    val prices: Map<Rarity, Int>,

    val millValues: Map<Rarity, Int>,

    val rarityProbabilities: Map<Rarity, Double>
) {

    constructor(dto: CollectionDto) : this(
        dto.cards.map{Card(it) },
        dto.prices.toMap(),
        dto.millValues.toMap(),
        dto.rarityProbabilities.toMap()
    )

    val cardsByRarity : Map<Rarity>, List<Card>> = cards.groupBy { it.rarity }

    init {
            if(cards.isEmpty()){
                throw IllegalArgumentException("no cards")
            }
        Rarity.values().forEach{
            requireNotNull(prices[it])
            requireNotNull(millValues[it])
            requireNotNull(rarityProbabilities[it])
        }

        val p = rarityProbabilities.values.sum()
        if(abs(1-p) > 0.00001) {
            throw IllegalArgumentException("Invalid probability sum: $p")
        }
    }
}