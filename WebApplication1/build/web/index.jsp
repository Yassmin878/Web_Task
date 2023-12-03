<%-- 
    Document   : index
    Created on : Dec 3, 2023, 2:40:29 PM
    Author     : Yassmin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <!--    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel="stylesheet" type="text/css" href="style.css" />
    <script src='main.js'></script>-->

</head>
<body>
    
    
    <div class="container">
        <form  id ="formm" action="signup.jsp"method="post">
    <div id="intro">
      <h1>Register</h1>
      </div>
    
      <p><b>Please fill in this form to create an account.</b></p>
      <hr>
      <label for="fname"><b>First Name</b></label>
      <input type="text" id="fname" name="firstname" placeholder="Your name.."required>
      <br>
      <label for="lname"><b>Last Name</b></label>
      <input type="text" id="lname" name="lastname" placeholder="Your last name.."required>
<br>
      <label for="phone"><b>Phone Number</b></label>
      <input type="text" id="phone" name="phonenuber" placeholder="Your Phone Number.." pattern="^\d{3}-\d{4}-\d{4}$" required>
    <br>
      <label for="country"><b>Country</b></label>
      
      <select id="select" name="country"  >
        
        <option value="egypt">Egypt</option>
        <option value="palestine">Palestine</option>
        <option value="turkey">Turkey</option>
        <option value="saudiarabia">Saudi Arabia</option>
        <option value="qatar">Qatar</option>
       
      </select>
     <br>
      <hr>
  
      <label for="email"><b>Email</b></label>
      <input type="text" placeholder="Enter Email" name="email" id="email" required>
      <script>
      
        const emailInput = document.getElementById('email');
        const emailRegex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
      
        emailInput.addEventListener('input', function() {
          if (emailRegex.test(this.value)) {
            this.setCustomValidity('');
          } else {
            this.setCustomValidity('Please enter a valid email address');
          }
        });
      </script>
   <br>
      <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="psw" id="psw" required>
   <br>
      <label for="psw-repeat"><b>Repeat Password</b></label>
      <input type="password" placeholder="Repeat Password" name="psw_repeat" id="psw_repeat" required>
      <hr>
  
      <button type="submit" class="registerbtn">Register</button>
    </div>
  
    <div class="container signin">
      <p>Already have an account?
         <a href="#">Sign in</a>.</p>
        </form>

    </div>
</body>
</html>
