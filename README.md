#Project Description...

This Spring Boot application serves as a Cart Service, interacting with the Fake Store API to retrieve product information. The service follows the MVC(Model views controller) pattern, providing endpoints for managing carts and retrieving product details.


# Setup :-
first we installed 
JDK 17 
then we
installed Maven.
and setup our Vscode along with downloading - (spring Boot extension) , spring web and other required extension on our vscode 
we named our file as com.example.Product (groupby is a way to uniquely identify your Domain)  so , I named as it in reverse order .. there is no hard and fast rule to name your Domain as in reverse order but it is good Practice to name your Domain as in reverse order..

API endPoints :- 
1) Retrive Product Details :-
 URL: /products/{productId}
Method: GET (this GET method is used for retrive or fetch your product details)
Description: Retrieves details of a specific product.
Parameters:
{productId}: The unique identifier of the product.

2)  Add Product:
URL: /products
Method: POST (Post method works as creating a new product , it works as replacer if exists then replace it anf if not exists then creat new one . )
Description: Adds a product to the user's cart.
Request Body:

3)Range of a Product :-
Method : - GET (As i explaind above get method use to retrive data)
# Service section :- this section is called a business logic section because here all logic of your code is given ...

DTos : - data transfer object most important , this is having all useful information that u needed this is your traveller sending and fetching all data go through with DTOs .. 


this is all about my project hope you finds it useful ..thanks for giving your time 



