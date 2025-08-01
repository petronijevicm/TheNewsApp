package com.example.thenewsapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Embedded
import java.io.Serializable

@Entity(tableName = "articles")
data class Article(
    val author: String? = "",
    val content: String? = "",
    val description: String? = "",
    val publishedAt: String? = "",
    @Embedded
    val source: Source = Source(),
    val title: String? = "",
    @PrimaryKey
    val url: String = "",
    val urlToImage: String? = ""
) : Serializable
