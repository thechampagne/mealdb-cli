package io.github.thexxiv
package mealdb.cli

import mealdb.MealDB

object Util {
  def search(str: String): Unit = {
    val data = MealDB.search(str)
    if (data != null && !data.isEmpty) {
      data.forEach(obj => {
        if (obj.strMeal != null) printf("Meal: %s\n", obj.strMeal)
        if (obj.idMeal != null) printf("Id: %s\n", obj.idMeal)
        if (obj.strDrinkAlternate != null && obj.strDrinkAlternate != "") printf("Drink Alternate: %s\n", obj.strDrinkAlternate)
        if (obj.strTags != null && obj.strTags != "") printf("Tags: %s\n", obj.strTags)
        if (obj.strCategory != null && obj.strCategory != "") printf("Category: %s\n", obj.strCategory)
        if (obj.strArea != null && obj.strArea != "") printf("Area: %s\n", obj.strArea)
        if (obj.strInstructions != null && obj.strInstructions != "") printf("Instructions: %s\n", obj.strInstructions)
        if (obj.strMealThumb != null && obj.strMealThumb != "") printf("Image: %s\n", obj.strMealThumb)
        if (obj.strYoutube != null && obj.strYoutube != "") printf("Video: %s\n", obj.strYoutube)
        if (obj.strIngredient1 != null && obj.strIngredient1 != "") printf("Ingredient1: %s\n", obj.strIngredient1)
        if (obj.strIngredient2 != null && obj.strIngredient2 != "") printf("Ingredient2: %s\n", obj.strIngredient2)
        if (obj.strIngredient3 != null && obj.strIngredient3 != "") printf("Ingredient3: %s\n", obj.strIngredient3)
        if (obj.strIngredient4 != null && obj.strIngredient4 != "") printf("Ingredient4: %s\n", obj.strIngredient4)
        if (obj.strIngredient5 != null && obj.strIngredient5 != "") printf("Ingredient5: %s\n", obj.strIngredient5)
        if (obj.strIngredient6 != null && obj.strIngredient6 != "") printf("Ingredient6: %s\n", obj.strIngredient6)
        if (obj.strIngredient7 != null && obj.strIngredient7 != "") printf("Ingredient7: %s\n", obj.strIngredient7)
        if (obj.strIngredient8 != null && obj.strIngredient8 != "") printf("Ingredient8: %s\n", obj.strIngredient8)
        if (obj.strIngredient9 != null && obj.strIngredient9 != "") printf("Ingredient9: %s\n", obj.strIngredient9)
        if (obj.strIngredient10 != null && obj.strIngredient10 != "") printf("Ingredient10: %s\n", obj.strIngredient10)
        if (obj.strIngredient11 != null && obj.strIngredient11 != "") printf("Ingredient11: %s\n", obj.strIngredient11)
        if (obj.strIngredient12 != null && obj.strIngredient12 != "") printf("Ingredient12: %s\n", obj.strIngredient12)
        if (obj.strIngredient13 != null && obj.strIngredient13 != "") printf("Ingredient13: %s\n", obj.strIngredient13)
        if (obj.strIngredient14 != null && obj.strIngredient14 != "") printf("Ingredient14: %s\n", obj.strIngredient14)
        if (obj.strIngredient15 != null && obj.strIngredient15 != "") printf("Ingredient15: %s\n", obj.strIngredient15)
        if (obj.strIngredient16 != null && obj.strIngredient16 != "") printf("Ingredient16: %s\n", obj.strIngredient16)
        if (obj.strIngredient17 != null && obj.strIngredient17 != "") printf("Ingredient17: %s\n", obj.strIngredient17)
        if (obj.strIngredient18 != null && obj.strIngredient18 != "") printf("Ingredient18: %s\n", obj.strIngredient18)
        if (obj.strIngredient19 != null && obj.strIngredient19 != "") printf("Ingredient19: %s\n", obj.strIngredient19)
        if (obj.strIngredient20 != null && obj.strIngredient20 != "") printf("Ingredient20: %s\n", obj.strIngredient20)
        if (obj.strMeasure1 != null && obj.strMeasure1 != "") printf("Measure1: %s\n", obj.strMeasure1)
        if (obj.strMeasure2 != null && obj.strMeasure2 != "") printf("Measure2: %s\n", obj.strMeasure2)
        if (obj.strMeasure3 != null && obj.strMeasure3 != "") printf("Measure3: %s\n", obj.strMeasure3)
        if (obj.strMeasure4 != null && obj.strMeasure4 != "") printf("Measure4: %s\n", obj.strMeasure4)
        if (obj.strMeasure5 != null && obj.strMeasure5 != "") printf("Measure5: %s\n", obj.strMeasure5)
        if (obj.strMeasure6 != null && obj.strMeasure6 != "") printf("Measure6: %s\n", obj.strMeasure6)
        if (obj.strMeasure7 != null && obj.strMeasure7 != "") printf("Measure7: %s\n", obj.strMeasure7)
        if (obj.strMeasure8 != null && obj.strMeasure8 != "") printf("Measure8: %s\n", obj.strMeasure8)
        if (obj.strMeasure9 != null && obj.strMeasure9 != "") printf("Measure9: %s\n", obj.strMeasure9)
        if (obj.strMeasure10 != null && obj.strMeasure10 != "") printf("Measure10: %s\n", obj.strMeasure10)
        if (obj.strMeasure11 != null && obj.strMeasure11 != "") printf("Measure11: %s\n", obj.strMeasure11)
        if (obj.strMeasure12 != null && obj.strMeasure12 != "") printf("Measure12: %s\n", obj.strMeasure12)
        if (obj.strMeasure13 != null && obj.strMeasure13 != "") printf("Measure13: %s\n", obj.strMeasure13)
        if (obj.strMeasure14 != null && obj.strMeasure14 != "") printf("Measure14: %s\n", obj.strMeasure14)
        if (obj.strMeasure15 != null && obj.strMeasure15 != "") printf("Measure15: %s\n", obj.strMeasure15)
        if (obj.strMeasure16 != null && obj.strMeasure16 != "") printf("Measure16: %s\n", obj.strMeasure16)
        if (obj.strMeasure17 != null && obj.strMeasure17 != "") printf("Measure17: %s\n", obj.strMeasure17)
        if (obj.strMeasure18 != null && obj.strMeasure18 != "") printf("Measure18: %s\n", obj.strMeasure18)
        if (obj.strMeasure19 != null && obj.strMeasure19 != "") printf("Measure19: %s\n", obj.strMeasure19)
        if (obj.strMeasure20 != null && obj.strMeasure20 != "") printf("Measure20: %s\n", obj.strMeasure20)
        if (obj.strSource != null && obj.strSource != "") printf("Source: %s\n", obj.strSource)
        if (obj.strImageSource != null && obj.strImageSource != "") printf("Image Source: %s\n", obj.strImageSource)
        if (obj.strCreativeCommonsConfirmed != null && obj.strCreativeCommonsConfirmed != "") printf("Creative Commons Confirmed: %s\n", obj.strCreativeCommonsConfirmed)
        if (obj.dateModified != null && obj.dateModified != "") printf("Date Modified: %s\n", obj.dateModified)
        print("\n")
      })
    } else {
      print("Error: Something went wrong")
    }
  }

  def searchById(id: Int): Unit = {
    val data = MealDB.searchByID(id)
    if (data != null) {
      if (data.strMeal != null) printf("Meal: %s\n", data.strMeal)
      if (data.idMeal != null) printf("Id: %s\n", data.idMeal)
      if (data.strDrinkAlternate != null && data.strDrinkAlternate != "") printf("Drink Alternate: %s\n", data.strDrinkAlternate)
      if (data.strTags != null && data.strTags != "") printf("Tags: %s\n", data.strTags)
      if (data.strCategory != null && data.strCategory != "") printf("Category: %s\n", data.strCategory)
      if (data.strArea != null && data.strArea != "") printf("Area: %s\n", data.strArea)
      if (data.strInstructions != null && data.strInstructions != "") printf("Instructions: %s\n", data.strInstructions)
      if (data.strMealThumb != null && data.strMealThumb != "") printf("Image: %s\n", data.strMealThumb)
      if (data.strYoutube != null && data.strYoutube != "") printf("Video: %s\n", data.strYoutube)
      if (data.strIngredient1 != null && data.strIngredient1 != "") printf("Ingredient1: %s\n", data.strIngredient1)
      if (data.strIngredient2 != null && data.strIngredient2 != "") printf("Ingredient2: %s\n", data.strIngredient2)
      if (data.strIngredient3 != null && data.strIngredient3 != "") printf("Ingredient3: %s\n", data.strIngredient3)
      if (data.strIngredient4 != null && data.strIngredient4 != "") printf("Ingredient4: %s\n", data.strIngredient4)
      if (data.strIngredient5 != null && data.strIngredient5 != "") printf("Ingredient5: %s\n", data.strIngredient5)
      if (data.strIngredient6 != null && data.strIngredient6 != "") printf("Ingredient6: %s\n", data.strIngredient6)
      if (data.strIngredient7 != null && data.strIngredient7 != "") printf("Ingredient7: %s\n", data.strIngredient7)
      if (data.strIngredient8 != null && data.strIngredient8 != "") printf("Ingredient8: %s\n", data.strIngredient8)
      if (data.strIngredient9 != null && data.strIngredient9 != "") printf("Ingredient9: %s\n", data.strIngredient9)
      if (data.strIngredient10 != null && data.strIngredient10 != "") printf("Ingredient10: %s\n", data.strIngredient10)
      if (data.strIngredient11 != null && data.strIngredient11 != "") printf("Ingredient11: %s\n", data.strIngredient11)
      if (data.strIngredient12 != null && data.strIngredient12 != "") printf("Ingredient12: %s\n", data.strIngredient12)
      if (data.strIngredient13 != null && data.strIngredient13 != "") printf("Ingredient13: %s\n", data.strIngredient13)
      if (data.strIngredient14 != null && data.strIngredient14 != "") printf("Ingredient14: %s\n", data.strIngredient14)
      if (data.strIngredient15 != null && data.strIngredient15 != "") printf("Ingredient15: %s\n", data.strIngredient15)
      if (data.strIngredient16 != null && data.strIngredient16 != "") printf("Ingredient16: %s\n", data.strIngredient16)
      if (data.strIngredient17 != null && data.strIngredient17 != "") printf("Ingredient17: %s\n", data.strIngredient17)
      if (data.strIngredient18 != null && data.strIngredient18 != "") printf("Ingredient18: %s\n", data.strIngredient18)
      if (data.strIngredient19 != null && data.strIngredient19 != "") printf("Ingredient19: %s\n", data.strIngredient19)
      if (data.strIngredient20 != null && data.strIngredient20 != "") printf("Ingredient20: %s\n", data.strIngredient20)
      if (data.strMeasure1 != null && data.strMeasure1 != "") printf("Measure1: %s\n", data.strMeasure1)
      if (data.strMeasure2 != null && data.strMeasure2 != "") printf("Measure2: %s\n", data.strMeasure2)
      if (data.strMeasure3 != null && data.strMeasure3 != "") printf("Measure3: %s\n", data.strMeasure3)
      if (data.strMeasure4 != null && data.strMeasure4 != "") printf("Measure4: %s\n", data.strMeasure4)
      if (data.strMeasure5 != null && data.strMeasure5 != "") printf("Measure5: %s\n", data.strMeasure5)
      if (data.strMeasure6 != null && data.strMeasure6 != "") printf("Measure6: %s\n", data.strMeasure6)
      if (data.strMeasure7 != null && data.strMeasure7 != "") printf("Measure7: %s\n", data.strMeasure7)
      if (data.strMeasure8 != null && data.strMeasure8 != "") printf("Measure8: %s\n", data.strMeasure8)
      if (data.strMeasure9 != null && data.strMeasure9 != "") printf("Measure9: %s\n", data.strMeasure9)
      if (data.strMeasure10 != null && data.strMeasure10 != "") printf("Measure10: %s\n", data.strMeasure10)
      if (data.strMeasure11 != null && data.strMeasure11 != "") printf("Measure11: %s\n", data.strMeasure11)
      if (data.strMeasure12 != null && data.strMeasure12 != "") printf("Measure12: %s\n", data.strMeasure12)
      if (data.strMeasure13 != null && data.strMeasure13 != "") printf("Measure13: %s\n", data.strMeasure13)
      if (data.strMeasure14 != null && data.strMeasure14 != "") printf("Measure14: %s\n", data.strMeasure14)
      if (data.strMeasure15 != null && data.strMeasure15 != "") printf("Measure15: %s\n", data.strMeasure15)
      if (data.strMeasure16 != null && data.strMeasure16 != "") printf("Measure16: %s\n", data.strMeasure16)
      if (data.strMeasure17 != null && data.strMeasure17 != "") printf("Measure17: %s\n", data.strMeasure17)
      if (data.strMeasure18 != null && data.strMeasure18 != "") printf("Measure18: %s\n", data.strMeasure18)
      if (data.strMeasure19 != null && data.strMeasure19 != "") printf("Measure19: %s\n", data.strMeasure19)
      if (data.strMeasure20 != null && data.strMeasure20 != "") printf("Measure20: %s\n", data.strMeasure20)
      if (data.strSource != null && data.strSource != "") printf("Source: %s\n", data.strSource)
      if (data.strImageSource != null && data.strImageSource != "") printf("Image Source: %s\n", data.strImageSource)
      if (data.strCreativeCommonsConfirmed != null && data.strCreativeCommonsConfirmed != "") printf("Creative Commons Confirmed: %s\n", data.strCreativeCommonsConfirmed)
      if (data.dateModified != null && data.dateModified != "") printf("Date Modified: %s\n", data.dateModified)
      print("\n")
    } else {
      print("Error: Something went wrong")
    }
  }

  def searchByLetter(char: Char): Unit = {
    val data = MealDB.searchByLetter(char)
    if (data != null && !data.isEmpty) {
      data.forEach(obj => {
        if (obj.strMeal != null) printf("Meal: %s\n", obj.strMeal)
        if (obj.idMeal != null) printf("Id: %s\n", obj.idMeal)
        if (obj.strDrinkAlternate != null && obj.strDrinkAlternate != "") printf("Drink Alternate: %s\n", obj.strDrinkAlternate)
        if (obj.strTags != null && obj.strTags != "") printf("Tags: %s\n", obj.strTags)
        if (obj.strCategory != null && obj.strCategory != "") printf("Category: %s\n", obj.strCategory)
        if (obj.strArea != null && obj.strArea != "") printf("Area: %s\n", obj.strArea)
        if (obj.strInstructions != null && obj.strInstructions != "") printf("Instructions: %s\n", obj.strInstructions)
        if (obj.strMealThumb != null && obj.strMealThumb != "") printf("Image: %s\n", obj.strMealThumb)
        if (obj.strYoutube != null && obj.strYoutube != "") printf("Video: %s\n", obj.strYoutube)
        if (obj.strIngredient1 != null && obj.strIngredient1 != "") printf("Ingredient1: %s\n", obj.strIngredient1)
        if (obj.strIngredient2 != null && obj.strIngredient2 != "") printf("Ingredient2: %s\n", obj.strIngredient2)
        if (obj.strIngredient3 != null && obj.strIngredient3 != "") printf("Ingredient3: %s\n", obj.strIngredient3)
        if (obj.strIngredient4 != null && obj.strIngredient4 != "") printf("Ingredient4: %s\n", obj.strIngredient4)
        if (obj.strIngredient5 != null && obj.strIngredient5 != "") printf("Ingredient5: %s\n", obj.strIngredient5)
        if (obj.strIngredient6 != null && obj.strIngredient6 != "") printf("Ingredient6: %s\n", obj.strIngredient6)
        if (obj.strIngredient7 != null && obj.strIngredient7 != "") printf("Ingredient7: %s\n", obj.strIngredient7)
        if (obj.strIngredient8 != null && obj.strIngredient8 != "") printf("Ingredient8: %s\n", obj.strIngredient8)
        if (obj.strIngredient9 != null && obj.strIngredient9 != "") printf("Ingredient9: %s\n", obj.strIngredient9)
        if (obj.strIngredient10 != null && obj.strIngredient10 != "") printf("Ingredient10: %s\n", obj.strIngredient10)
        if (obj.strIngredient11 != null && obj.strIngredient11 != "") printf("Ingredient11: %s\n", obj.strIngredient11)
        if (obj.strIngredient12 != null && obj.strIngredient12 != "") printf("Ingredient12: %s\n", obj.strIngredient12)
        if (obj.strIngredient13 != null && obj.strIngredient13 != "") printf("Ingredient13: %s\n", obj.strIngredient13)
        if (obj.strIngredient14 != null && obj.strIngredient14 != "") printf("Ingredient14: %s\n", obj.strIngredient14)
        if (obj.strIngredient15 != null && obj.strIngredient15 != "") printf("Ingredient15: %s\n", obj.strIngredient15)
        if (obj.strIngredient16 != null && obj.strIngredient16 != "") printf("Ingredient16: %s\n", obj.strIngredient16)
        if (obj.strIngredient17 != null && obj.strIngredient17 != "") printf("Ingredient17: %s\n", obj.strIngredient17)
        if (obj.strIngredient18 != null && obj.strIngredient18 != "") printf("Ingredient18: %s\n", obj.strIngredient18)
        if (obj.strIngredient19 != null && obj.strIngredient19 != "") printf("Ingredient19: %s\n", obj.strIngredient19)
        if (obj.strIngredient20 != null && obj.strIngredient20 != "") printf("Ingredient20: %s\n", obj.strIngredient20)
        if (obj.strMeasure1 != null && obj.strMeasure1 != "") printf("Measure1: %s\n", obj.strMeasure1)
        if (obj.strMeasure2 != null && obj.strMeasure2 != "") printf("Measure2: %s\n", obj.strMeasure2)
        if (obj.strMeasure3 != null && obj.strMeasure3 != "") printf("Measure3: %s\n", obj.strMeasure3)
        if (obj.strMeasure4 != null && obj.strMeasure4 != "") printf("Measure4: %s\n", obj.strMeasure4)
        if (obj.strMeasure5 != null && obj.strMeasure5 != "") printf("Measure5: %s\n", obj.strMeasure5)
        if (obj.strMeasure6 != null && obj.strMeasure6 != "") printf("Measure6: %s\n", obj.strMeasure6)
        if (obj.strMeasure7 != null && obj.strMeasure7 != "") printf("Measure7: %s\n", obj.strMeasure7)
        if (obj.strMeasure8 != null && obj.strMeasure8 != "") printf("Measure8: %s\n", obj.strMeasure8)
        if (obj.strMeasure9 != null && obj.strMeasure9 != "") printf("Measure9: %s\n", obj.strMeasure9)
        if (obj.strMeasure10 != null && obj.strMeasure10 != "") printf("Measure10: %s\n", obj.strMeasure10)
        if (obj.strMeasure11 != null && obj.strMeasure11 != "") printf("Measure11: %s\n", obj.strMeasure11)
        if (obj.strMeasure12 != null && obj.strMeasure12 != "") printf("Measure12: %s\n", obj.strMeasure12)
        if (obj.strMeasure13 != null && obj.strMeasure13 != "") printf("Measure13: %s\n", obj.strMeasure13)
        if (obj.strMeasure14 != null && obj.strMeasure14 != "") printf("Measure14: %s\n", obj.strMeasure14)
        if (obj.strMeasure15 != null && obj.strMeasure15 != "") printf("Measure15: %s\n", obj.strMeasure15)
        if (obj.strMeasure16 != null && obj.strMeasure16 != "") printf("Measure16: %s\n", obj.strMeasure16)
        if (obj.strMeasure17 != null && obj.strMeasure17 != "") printf("Measure17: %s\n", obj.strMeasure17)
        if (obj.strMeasure18 != null && obj.strMeasure18 != "") printf("Measure18: %s\n", obj.strMeasure18)
        if (obj.strMeasure19 != null && obj.strMeasure19 != "") printf("Measure19: %s\n", obj.strMeasure19)
        if (obj.strMeasure20 != null && obj.strMeasure20 != "") printf("Measure20: %s\n", obj.strMeasure20)
        if (obj.strSource != null && obj.strSource != "") printf("Source: %s\n", obj.strSource)
        if (obj.strImageSource != null && obj.strImageSource != "") printf("Image Source: %s\n", obj.strImageSource)
        if (obj.strCreativeCommonsConfirmed != null && obj.strCreativeCommonsConfirmed != "") printf("Creative Commons Confirmed: %s\n", obj.strCreativeCommonsConfirmed)
        if (obj.dateModified != null && obj.dateModified != "") printf("Date Modified: %s\n", obj.dateModified)
        print("\n")
      })
    } else {
      print("Error: Something went wrong")
    }
  }

  def random(): Unit = {
    val data = MealDB.random()
    if (data != null) {
      if (data.strMeal != null) printf("Meal: %s\n", data.strMeal)
      if (data.idMeal != null) printf("Id: %s\n", data.idMeal)
      if (data.strDrinkAlternate != null && data.strDrinkAlternate != "") printf("Drink Alternate: %s\n", data.strDrinkAlternate)
      if (data.strTags != null && data.strTags != "") printf("Tags: %s\n", data.strTags)
      if (data.strCategory != null && data.strCategory != "") printf("Category: %s\n", data.strCategory)
      if (data.strArea != null && data.strArea != "") printf("Area: %s\n", data.strArea)
      if (data.strInstructions != null && data.strInstructions != "") printf("Instructions: %s\n", data.strInstructions)
      if (data.strMealThumb != null && data.strMealThumb != "") printf("Image: %s\n", data.strMealThumb)
      if (data.strYoutube != null && data.strYoutube != "") printf("Video: %s\n", data.strYoutube)
      if (data.strIngredient1 != null && data.strIngredient1 != "") printf("Ingredient1: %s\n", data.strIngredient1)
      if (data.strIngredient2 != null && data.strIngredient2 != "") printf("Ingredient2: %s\n", data.strIngredient2)
      if (data.strIngredient3 != null && data.strIngredient3 != "") printf("Ingredient3: %s\n", data.strIngredient3)
      if (data.strIngredient4 != null && data.strIngredient4 != "") printf("Ingredient4: %s\n", data.strIngredient4)
      if (data.strIngredient5 != null && data.strIngredient5 != "") printf("Ingredient5: %s\n", data.strIngredient5)
      if (data.strIngredient6 != null && data.strIngredient6 != "") printf("Ingredient6: %s\n", data.strIngredient6)
      if (data.strIngredient7 != null && data.strIngredient7 != "") printf("Ingredient7: %s\n", data.strIngredient7)
      if (data.strIngredient8 != null && data.strIngredient8 != "") printf("Ingredient8: %s\n", data.strIngredient8)
      if (data.strIngredient9 != null && data.strIngredient9 != "") printf("Ingredient9: %s\n", data.strIngredient9)
      if (data.strIngredient10 != null && data.strIngredient10 != "") printf("Ingredient10: %s\n", data.strIngredient10)
      if (data.strIngredient11 != null && data.strIngredient11 != "") printf("Ingredient11: %s\n", data.strIngredient11)
      if (data.strIngredient12 != null && data.strIngredient12 != "") printf("Ingredient12: %s\n", data.strIngredient12)
      if (data.strIngredient13 != null && data.strIngredient13 != "") printf("Ingredient13: %s\n", data.strIngredient13)
      if (data.strIngredient14 != null && data.strIngredient14 != "") printf("Ingredient14: %s\n", data.strIngredient14)
      if (data.strIngredient15 != null && data.strIngredient15 != "") printf("Ingredient15: %s\n", data.strIngredient15)
      if (data.strIngredient16 != null && data.strIngredient16 != "") printf("Ingredient16: %s\n", data.strIngredient16)
      if (data.strIngredient17 != null && data.strIngredient17 != "") printf("Ingredient17: %s\n", data.strIngredient17)
      if (data.strIngredient18 != null && data.strIngredient18 != "") printf("Ingredient18: %s\n", data.strIngredient18)
      if (data.strIngredient19 != null && data.strIngredient19 != "") printf("Ingredient19: %s\n", data.strIngredient19)
      if (data.strIngredient20 != null && data.strIngredient20 != "") printf("Ingredient20: %s\n", data.strIngredient20)
      if (data.strMeasure1 != null && data.strMeasure1 != "") printf("Measure1: %s\n", data.strMeasure1)
      if (data.strMeasure2 != null && data.strMeasure2 != "") printf("Measure2: %s\n", data.strMeasure2)
      if (data.strMeasure3 != null && data.strMeasure3 != "") printf("Measure3: %s\n", data.strMeasure3)
      if (data.strMeasure4 != null && data.strMeasure4 != "") printf("Measure4: %s\n", data.strMeasure4)
      if (data.strMeasure5 != null && data.strMeasure5 != "") printf("Measure5: %s\n", data.strMeasure5)
      if (data.strMeasure6 != null && data.strMeasure6 != "") printf("Measure6: %s\n", data.strMeasure6)
      if (data.strMeasure7 != null && data.strMeasure7 != "") printf("Measure7: %s\n", data.strMeasure7)
      if (data.strMeasure8 != null && data.strMeasure8 != "") printf("Measure8: %s\n", data.strMeasure8)
      if (data.strMeasure9 != null && data.strMeasure9 != "") printf("Measure9: %s\n", data.strMeasure9)
      if (data.strMeasure10 != null && data.strMeasure10 != "") printf("Measure10: %s\n", data.strMeasure10)
      if (data.strMeasure11 != null && data.strMeasure11 != "") printf("Measure11: %s\n", data.strMeasure11)
      if (data.strMeasure12 != null && data.strMeasure12 != "") printf("Measure12: %s\n", data.strMeasure12)
      if (data.strMeasure13 != null && data.strMeasure13 != "") printf("Measure13: %s\n", data.strMeasure13)
      if (data.strMeasure14 != null && data.strMeasure14 != "") printf("Measure14: %s\n", data.strMeasure14)
      if (data.strMeasure15 != null && data.strMeasure15 != "") printf("Measure15: %s\n", data.strMeasure15)
      if (data.strMeasure16 != null && data.strMeasure16 != "") printf("Measure16: %s\n", data.strMeasure16)
      if (data.strMeasure17 != null && data.strMeasure17 != "") printf("Measure17: %s\n", data.strMeasure17)
      if (data.strMeasure18 != null && data.strMeasure18 != "") printf("Measure18: %s\n", data.strMeasure18)
      if (data.strMeasure19 != null && data.strMeasure19 != "") printf("Measure19: %s\n", data.strMeasure19)
      if (data.strMeasure20 != null && data.strMeasure20 != "") printf("Measure20: %s\n", data.strMeasure20)
      if (data.strSource != null && data.strSource != "") printf("Source: %s\n", data.strSource)
      if (data.strImageSource != null && data.strImageSource != "") printf("Image Source: %s\n", data.strImageSource)
      if (data.strCreativeCommonsConfirmed != null && data.strCreativeCommonsConfirmed != "") printf("Creative Commons Confirmed: %s\n", data.strCreativeCommonsConfirmed)
      if (data.dateModified != null && data.dateModified != "") printf("Date Modified: %s\n", data.dateModified)
      print("\n")
    } else {
      print("Error: Something went wrong")
    }
  }

  def filterByIngredient(str: String): Unit = {
    val data = MealDB.filterByIngredient(str)
    if (data != null && !data.isEmpty) {
      data.forEach(obj => {
        if (obj.strMeal != null) printf("Meal: %s\n", obj.strMeal)
        if (obj.idMeal != null) printf("Id: %s\n", obj.idMeal)
        if (obj.strMealThumb != null) printf("Image: %s\n", obj.strMealThumb)
        print("\n")
      })
    } else {
      print("Error: Something went wrong")
    }
  }

  def filterByCategory(str: String): Unit = {
    val data = MealDB.filterByCategory(str)
    if (data != null && !data.isEmpty) {
      data.forEach(obj => {
        if (obj.strMeal != null) printf("Meal: %s\n", obj.strMeal)
        if (obj.idMeal != null) printf("Id: %s\n", obj.idMeal)
        if (obj.strMealThumb != null) printf("Image: %s\n", obj.strMealThumb)
        print("\n")
      })
    } else {
      print("Error: Something went wrong")
    }
  }

  def filterByArea(str: String): Unit = {
    val data = MealDB.filterByArea(str)
    if (data != null && !data.isEmpty) {
      data.forEach(obj => {
        if (obj.strMeal != null) printf("Meal: %s\n", obj.strMeal)
        if (obj.idMeal != null) printf("Id: %s\n", obj.idMeal)
        if (obj.strMealThumb != null) printf("Image: %s\n", obj.strMealThumb)
        print("\n")
      })
    } else {
      print("Error: Something went wrong")
    }
  }

  def ingredientsFilter(): Unit = {
    val data = MealDB.ingredientsFilter()
    if (data != null && !data.isEmpty) {
      data.forEach(obj => {
        if (obj.strIngredient != null) printf("Ingredient: %s\n", obj.strIngredient)
        if (obj.idIngredient != null) printf("Id: %s\n", obj.idIngredient)
        if (obj.strDescription != null) printf("Description: %s\n", obj.strDescription)
        if (obj.strType != null) printf("Type: %s\n", obj.strType)
        print("\n")
      })
    } else {
      print("Error: Something went wrong")
    }
  }

  def categoriesFilter(): Unit = {
    val data = MealDB.categoriesFilter()
    if (data != null && !data.isEmpty) {
      data.forEach(obj => {
        print(obj + "\n")
      })
    } else {
      print("Error: Something went wrong")
    }
  }

  def areaFilter(): Unit = {
    val data = MealDB.areaFilter()
    if (data != null && !data.isEmpty) {
      data.forEach(obj => {
        print(obj + "\n")
      })
    } else {
      print("Error: Something went wrong")
    }
  }

  def mealCategories(): Unit = {
    val data = MealDB.mealCategories()
    if (data != null && !data.isEmpty) {
      data.forEach(obj => {
        if (obj.strCategory != null) printf("Category: %s\n", obj.strCategory)
        if (obj.idCategory != null) printf("Id: %s\n", obj.idCategory)
        if (obj.strCategoryThumb != null) printf("Image: %s\n", obj.strCategoryThumb)
        if (obj.strCategoryDescription != null) printf("Description: %s\n", obj.strCategoryDescription)
        print("\n")
      })
    } else {
      print("Error: Something went wrong")
    }
  }
}