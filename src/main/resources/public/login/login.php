
<?php 
    session_start();
    include('sever.php');
    ?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login page</title>

    <link rel="stylesheet" href="style.css">
</head>
<body>
    
    <div class="headder">
        <h2>Login</h2>
    </div>

    <form action="login_ev.php" method="post">
        <?php if (isset($_SESSION['error'])) : ?>
            <div class="error">
                <h3>
                    <?php
                        echo $_SESSION['error'];
                        unset($_SESSION['error']);
                    ?>
                </h3>
            </div>
        <?php endif ?>
        <div class="input_group">
            <label for="username">Username</label>
            <input type="text" name="username">
        </div>
        <div class="input_group">
            <label for="password">Password</label>
            <input type="password" name="password">
        </div>
        <div class="input_group">
            <button type="submit" name="login_user" class="btn">Login</button>
        </div>
        <p>Not yet a member? <a href="register.php">Sign up</a></p>
    </form>
    
</body>
</html>