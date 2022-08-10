# group1_project
Jst foods is a food delivery application made by group1. Team leader Diptoprava Jana . Other team-members are spandana,tejwaswini,sivasankar,jagan mohan.
HOW TO RUN OUR PROJECT:-
In this project we have 4 rest apis: customer,menu,cart and delivery partner. Customer and cart both under Group1-jst-food1
1.After extracting and setting up the backend please update the password of workbench in all the api's src/main/resources-> application.properties .
Create a database called jstfood in workbench or you can change as you like , just have to change the application.properties accordingly
in workbench.
2.Please run all 3 apis in the backend folder.(Group1-jst-food1,menu,delivery partner.)All have different ports. To make sure our application is working fine 
we need all 3 to run simultaneously.
3.For now in our project the admin add menu in nav bar is open to all by that you have to add food items in the database by that you can add picture but for that a query 
need to be executed that is : "alter table jstfood.menu modify column picture longblob;" as by default the picture column is tinyblob and it does not support pictures .
4.In our case the menu in navbar is just for show it's purely frontend based . To add items to cart atfirst you have to add items using admin add menu then in 
go to cart you can see the menu items with pictures then if you press add to cart item would be added in and you can see them in view cart.
5.For the view cart to properly work you have to login successfully.
6.In sign up you have to give proper email,phone number and password that starts with a capital letter and rest and atleast 7 alfanumeric characters.
