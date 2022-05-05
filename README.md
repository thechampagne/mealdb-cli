# MealDB

[![](https://img.shields.io/github/v/tag/thechampagne/mealdb-cli?label=version)](https://github.com/thechampagne/mealdb-cli/releases/latest) [![](https://img.shields.io/github/license/thechampagne/mealdb-cli)](https://github.com/thechampagne/mealdb-cli/blob/main/LICENSE)

TheMealDB CLI app.

### Download

Latest Release: [GitHub Release](https://github.com/thechampagne/mealdb-cli/releases/latest)

### Usage

```
meal -S "Meal name"
             (Search meal by name)
or  meal -SL "Meals letter"
             (Search meals by first letter)
or  meal -SID "Meal id"
             (Search meal details by id)
or  meal -R
             (Random meal)
or  meal -F [filters]
             (Meals by filter)
or  meal -L [lists]
             (List of filters)
filters:
       -i "Ingredient name"
       -a "Area name"
       -c "Category name"
lists:
       -i
             (List of ingredients)
       -a
             (List of areas)
       -c
             (List of categories)
       -m
             (List of meals categories)
```

### License

MealDB is released under the [Apache License 2.0](https://github.com/thechampagne/mealdb-cli/blob/main/LICENSE).

```
 Copyright 2022 XXIV

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
```