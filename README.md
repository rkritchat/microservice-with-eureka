# microservice-with-eureka
This project is example for microservice by using Eureka.<br><br>
Reverse proxy  : Eureka<br>
Api-getway / Loadbalance : Nginx<br>
Eureka console : http://localhost:8761/ <br><br>

<b>This project contain three microservices</b><br>

  1. student-info-service<br>
    <ul>
    <li> mock StudentModel
    <li> call library-info-service
    <li> call school-info-service
    </ul><br>
  2. library-info-service<br>
    <ul>
    <li> mock LibraryModel
    </ul><br>
  3. school-subject-info-service<br>
    <ul>
    <li> mock SchoolSubjectModel
    </ul><br>

<b>This project not use database.</b><br>
<br>
Install nginx<br>
  1.sudo apt-get insatll nginx<br>
  2.Modify route by hit command<br>
    -> cd /etc/nginx/sites-available<br>
    -> sudo nano default<br>
  3.Modify file default add location to mapping port<br>
    ex.<br> 
      location / {<br>
		        proxy_pass        http://localhost:8080;<br>
            proxy_set_header  X-Real-IP $remote_addr;<br>
            proxy_set_header  X-Forwarded-For $proxy_add_x_forwarded_for;<br>
            proxy_set_header  Host $http_host;<br>
	   }<br>
   Above example is mapping port localhost8080 to localhost    
   
   <br><br>
   <b>nginx command</b>
   - go to nginx directory : cd /etc/nginx/sites-enabled  (this path will has default in type text)<br>
   - start revert poxy : sudo service nginx start<br>
   - stop nginx : sudo service nginx stop<br>
   
