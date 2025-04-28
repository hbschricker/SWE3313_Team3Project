<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Customer Login</title>
    <style>
        /* Reset */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, Monospace;
            background-color: lightgray;
        }

        header {
            background-color: #fff;
            padding: 12px 20px;
        }

        .top-bar {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .logo {
            height: 100px;
        }

        .store-name {
            font-size: 24px;
            font-weight: bold;
            color: #333;
            margin-left: 15px;
        }

        .icons span {
            font-size: 24px;
            margin-left: 16px;
            cursor: pointer;
        }

        nav {
            background-color: #eee;
            padding: 12px 24px;
            display: flex;
            justify-content: center;
            gap: 20px;
        }

        nav button {
            background-color: lightgray;
            border: none;
            font-size: 16px;
            cursor: pointer;
            padding: 12px;
            transition: background-color 0.3s;
        }

        nav button:hover {
            background-color: #87CEFA;
        }

        main {
            display: flex;
            justify-content: center;
            margin-top: 50px;
        }

        .form-container {
            background-color: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0px 4px 12px rgba(0, 0, 0, 0.1);
            text-align: center;
            max-width: 450px;
            width: 100%;
        }

        form {
            display: flex;
            flex-direction: column;
            gap: 15px;
        }

        input, button {
            padding: 12px;
            font-size: 16px;
            border-radius: 8px;
            border: 1px solid #ddd;
            width: 100%;
        }

        input:focus {
            outline: none;
            border-color: #707070;
        }

        button {
            background-color: #808080;
            color: white;
            border: none;
        }

        button:hover {
            background-color: #87CEFA;
        }

        .message {
            color: red;
            margin-top: 10px;
        }

        /* Mobile Responsiveness */
        @media (max-width: 600px) {
            header, nav {
                flex-direction: column;
                align-items: center;
                text-align: center;
            }

            nav button {
                margin-bottom: 10px;
            }
        }
    </style>
</head>
<body>

<!-- Header Section -->
<header>
    <div class="top-bar">
        <img src="/images/logo.jpg" class="logo" alt="Logo">
        <div class="store-name">The BaeBijoux</div> <!-- Store name added here -->
        <div class="icons">
            <!-- User icon linked to login page -->
            <a href="login.html">
                <span>&#128100;</span> <!-- User -->
            </a>
            <!-- Cart icon linked to a JavaScript function to show message -->
            <span onclick="alert('You must login in order to check out.');">&#128722;</span> <!-- Cart -->
        </div>
    </div>
    <nav>
        <!-- Home button linked to the homepage -->
        <a href="index.html"><button>Home</button></a>
        <button>About Us</button>
        <button>Contact Us</button>
    </nav>
</header>

<!-- Main Section -->
<main>
    <div class="form-container">
        <h2>Logged in</h2>
        <!-- Spring Boot message -->
        <p class="message">You are logged in</p>
    </div>
</main>

<!-- JavaScript to show login reminder on cart click -->
<script>
    function showCartMessage() {
        alert("You must login in order to check out.");
    }
</script>

</body>
</html>
