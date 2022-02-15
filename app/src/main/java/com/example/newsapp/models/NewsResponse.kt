package com.example.newsapp

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)