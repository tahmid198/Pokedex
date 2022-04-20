package com.example.pokedex.model

data class Data(
    val abilities: List<Ability>,
    val artist: String,
    val attacks: List<Attack>,
    val cardmarket: Cardmarket,
    val evolvesFrom: String,
    val hp: String,
    val id: String,
    val images: Images,
    val legalities: Legalities,
    val name: String,
    val nationalPokedexNumbers: List<Int>,
    val number: String,
    val rarity: String,
    val resistances: List<Resistance>,
    val `set`: Set,
    val subtypes: List<String>,
    val supertype: String,
    val tcgplayer: Tcgplayer,
    val types: List<String>,
    val weaknesses: List<Weaknesse>
)