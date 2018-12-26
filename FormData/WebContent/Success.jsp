<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Order Confirmation</title>
    <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <style>
    
    h1{
   text-align:center;
    }
    
    </style>
</head>
<body>
     <h1>Order Summary</h1>
     <div class="Container">
          <div class="title">
              <h2>Shipping Details:</h2>
              <div class=name>${FirstName} &nbsp; ${LastName}</div>
              <div class="add1">${Address1}</div>
              <div class="add2">${Address2}</div>
     </div>
     <br><br>

      <div class="Container">
            <table class="table">
                    <tr>
                        <th>Order ID</th>
                        <th>Cake Name</th>
                        <th>Size</th>
                        <th> Quantity</th>
                        <th>Total</th>
                    </tr>
                    <tr>
                        <td>${OrderID}</td>
                        <td>${Type}</td>
                        <td>${Size}</td>
                        <td>${Quantity}</td>
                        <td>${Total}</td>
                    </tr>
                  <!--  <tr>
                        <td>2>/td>
                        <td>Rice</td>
                        <td>Good</td>
                        <td>250 Bags</td>
                    <tr>
                        <td>3</td>
                        <td>Sugar</td>
                        <td>Good</td>
                        <td>200 Bags</td>
                    </tr> -->  
                  </table>
        </div>
                  
 


      </div>

     </div>

</body>
</html>