package io.github.thexxiv
package mealdb.cli

object App {
  def run(args: Array[String]): Unit = {
    if (!indexExists(args, 0)) {
      println("Usage: meal -S \"Meal name\"")
      println("             (Search meal by name)")
      println("   or  meal -SL \"Meals letter\"")
      println("             (Search meals by first letter)")
      println("   or  meal -SID \"Meal id\"")
      println("             (Search meal details by id)")
      println("   or  meal -R")
      println("             (Random meal)")
      println("   or  meal -F [filters]")
      println("             (Meals by filter)")
      println("   or  meal -L [lists]")
      println("             (List of filters)")
      println("filters:")
      println("       -i \"Ingredient name\"")
      println("       -a \"Area name\"")
      println("       -c \"Category name\"")
      println("lists:")
      println("       -i")
      println("             (List of ingredients)")
      println("       -a")
      println("             (List of areas)")
      println("       -c")
      println("             (List of categories)")
      println("       -m")
      println("             (List of meals categories)")
    } else if (indexExists(args, 0)) {
      if (args(0).equals("-S")) {
        if (!indexExists(args, 1)) {
          print("Error: Meal name is missing")
        } else if (indexExists(args, 1)) {
          Util.search(args(1))
        }
      } else if (args(0).equals("-SID")) {
        if (!indexExists(args, 1)) {
          print("Error: Meal id is missing")
        } else if (indexExists(args, 1)) {
          try {
            val number = Integer.parseInt(args(1))
            Util.searchById(number)
          } catch {
            case ex: NumberFormatException => printf("Error: %s is not a number", args(1))
          }
        }
      } else if (args(0).equals("-SL")) {
        if (!indexExists(args, 1)) {
          print("Error: Meal letter is missing")
        } else if (indexExists(args, 1)) {
          Util.searchByLetter(args(1).charAt(0))
        }
      } else if (args(0).equals("-R")) {
        Util.random()
      } else if (args(0).equals("-F")) {
        if (!indexExists(args, 1)) {
          print("Error: Filter is missing")
        } else if (indexExists(args, 1)) {
          if (args(1).equals("-i")) {
            if (!indexExists(args, 2)) {
              print("Error: Ingredient name is missing")
            } else if (indexExists(args, 2)) {
              Util.filterByIngredient(args(2))
            }
          } else if (args(1).equals("-c")) {
            if (!indexExists(args, 2)) {
              print("Error: Category name is missing")
            } else if (indexExists(args, 2)) {
              Util.filterByCategory(args(2))
            }
          } else if (args(1).equals("-a")) {
            if (!indexExists(args, 2)) {
              print("Error: Area name is missing")
            } else if (indexExists(args, 2)) {
              Util.filterByArea(args(2))
            }
          } else {
            printf("Error: %s is a wrong filter", args(1))
          }
        }
      } else if (args(0).equals("-L")) {
        if (!indexExists(args, 1)) {
          print("Error: List name is missing")
        } else if (indexExists(args, 1)) {
          if (args(1).equals("-i")) {
            Util.ingredientsFilter()
          } else if (args(1).equals("-a")) {
            Util.areaFilter()
          } else if (args(1).equals("-c")) {
            Util.categoriesFilter()
          } else if (args(1).equals("-m")) {
            Util.mealCategories()
          } else {
            printf("Error: %s is a wrong list", args(1))
          }
        }
      } else {
        println("Usage: meal -S \"Meal name\"")
        println("             (Search meal by name)")
        println("   or  meal -SL \"Meals letter\"")
        println("             (Search meals by first letter)")
        println("   or  meal -SID \"Meal id\"")
        println("             (Search meal details by id)")
        println("   or  meal -R")
        println("             (Random meal)")
        println("   or  meal -F [filters]")
        println("             (Meals by filter)")
        println("   or  meal -L [lists]")
        println("             (List of filters)")
        println("filters:")
        println("       -i \"Ingredient name\"")
        println("       -a \"Area name\"")
        println("       -c \"Category name\"")
        println("lists:")
        println("       -i")
        println("             (List of ingredients)")
        println("       -a")
        println("             (List of areas)")
        println("       -c")
        println("             (List of categories)")
        println("       -m")
        println("             (List of meals categories)")
      }
    }
  }

  def indexExists(list: Array[String], index: Int): Boolean = {
    index >= 0 && index < list.length
  }
}