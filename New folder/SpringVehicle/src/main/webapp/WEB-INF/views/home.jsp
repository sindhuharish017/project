<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
       #imgs{        
        position: relative;  
        height:100%;
        width:100%;
        opacity:0.8;
      }
      .head{
        position: absolute;
        top:30%;
        width:100%;
        text-align: center;
        font-size: 80px;
        color: rgb(0, 60, 73);
        font-weight: bolder;
        font-style: italic;
      }
      .desc{
        position:absolute;
        top:60%;
        width:100%;
        left:0%;
        text-align: center;
        font-size: 40px;
        color: rgb(255, 255, 255);
      }
      .play{
        position:absolute;
        top:50%;
        left:45%;
        color:black;
        font-weight: bolder;
        font-style: italic;
        font-size: 20px;
      }
      .admin{
        width:200px;
        height:25px;
      }
    </style>
</head>
<body>
<div id="carouselExampleSlidesOnly" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img id="imgs" src="project1.jpeg" class="d-block w-100" alt="...">
    </div>
    <center><h2 class="head">Smart Vehicle</h2></center>

    <center><form class="play" action="/admin" method="get">
      <table>
      <tr>
     <td><input class="admin" type="submit" name="submit" value="ADMIN"/><br></td>
     </form>
       <td><form class="desc" action="/userlogin" method="get">
      <input class="admin" type="submit" name="submit" value="USER"/><br>
      </form></td>
      </tr>
       </center>

</div>  
</body>
</html>