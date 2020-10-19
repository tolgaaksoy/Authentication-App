# Authentication Application.
This application is an example of an authentication application developed with Spring Boot and React.js. Backend is developed with Spring Boot, Spring Security, Spring Data and JWT. While developing Frontend, React, React Router and Axios were used. Also, Bootstrap was used during the development process.

### Using Tools & Technologies
#### Backend
* Java 8
* Spring Boot 2.1.8 (with Spring Security, Spring Web, Spring Data JPA)
* jjwt 0.9.1
* MySQL
* Maven 3.6.1

#### Frontend
* React 16
* react-router-dom 5.1.2
* axios 0.19.2
* react-validation 3.0.7
* Bootstrap 4
* validator 12.2.0
___

These are APIs that we need to provide:

| Method  | Route  | Body  | Description  |
|---|---|---|---|
| `POST`  | /api/auth/signup   | {"username", "email", "password", "role"}   | Signup new account  |
| `POST`  | /api/auth/signup   | {"username", "email", "password"}   | Signup new account  |
| `POST` | /api/auth/signin  | {"username", "password"} | Login an account  |
| `GET`  | /api/test/all  | Empty  | Retrieve public content  |
| `GET`  | /api/test/user  | Empty  | Access User’s content  |
| `GET` | /api/test/mod  | Empty   | Moderator’s content  |
| `GET` | /api/test/admin  | Empty  | Admin’s content  |
___

### UI
Some screenshots from the application.
* Signup page:

*/signup*

![alt text](https://user-images.githubusercontent.com/24254922/96254968-d532a100-0fbe-11eb-87a5-0f1eb745dc71.png)

![alt text](https://user-images.githubusercontent.com/24254922/96254966-d49a0a80-0fbe-11eb-858d-f7d110f60b04.png)
___

* Form Validation Support:

![alt text](https://user-images.githubusercontent.com/24254922/96254965-d49a0a80-0fbe-11eb-8463-43c8cc1c0647.png)

![alt text](https://user-images.githubusercontent.com/24254922/96254963-d4017400-0fbe-11eb-8917-429515df3570.png)
___

* Login Page:

*/login*

![alt text](https://user-images.githubusercontent.com/24254922/96254958-d368dd80-0fbe-11eb-9989-370ef166a8f1.png)
___


* Unsuccessful login:

![alt text](https://user-images.githubusercontent.com/24254922/96255742-16778080-0fc0-11eb-9b39-d700a839b018.png)
___

* Profile Page (successful login):

*/profile*

![alt text](https://user-images.githubusercontent.com/24254922/96254971-d532a100-0fbe-11eb-8275-56defde8439d.png)
___


Navigation bar changes according to the authorizations.

* Public Content Page:

*/home*

![alt text](https://user-images.githubusercontent.com/24254922/96254962-d4017400-0fbe-11eb-93a7-4b249d291002.png)
___

* User Content Page:

*/user*

![alt text](https://user-images.githubusercontent.com/24254922/96254972-d5cb3780-0fbe-11eb-9e62-949a30fac9f3.png)
___

* Error Page(Unauthorized)

*/mod*

![alt text](https://user-images.githubusercontent.com/24254922/96283146-6ff1a680-0fe4-11eb-8e43-6cbc438ed8d3.png)
___

* Profile Page (successful login):

*/profile*

![alt text](https://user-images.githubusercontent.com/24254922/96254957-d2d04700-0fbe-11eb-86d7-18f035a5570d.png)
___

* Admin Page:

*/admin*

![alt text](https://user-images.githubusercontent.com/24254922/96283144-6ff1a680-0fe4-11eb-9a2b-028e632fd75d.png)
___

* Moderator Page:

*/mod*

![alt text](https://user-images.githubusercontent.com/24254922/96283142-6ec07980-0fe4-11eb-9347-e518baa8a3cf.png)


