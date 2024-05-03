# Stream API exercices:
#### 1. Retrieve the titles of all films released after the year 2000.
```java
films.stream()
                .filter(film -> film.getReleaseYear() > 2000)
                .map(Film::getTitle)
                .collect(Collectors.toList());
```
#### 2. Retrieve the titles of all films released after the year 2000 and that have a rating of PG-13.
```java
films.stream()
                .filter(film -> film.getReleaseYear() > 2000 && Objects.equals(film.getRating(), "PG-13"))
                .map(Film::getTitle)
                .collect(Collectors.toList());
```
#### 3. Retrieve the titles of all films released after the year 2000 and that have a rating of PG-13 and a rental rate of 0.99.
```java
films.stream()
                .filter(film ->
                        film.getReleaseYear() > 2000
                                && Objects.equals(film.getRating(), "PG-13")
                                && film.getRentalRate() == 0.99)
                .map(Film::getTitle)
                .collect(Collectors.toList());
```
#### 4. Retrieve the titles of all films released after the year 2000 and that have a rating of PG-13 and a rental rate of 0.99 and a replacement cost of 20.99.
```java
films.stream()
                .filter(film ->
                        film.getReleaseYear() > 2000
                                && Objects.equals(film.getRating(), "PG-13")
                                && film.getRentalRate() == 0.99
                                && film.getReplacementCost() == 20.99)
                .map(Film::getTitle)
                .collect(Collectors.toList());
```
#### 5. Retrieve the titles of all films released after the year 2000 and that have a rating of PG-13 and a rental rate of 0.99 and a replacement cost of 20.99 and a length of 100 minutes.
```java
films.stream()
                .filter(film ->
                        film.getReleaseYear() > 2000
                                && Objects.equals(film.getRating(), "PG-13")
                                && film.getRentalRate() == 0.99
                                && film.getReplacementCost() == 20.99
                                && film.getLength() == 100)
                .map(Film::getTitle)
                .collect(Collectors.toList());
```
#### 6. Retrieve the titles of all films released after the year 2000 and that have a rating of PG-13 and a rental rate of 0.99 and a replacement cost of 20.99 and a length of 100 minutes and a special features of Trailers.
```java
films.stream()
                .filter(film ->
                        film.getReleaseYear() > 2000
                                && Objects.equals(film.getRating(), "PG-13")
                                && film.getRentalRate() == 0.99
                                && film.getReplacementCost() == 20.99
                                && film.getLength() == 100
                                && film.getSpecialFeatures().contains("Trailers"))
                .map(Film::getTitle)
                .collect(Collectors.toList());
```
#### 7. Retrieve the titles of all films released after the year 2000 and that have a rating of PG-13 and a rental rate of 0.99 and a replacement cost of 20.99 and a length of 100 minutes and a special features of Trailers and a language of English.
```java
films.stream()
                .filter(film ->
                        film.getReleaseYear() > 2000
                                && Objects.equals(film.getRating(), "PG-13")
                                && film.getRentalRate() == 0.99
                                && film.getReplacementCost() == 20.99
                                && film.getLength() == 100
                                && film.getSpecialFeatures().contains("Trailers")
                                && languages.stream()
                                .filter(language -> language.getId().equals(film.getLanguageId()))
                                .map(Language::getName)
                                .allMatch(s -> s.equals("English")))
                .map(Film::getTitle)
                .collect(Collectors.toList());
```
#### 8. Retrieve the titles of all films released after the year 2000 and that have a rating of PG-13 and a rental rate of 0.99 and a replacement cost of 20.99 and a length of 100 minutes and a special features of Trailers and a language of English and a last update date of 2006-02-15 05:03:42.
```java
films.stream()
                .filter(film ->
                        film.getReleaseYear() > 2000
                                && Objects.equals(film.getRating(), "PG-13")
                                && film.getRentalRate() == 0.99
                                && film.getReplacementCost() == 20.99
                                && film.getLength() == 100
                                && film.getSpecialFeatures().contains("Trailers")
                                && languages.stream()
                                .filter(language -> language.getId().equals(film.getLanguageId()))
                                .map(Language::getName)
                                .allMatch(s -> s.equals("English"))
                                && film.getLastUpdate().equals(Timestamp.valueOf("2006-02-15 05:03:42")))
                .map(Film::getTitle)
                .collect(Collectors.toList());
```
#### 9. Retrieve the titles of all films released after the year 2000 and that have a rating of PG-13 and a rental rate of 0.99 and a replacement cost of 20.99 and a length of 100 minutes and a special features of Trailers and a language of English and a last update date of 2006-02-15 05:03:42 and a release year of 2006.
```java
films.stream()
                .filter(film ->
                        film.getReleaseYear() > 2000
                                && Objects.equals(film.getRating(), "PG-13")
                                && film.getRentalRate() == 0.99
                                && film.getReplacementCost() == 20.99
                                && film.getLength() == 100
                                && film.getSpecialFeatures().contains("Trailers")
                                && languages.stream()
                                .filter(language -> language.getId().equals(film.getLanguageId()))
                                .map(Language::getName)
                                .allMatch(s -> s.equals("English"))
                                && film.getLastUpdate().equals(Timestamp.valueOf("2006-02-15 05:03:42"))
                                && film.getReleaseYear() == 2006)
                .map(Film::getTitle)
                .collect(Collectors.toList());
```
#### 10. Retrieve the titles of all films released after the year 2000 and that have a rating of PG-13 and a rental rate of 0.99 and a replacement cost of 20.99 and a length of 100 minutes and a special features of Trailers and a language of English and a last update date of 2006-02-15 05:03:42 and a release year of 2006 and a rental duration of 5 days.
```java
films.stream()
                .filter(film ->
                        film.getReleaseYear() > 2000
                                && Objects.equals(film.getRating(), "PG-13")
                                && film.getRentalRate() == 0.99
                                && film.getReplacementCost() == 20.99
                                && film.getLength() == 100
                                && film.getSpecialFeatures().contains("Trailers")
                                && languages.stream()
                                .filter(language -> language.getId().equals(film.getLanguageId()))
                                .map(Language::getName)
                                .allMatch(s -> s.equals("English"))
                                && film.getLastUpdate().equals(Timestamp.valueOf("2006-02-15 05:03:42"))
                                && film.getReleaseYear() == 2006
                                && film.getRentalDuration() == 5)
                .map(Film::getTitle)
                .collect(Collectors.toList());
```
#### 14. Find the top 5 longest films (by length) in the database.
```java
films.stream()
                .sorted(Comparator.comparing(Film::getLength).reversed())
                .limit(5)
                .map(Film::getTitle)
                .collect(Collectors.toList());
```
#### 15. Find the top 5 shortest films (by length) in the database.
```java

```
#### 16. Find the top 5 films with the highest replacement cost in the database.
```java

```
#### 17. Find the top 5 films with the lowest replacement cost in the database.
```java

```
#### 18. Find the top 5 films with the highest rental rate in the database.
```java

```
#### 19. Find the top 5 films with the lowest rental rate in the database.
```java

```
#### 20. Find the top 5 films with the highest rental duration in the database.
```java

```
#### 21. Find the top 5 films with the lowest rental duration in the database.
```java

```
#### 46. Calculate the total number of rentals for each customer.
```java

```
#### 47. Calculate the total number of rentals for each customer in each store.
```java

```
#### 48. Calculate the total number of rentals for each customer in each store in each city.
```java

```
#### 49. Calculate the total number of rentals for each customer in each store in each city in each country.
```java

```
#### 50. Calculate the total number of rentals for each customer in each store in each city in each country in each year.
```java

```
#### 51. Calculate the total number of rentals for each customer in each store in each city in each country in each year in each month.
```java

```
#### 52. Calculate the total number of rentals for each customer in each store in each city in each country in each year in each month in each day.
```java

```
#### 53. Calculate the total number of rentals for each customer in each store in each city in each country in each year in each month in each day in each hour.
```java

```
#### 54. Calculate the total number of rentals for each customer in each store in each city in each country in each year in each month in each day in each hour in each minute.
```java

```
#### 55. Calculate the total number of rentals for each customer in each store in each city in each country in each year in each month in each day in each hour in each minute in each second.
```java

```
#### 56. Create a list of rental transactions with customer names and film titles.
```java

```
#### 57. Create a list of rental transactions with customer names and film titles and rental dates.
```java

```
#### 58. Create a list of rental transactions with customer names and film titles and rental dates and return dates.
```java

```
#### 59. Create a list of rental transactions with customer names and film titles and rental dates and return dates and staff names.
```java

```
#### 60. Create a list of rental transactions with customer names and film titles and rental dates and return dates and staff names and store names.
```java

```
#### 61. Create a list of rental transactions with customer names and film titles and rental dates and return dates and staff names and store names and city names.
```java

```
#### 62. Create a list of rental transactions with customer names and film titles and rental dates and return dates and staff names and store names and city names and country names.
```java

```
#### 63. Create a list of rental transactions with customer names and film titles and rental dates and return dates and staff names and store names and city names and country names and payment amounts.
```java

```
#### 64. Create a list of rental transactions with customer names and film titles and rental dates and return dates and staff names and store names and city names and country names and payment amounts and rental durations.
```java

```
#### 65. Create a list of rental transactions with customer names and film titles and rental dates and return dates and staff names and store names and city names and country names and payment amounts and rental durations and rental rates.
```java

```
#### 66. Create a list of rental transactions with customer names and film titles and rental dates and return dates and staff names and store names and city names and country names and payment amounts and rental durations and rental rates and replacement costs.
```java

```
#### 67. Create a list of rental transactions with customer names and film titles and rental dates and return dates and staff names and store names and city names and country names and payment amounts and rental durations and rental rates and replacement costs and rental dates.
```java

```
#### 68. Create a list of rental transactions with customer names and film titles and rental dates and return dates and staff names and store names and city names and country names and payment amounts and rental durations and rental rates and replacement costs and rental dates and rental durations.
```java

```
#### 69. Find all films with a rating of “R” and a length greater than 120 minutes.
```java

```
#### 70. Find all films with a rating of “R” and a length greater than 120 minutes and a rental rate of 2.99.
```java

```
#### 71. Find all films with a rating of “R” and a length greater than 120 minutes and a rental rate of 2.99 and a replacement cost of 10.99.
```java

```
#### 72. Find all films with a rating of “R” and a length greater than 120 minutes and a rental rate of 2.99 and a replacement cost of 10.99 and a rental duration of 5 days.
```java

```
#### 73. Calculate the average rental duration (in days) for each film category (e.g., Action, Drama, Comedy).
```java

```
#### 74. Calculate the average rental duration (in days) for each film category (e.g., Action, Drama, Comedy) in each store.
```java

```
#### 75. Calculate the average rental duration (in days) for each film category (e.g., Action, Drama, Comedy) in each store in each city.
```java

```
#### 76. Calculate the average rental duration (in days) for each film category (e.g., Action, Drama, Comedy) in each store in each city in each country.
```java

```
#### 77. Calculate the average rental duration (in days) for each film category (e.g., Action, Drama, Comedy) in each store in each city in each country in each year.
```java

```
#### 78. Calculate the average rental duration (in days) for each film category (e.g., Action, Drama, Comedy) in each store in each city in each country in each year in each month.
```java

```
#### 79. Calculate the average rental duration (in days) for each film category (e.g., Action, Drama, Comedy) in each store in each city in each country in each year in each month in each day.
```java

```
#### 80. Calculate the average rental duration (in days) for each film category (e.g., Action, Drama, Comedy) in each store in each city in each country in each year in each month in each day in each hour.
```java

```
#### 81. Calculate the average rental duration (in days) for each film category (e.g., Action, Drama, Comedy) in each store in each city in each country in each year in each month in each day in each hour in each minute.
```java

```
#### 82. Find the most popular film category (highest average rental duration).
```java

```
#### 83. Find the most popular film category (highest average rental duration) in each store.
```java

```
#### 84. Find the most popular film category (highest average rental duration) in each store in each city.
```java

```
#### 85. Find the most popular film category (highest average rental duration) in each store in each city in each country.
```java

```
#### 86. Retrieve the titles of all films rented by a specific customer (e.g., customer with ID 100). Sort the titles alphabetically.
```java

```
#### 87. Retrieve the titles of all films rented by a specific customer (e.g., customer with ID 100) in a specific store (e.g., store with ID 1). Sort the titles alphabetically.
```java

```
#### 88. Retrieve the titles of all films rented by a specific customer (e.g., customer with ID 100) in a specific store (e.g., store with ID 1) in a specific city (e.g., city with ID 100). Sort the titles alphabetically.
```java

```
#### 89. Retrieve the titles of all films rented by a specific customer (e.g., customer with ID 100) in a specific store (e.g., store with ID 1) in a specific city (e.g., city with ID 100) in a specific country (e.g., country with ID 100). Sort the titles alphabetically.
```java

```
#### 90. Retrieve the titles of all films rented by a specific customer (e.g., customer with ID 100) in a specific store (e.g., store with ID 1) in a specific city (e.g., city with ID 100) in a specific country (e.g., country with ID 100) in a specific year (e.g., 2006). Sort the titles alphabetically.
```java

```
#### 91. Retrieve the titles of all films rented by a specific customer (e.g., customer with ID 100) in a specific store (e.g., store with ID 1) in a specific city (e.g., city with ID 100) in a specific country (e.g., country with ID 100) in a specific year (e.g., 2006) in a specific month (e.g., 2). Sort the titles alphabetically.
```java

```
#### 92. Retrieve the titles of all films rented by a specific customer (e.g., customer with ID 100) in a specific store (e.g., store with ID 1) in a specific city (e.g., city with ID 100) in a specific country (e.g., country with ID 100) in a specific year (e.g., 2006) in a specific month (e.g., 2) in a specific day (e.g., 15). Sort the titles alphabetically.
```java

```
#### 93. Retrieve the titles of all films rented by a specific customer (e.g., customer with ID 100) in a specific store (e.g., store with ID 1) in a specific city (e.g., city with ID 100) in a specific country (e.g., country with ID 100) in a specific year (e.g., 2006) in a specific month (e.g., 2) in a specific day (e.g., 15) in a specific hour (e.g., 5). Sort the titles alphabetically.
```java

```
#### 94. Flat Mapping: Get a list of all distinct actors who have appeared in any film.
```java

```
#### 95. Flat Mapping: Get a list of all distinct actors who have appeared in any film and sort them alphabetically.
```java

```
#### 96. Flat Mapping: Get a list of all distinct actors who have appeared in any film and sort them alphabetically and group them by the first letter of their first name.
```java

```
#### 97. Flat Mapping: Get a list of all distinct actors who have appeared in any film and sort them alphabetically and group them by the first letter of their first name and count the number of actors in each group.
```java

```
#### 98. Flat Mapping: Get a list of all distinct actors who have appeared in any film and sort them alphabetically and group them by the first letter of their first name and count the number of actors in each group and sort the groups by the number of actors in each group.
```java

```
#### 99. Flat Mapping: Get a list of all distinct actors who have appeared in any film and sort them alphabetically and group them by the first letter of their first name and count the number of actors in each group and sort the groups by the number of actors in each group and sort the actors within each group by the number of films they have appeared in.
```java

```
#### 100. Flat Mapping: Get a list of all distinct actors who have appeared in any film and sort them alphabetically and group them by the first letter of their first name and count the number of actors in each group and sort the groups by the number of actors in each group and sort the actors within each group by the number of films they have appeared in and sort the groups by the number of films they have appeared in.
```java

```
#### 101. Find the total revenue generated by each actor (sum of payments for films they starred in).
```java

```
#### 102. Find the total revenue generated by each actor (sum of payments for films they starred in) and sort the actors by the total revenue generated.
```java

```
#### 103. Find the total revenue generated by each actor (sum of payments for films they starred in) and sort the actors by the total revenue generated and group them by the first letter of their first name.
```java

```
#### 104. Find the total revenue generated by each actor (sum of payments for films they starred in) and sort the actors by the total revenue generated and group them by the first letter of their first name and sort the groups by the total revenue generated.
```java

```
#### 105. Find the total revenue generated by each actor (sum of payments for films they starred in) and sort the actors by the total revenue generated and group them by the first letter of their first name and sort the groups by the total revenue generated and sort the actors within each group by the total revenue generated.
```java

```
#### 106. Find the total revenue generated by each actor (sum of payments for films they starred in) and sort the actors by the total revenue generated and group them by the first letter of their first name and sort the groups by the total revenue generated and sort the actors within each group by the total revenue generated and sort the groups by the number of actors in each group.
```java

```
#### 107. Find the total revenue generated by each actor (sum of payments for films they starred in) and sort the actors by the total revenue generated and group them by the first letter of their first name and sort the groups by the total revenue generated and sort the actors within each group by the total revenue generated and sort the groups by the number of actors in each group and sort the actors within each group by the number of films they have appeared in.
```java

```
#### 108. Find the total revenue generated by each actor (sum of payments for films they starred in) and sort the actors by the total revenue generated and group them by the first letter of their first name and sort the groups by the total revenue generated and sort the actors within each group by the total revenue generated and sort the groups by the number of actors in each group and sort the actors within each group by the number of films they have appeared in and sort the groups by the number of films they have appeared in.
```java

```
#### 109. Find the total revenue generated by each actor (sum of payments for films they starred in) and sort the actors by the total revenue generated and group them by the first letter of their first name and sort the groups by the total revenue generated and sort the actors within each group by the total revenue generated and sort the groups by the number of actors in each group and sort the actors within each group by the number of films they have appeared in and sort the groups by the number of films they have appeared in and sort the actors within each group by the number of payments they have received.
```java

```
#### 110. Find the total revenue generated by each actor (sum of payments for films they starred in) and sort the actors by the total revenue generated and group them by the first letter of their first name and sort the groups by the total revenue generated and sort the actors within each group by the total revenue generated and sort the groups by the number of actors in each group and sort the actors within each group by the number of films they have appeared in and sort the groups by the number of films they have appeared in and sort the actors within each group by the number of payments they have received and sort the groups by the number of payments they have received.
```java

```
#### 111. Retrieve the films that have been rented more than 50 times and have a rating of “PG” or “PG-13”.
```java

```
#### 112. Retrieve the films that have been rented more than 50 times and have a rating of “PG” or “PG-13” and a rental rate of 0.99.
```java

```
#### 113. Retrieve the films that have been rented more than 50 times and have a rating of “PG” or “PG-13” and a rental rate of 0.99 and a replacement cost of 20.99.
```java

```
#### 114. Retrieve the films that have been rented more than 50 times and have a rating of “PG” or “PG-13” and a rental rate of 0.99 and a replacement cost of 20.99 and a rental duration of 5 days.
```java

```
#### 115. Retrieve the films that have been rented more than 50 times and have a rating of “PG” or “PG-13” and a rental rate of 0.99 and a replacement cost of 20.99 and a rental duration of 5 days and a rental rate of 4.99.
```java

```
#### 116. Retrieve the films that have been rented more than 50 times and have a rating of “PG” or “PG-13” and a rental rate of 0.99 and a replacement cost of 20.99 and a rental duration of 5 days and a rental rate of 4.99 and a rental duration of 5 days.
```java

```
#### 117. Retrieve the films that have been rented more than 50 times and have a rating of “PG” or “PG-13” and a rental rate of 0.99 and a replacement cost of 20.99 and a rental duration of 5 days and a rental rate of 4.99 and a rental duration of 5 days and a rental rate of 4.99.
```java

```
#### 118. Calculate the average rental duration (in days) for each film category, but exclude the “Documentary” category.
```java

```
#### 119. Calculate the average rental duration (in days) for each film category, but exclude the “Documentary” category, and group the results by store.
```java

```
#### 120. Calculate the average rental duration (in days) for each film category, but exclude the “Documentary” category, and group the results by store and city.
```java

```
#### 121. Calculate the average rental duration (in days) for each film category, but exclude the “Documentary” category, and group the results by store and city and country.
```java

```
#### 122. Calculate the average rental duration (in days) for each film category, but exclude the “Documentary” category, and group the results by store and city and country and year.
```java

```
#### 123. Find the category with the highest average rental duration (excluding “Documentary”). If there is a tie, return all categories.
```java

```
#### 124. Find the category with the highest average rental duration (excluding “Documentary”) in each store. If there is a tie, return all categories.
```java

```
#### 125. Find the category with the highest average rental duration (excluding “Documentary”) in each store in each city. If there is a tie, return all categories.
```java

```
#### 126. Find the category with the highest average rental duration (excluding “Documentary”).
```java

```
#### 127. Determine the total revenue generated by each customer. Consider both rental payments and late fees.
```java

```
#### 128. Retrieve the titles of films that have been rented by all customers.
```java

```
#### 129. Retrieve the titles of films that have been rented by all customers in a specific store.
```java

```
#### 130. Retrieve the titles of films that have been rented by all customers in a specific store in a specific city.
```java

```
#### 131. Find the total number of rentals for each actor. Use parallel streams for better performance.
```java

```
#### 132. Find the total number of rentals for each actor in each film category. Use parallel streams for better performance.
```java

```
#### 133. Find the total number of rentals for each actor in each film category in each store. Use parallel streams for better performance.
```java

```
#### 134. Find the total number of rentals for each actor in each film category in each store in each city. Use parallel streams for better performance.
```java

```
#### 135. Find the total number of rentals for each actor in each film category in each store in each city in each country. Use parallel streams for better performance.
```java

```
#### 136. Retrieve the titles of films that have been rented more than 100 times and have a rating of “PG” or “PG-13”. Sort the titles alphabetically.
```java

```
#### 137. Retrieve the titles of films that have been rented more than 100 times and have a rating of “PG” or “PG-13” and a rental rate of 0.99. Sort the titles alphabetically.
```java

```
#### 138. Retrieve the titles of films that have been rented more than 100 times and have a rating of “PG” or “PG-13” and a rental rate of 0.99 and a replacement cost of 20.99. Sort the titles alphabetically.
```java

```
#### 139. Retrieve the titles of films that have been rented more than 100 times and have a rating of “PG” or “PG-13” and a rental rate of 0.99 and a replacement cost of 20.99 and a rental duration of 5 days. Sort the titles alphabetically.
```java

```
#### 140. Calculate the average rental duration (in days) for each film category, excluding the “Documentary” category.
```java

```
#### 141. Calculate the average rental duration (in days) for each film category, excluding the “Documentary” category, and group the results by store.
```java

```
#### 142. Calculate the average rental duration (in days) for each film category, excluding the “Documentary” category, and group the results by store and city.
```java

```
#### 143. Find the category with the highest average rental duration (excluding “Documentary”).
```java

```
#### 144. Find the category with the highest average rental duration (excluding “Documentary”) in each store.
```java

```
#### 145. Find the category with the highest average rental duration (excluding “Documentary”). If there is a tie, return all categories.
```java

```
#### 146. Determine the total revenue generated by each customer. Consider both rental payments and late fees.
```java

```
#### 147. Retrieve the titles of films that have been rented by all customers.
```java

```
#### 148. Retrieve the titles of films that have been rented by all customers in a specific store.
```java

```
#### 149. Find the total number of rentals for each actor. Use parallel streams for better performance.
```java

```
#### 150. Find the total number of rentals for each actor in each film category. Use parallel streams for better performance.
```java

```
#### 151. Find the total number of rentals for each actor in each film category in each store. Use parallel streams for better performance.
```java

```
#### 152. Retrieve the titles of films that have been rented more than 100 times and have a rating of “PG” or “PG-13”. Sort the titles alphabetically.
```java

```
#### 153. Retrieve the titles of films that have been rented more than 100 times and have a rating of “PG” or “PG-13” and a rental rate of 0.99. Sort the titles alphabetically.
```java

```
#### 154. Retrieve the titles of films that have been rented more than 100 times and have a rating of “PG” or “PG-13” and a rental rate of 0.99 and a replacement cost of 20.99. Sort the titles alphabetically.
```java

```
#### 155. Retrieve the titles of films that have been rented more than 100 times and have a rating of “PG” or “PG-13” and a rental rate of 0.99 and a replacement cost of 20.99 and a rental duration of 5 days. Sort the titles alphabetically.
```java

```
#### 156. Find the total number of films in each category.
```java

```
#### 157. Find the total number of films in each category for each rating.
```java

```
#### 158. Find the most rented film in the database.
```java

```
#### 159. Find the customer who has made the most rentals.
```java

```
#### 160. Find the store that has processed the most rentals.
```java

```
#### 161. Find the total revenue for each store.
```java

```
#### 162. Find the most common film rating in the database.
```java

```
#### 163. Find the average rental rate for films in the database.
```java

```
#### 164. Find the average length of films in each category.
```java

```
#### 165. Find the total number of actors for each film.
```java

```
#### 166. Find the film with the most actors.
```java

```
#### 167. Find the actor who has appeared in the most films.
```java

```
#### 168. Find the total number of films rented in each month of a specific year.
```java

```
#### 169. Find the total number of films rented in each year.
```java

```
#### 170. Find the total number of rentals for each film category in each year.
```java

```
#### 171. Find the total revenue generated by each film.
```java

```
#### 172. Find the film that has been rented in the most number of different countries.
```java

```
#### 173. Find the customer who has rented films from the most number of different categories.
```java

```
#### 174. Find the actor who has worked with the most number of different directors.
```java

```
#### 175. Find the director who has worked with the most number of different actors.
```java

```
#### 176. Find the most popular film category in each city (based on the number of rentals).
```java

```
#### 177. Find the month with the highest number of rentals for each year.
```java

```
#### 178. Find the store that has the most number of films in inventory.
```java

```
#### 179. Find the film that has been rented out from the most number of different stores.
```java

```
#### 180. Find the customer who has made rentals in the most number of different months.
```java

```
#### 181. Find the actor who has appeared in the most number of films in a specific category.
```java

```
#### 182. Find the category that has the most number of films rented in a specific month.
```java

```
#### 183. Find the store that has the most rentals in a specific month of a specific year.
```java

```
#### 184. Find the customer who has rented the most films in a specific category.
```java

```
#### 185. Find the film that has been rented the most in a specific city.
```java

```
#### 186. Find the actor who has appeared in the most number of films rented in a specific city.
```java

```
#### 187. Find the category that has the most number of films rented by a specific customer.
```java

```
#### 188. Find the film that has been rented the most by customers from a specific store.
```java

```
#### 189. Find the actor who has appeared in the most number of films rented by customers from a specific store.
```java

```
#### 190. Find the category that has the most number of films rented by customers from a specific store.
```java

```
#### 191. Find the actor who has appeared in the most number of films within a specific duration.
```java

```
#### 192. Find the director who has directed the most number of films within a specific duration.
```java

```
#### 193. Find the customer who has rented the most number of unique films.
```java

```
#### 194. Find the store that has the most number of unique customers.
```java

```
#### 195. Find the film that has been rented in the most number of different countries within a specific duration.
```java

```
#### 196. Find the customer who has rented films from the most number of different categories within a specific duration.
```java

```
#### 197. Find the actor who has worked with the most number of different directors within a specific duration.
```java

```
#### 198. Find the director who has worked with the most number of different actors within a specific duration.
```java

```
#### 199. Find the most popular film category in each city within a specific duration (based on the number of rentals).
```java

```
#### 200. Find the month with the highest number of rentals for each year within a specific duration.
```java

```
#### 201. Find the film with the longest title using Stream.max() and Comparator.comparingInt().
```java

```
#### 202. Find the film with the shortest title using Stream.min() and Comparator.comparingInt().
```java

```
#### 203. Get a list of all film titles sorted in ascending order using Stream.sorted().
```java

```
#### 204. Get a list of all film titles sorted in descending order using Stream.sorted() and Comparator.reverseOrder().
```java

```
#### 205. Get a list of all unique film ratings using Stream.distinct().
```java

```
#### 206. Count the number of films with a rating of "PG" using Stream.filter() and Stream.count().
```java

```
#### 207. Check if there are any films with a rental rate higher than 4.0 using Stream.anyMatch().
```java

```
#### 208. Check if all films have a rental rate higher than 0.0 using Stream.allMatch().
```java

```
#### 209. Check if none of the films have a rental rate of 0.0 using Stream.noneMatch().
```java

```
#### 210. Get a list of all film titles in uppercase using Stream.map().
```java

```
#### 211. Get the total rental rate of all films using Stream.mapToDouble() and DoubleStream.sum().
```java

```
#### 212. Get the average rental rate of all films using Stream.mapToDouble() and DoubleStream.average().
```java

```
#### 213. Get a map of film categories to list of film titles in that category using Stream.collect() and Collectors.groupingBy().
```java

```
#### 214. Get a map of film categories to count of films in that category using Stream.collect() and Collectors.groupingBy(), Collectors.counting().
```java

```
#### 215. Get a map of film categories to average film length in that category using Stream.collect(), Collectors.groupingBy() and Collectors.averagingInt().
```java

```
#### 216. Get a map of film categories to total film length in that category using Stream.collect(), Collectors.groupingBy() and Collectors.summingInt().
```java

```
#### 217. Get a string of all film titles separated by ", " using Stream.collect() and Collectors.joining().
```java

```
#### 218. Get a summary statistics of film lengths using Stream.collect() and Collectors.summarizingInt().
```java

```
#### 219. Partition films into two groups: those with a rental rate higher than 2.0 and those with a rental rate of 2.0 or lower using Stream.collect() and Collectors.partitioningBy().
```java

```
#### 220. Get a map of film categories to a list of films in that category sorted by title using Stream.collect(), Collectors.groupingBy() and Collectors.mapping(), Collectors.toList().