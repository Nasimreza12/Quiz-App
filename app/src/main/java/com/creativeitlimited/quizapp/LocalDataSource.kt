package com.creativeitlimited.quizapp

object LocalDataSource {
    val questions= mutableListOf<Quiz>(
        Quiz("What is the country of Bangladesh?",
            listOf("Naakhali","London","Dhaka","Dalli"),
        3),
        Quiz("What is the capital of France?",
        listOf("Berlin", "Paris", "Rome", "Madrid"),
        1),
    Quiz("Who is the author of 'To Kill a Mockingbird'?",
    listOf("Harper Lee", "Ernest Hemingway", "Mark Twain", "Jane Austen"),
    0),
    Quiz("Which planet is known as the Red Planet?",
    listOf("Jupiter", "Mars", "Venus", "Saturn"),
    1),
    Quiz("What is the chemical symbol for water?",
    listOf("H2O", "CO2", "O2", "N2"),
    0),
    Quiz("What is the square root of 144?",
    listOf("12", "10", "16", "14"),
    0),
    Quiz("Who developed the theory of relativity?",
    listOf("Isaac Newton", "Albert Einstein", "Galileo Galilei", "Stephen Hawking"),
    1),
    Quiz("Which is the longest river in the world?",
    listOf("Nile", "Amazon", "Mississippi", "Yangtze"),
    0),
    Quiz("Who wrote 'Romeo and Juliet'?",
    listOf("William Shakespeare", "Charles Dickens", "Jane Austen", "F. Scott Fitzgerald"),
    0),
    Quiz("What is the main ingredient in guacamole?",
    listOf("Tomato", "Onion", "Avocado", "Lemon"),
    2),
    Quiz("Which gas is most abundant in the Earth's atmosphere?",
    listOf("Oxygen", "Nitrogen", "Carbon Dioxide", "Argon"),
    1),
    Quiz("What is the chemical formula for table salt?",
    listOf("NaCl", "H2O", "CO2", "N2"),
    0),
    Quiz("Who was the first woman to win a Nobel Prize?",
    listOf("Marie Curie", "Rosalind Franklin", "Mother Teresa", "Ada Lovelace"),
    0),
    Quiz("What is the freezing point of water in Celsius?",
    listOf("-10°C", "0°C", "10°C", "20°C"),
    1),
    Quiz("Which planet is known as the 'Morning Star'?",
    listOf("Mars", "Venus", "Mercury", "Saturn"),
    1),

    )

}