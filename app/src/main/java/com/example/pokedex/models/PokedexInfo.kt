package com.example.pokedex.models

data class PokedexInfo(
    val count: Int,
    val `data`: List<Data>,
    val page: Int,
    val pageSize: Int,
    val totalCount: Int
)