TO RUN THIS APPLICATION FOLLOW THESES STEPS
NOTE :JAVA VERSION SHOULD BE 17 IF NOT IT DOEST WORKS AND YOUR MYSQL USERNAME AND PASSWORD SHOULD BE "root" and "root" IF ITS DIFERRENT CHANGE IT IN  application.properties FILE 

create a new folder whatever name u like and go to the git bash and run these commands
git clone " http link of the git repositery u want to clone "
open IDE ur comfortable with  like ecclipse,intelij
Now import the file in the IDE which u have cloned and start the application

To register u need to open the given below endpoint which is post method
http://localhost:8080/api/user/register
to register use postman since there no frontend choose post method and Body as JSON raw the json format is given below
 {
    "username": "ganesh1212",                    
    "password": "GANESH@123"                          
    "email": "amvsganesh@gmail.com",
    "gender": "male",
    "phonenumber":7075699899
      }
      NOTE : the given username ,password ,email all should be unique and not null and gender is non unique and phonenumber can be null if given it should be unique if u register again 

  TO FETCH THE DATA USING USERNAME AND PASSWORD FROM DATA USE THE BELOW ENDPOINT WHICH IS GETHOD WITH QUERY PARAMS TAKES AS INPUT
  http://localhost:8080/api/user/fetch?username=ganesh1212&password=GANESH123
  NOTE : here the username = your username ,password = your password
  curl -X POST http://localhost:8080/api/users \
  -H "Content-Type: application/json" \
  -d '{
        "username": "john_doe",
        "email": "john.doe@example.com",
        "password": "password123"
      }'

