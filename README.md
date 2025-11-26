🎬 Movie Recommendation System

The Movie Recommendation System is a Java-based application designed to help users discover movies and series based on their preferences. It allows users to rate movies, add reviews, and receive recommendations using basic object-oriented programming principles.

🚀 Features

📌 Add Movies and Series
Users can create movie and series objects with attributes such as title, genre, release year, number of seasons, and episodes.

⭐ Rate Movies
Users can give a score and a comment for each movie or series.

🎯 Get Personalized Recommendations
The system suggests movies/series based on user ratings and genres.

🧩 Object-Oriented Structure
The project uses:

Classes & Objects

Enums (genres)

Inheritance

Polymorphism

Encapsulation

🛠 Error Handling
Custom validation when adding ratings (e.g., preventing null movies or invalid scores).

📂 Project Structure

Typical classes in the project include:

Movie – contains title, genre, release year

Series – extends Movie, adds number of seasons and episodes

User – stores user information and ratings

Rating – contains score and comment

Genre (Enum) – defines categories like DRAMA, ACTION, SCI_FI, etc.

RecommendationEngine (optional) – suggests movies based on preferences
