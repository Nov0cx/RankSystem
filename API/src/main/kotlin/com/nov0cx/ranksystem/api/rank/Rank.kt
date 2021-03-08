package com.nov0cx.ranksystem.api.rank

import org.bukkit.entity.Player

interface IRank {
    val name: String
    val level: Int
    val players: ArrayList<Player>

}