<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Profile Form</title>

    <script language="JavaScript">
        function validate() {
            return validateFirstName() && validateLastName() && validateAddress1()
                && validateCity() && validateState();
        }
        function validateFirstName(){

            var first = document.profile.FirstName.value;
            var valid = true;

            if (first === null || first === "") {
                alert("First Name cannot be blank, please try again!");
                valid = false;
            }

            return valid;
        }

        function validateLastName(){

            var last = document.profile.LastName.value;
            var valid = true;

            if (last === null || last === "") {
                alert("Last Name cannot be blank, please try again");
                valid = false;
            }

            if (valid) {
            }
            return valid;
        }

        function validateAddress1(){

            var add1 = document.profile.Address1.value;
            var valid = true;

            if (add1 === null || add1 === "") {
                alert("Please enter your address");
                valid = false;
            }

            if (valid) {
            }
            return valid;
        }
        function validateCity(){

            var cit = document.profile.City.value;
            var valid = true;

            if (cit === null || cit === "") {
                alert("Please enter your city");
                valid = false;
            }

            if (valid) {
            }
            return valid;
        }
        function validateState(){

            var st = document.profile.State.value;
            var valid = true;

            if (st === null || st === "") {
                alert("Please enter your state");
                valid = false;
            }

            if (valid) {
            }
            return valid;
        }
    </script>


</head>
<body>

<p>Please fill out the form:</p>

<form id="registration" name="registration" action="addUser" method="post">
First Name: <input type="text" name="FirstName" maxlength="15"><br/>

Last Name:  <input type="text" name="LastName" maxlength="15"><br/>

Address 1:  <input type="text" name="Address1" maxlength="25"><br/>

Address 2:  <input type="text" name="Address2" maxlength="25"><br/>

City: <input type="text" name="City" maxlength="20"><br/>

State: <input type="text" name="State" maxlength="20"><br/>

Zip Code:  <input type="number" name="Zip" maxlength="9"><br/>

Country: <select name="Country">
        <option value="US">United States</option>
        </select><br/>

    <input type="submit" name="submit" onclick="return validate()" value="Submit">
</form>

</body>
</html>


