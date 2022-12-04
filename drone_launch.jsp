<html>

  <body>
<body style="background-color:teal;">
      <br />
      <h2 style="text-align:center;background-color:gray;color:white">DRONE RECON</h2>

      <!-- ###################################################
      Create a form here where the action is set to "drone_sim.jsp".
      Set a text input with name as "area_id".
      Set a text input with name as "colcount".
      Set a text input with name as "rowcount".
      Create a button with text similar to this: "Create Area Grid".
      ################################################### -->
      <form
      style = "
                  border: 3px inset;
                  border-radius: 7px;
                  background: white;
                  margin: 25px 40% 0px 20%;
                  padding: 40px;
      action = "drone_sim.jsp"
      >
          <center>  Area ID:<input name="area_id" type="text"> </center>
        <br>
         <center>   Column Count:<input name="colcount" type="text"></center>
             <br>
         <center>   Row Count:<input name="rowcount" type="text"></center>
             <br>
         <center>   <input style = "border: 2px outset;"  type="submit" value="Create Area Grid" ></center>
      </form>




  </body>
</html>
