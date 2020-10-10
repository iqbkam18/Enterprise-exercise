package org.enterprise2.cardgame.dto

class CollectionDto {

    var cards : MutableList<CardDto> = mutableListOf(),
    var prices: MutableMap<Rarity, Int> = mutableMap(),
    var millValues: MutableMap<Rarity, Int> = mutableMapOf(),
    var rarityProbabilities: MutableMap<Rarity, Double> = mutableMapOf()

}