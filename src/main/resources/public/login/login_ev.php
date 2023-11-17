<?php
    session_start();
    include('sever.php');

    $errors = array();

    if(isset($_POST['login_user'])){
        $username = mysqli_real_escape_string($conn, $_POST['username']);
        $password = mysqli_real_escape_string($conn, $_POST['password']);

        if(empty($username)){
            array_push($errors, "Username is required");
        }

        if(empty($password)){
            array_push($errors, "password is required");
        }

        if(count($errors)== 0){
            $password = md5($password);
            $query = "SELECT * FROM user WHERE username = '$username'AND password = '$password'";
            $result = mysqli_query($conn, $query);

            if(mysqli_num_rows($result) == 1) {
                $_SESSION["username"] = $username;
                $_SESSION['success'] = "";
                header("location: ../homepage/home2.php");
            }else {
                array_push($errors, "Wrong username/password");
                $_SESSION['error'] = "Wrong username or password please try again";
                header("location: login.php");
            }
        }
    }

?>