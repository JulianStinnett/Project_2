<%@ page import="com.dronerecon.ws.areaGridTile" %>
<%@ page import="com.dronerecon.ws.DBManager" %>
<%@ page import="java.util.ArrayList" %>

    // Step 2: Get incoming area id from other JSP.
    // Step 3:  Create an instance of DBManager.
    // Step 4:  Adjust DB location on DBManager object with similar line of code I provided in PortalDBService.java:
    // oDBManager.DBLocation = System.getProperty("catalina.base") +              "\\webapps\\dronereconportal\\db\\" + oDBManager.DBLocation;
    // Step 5:  Call readAreaGridTiles and pass in area id.
    // Step 6:  You get back an ArrayList<AreaGridTile> type.
    // Step 7:  Loop through and print out to the screen…
     //1.	The x,y values of the record with the highest r value.
     //2.	The x,y values of the record with the highest g value.

<html>
    <body>
        <%
        String sArea_id = request.getParameter("Area_id");
		
        DBManager oDBManager = new DBManager();
		
        oDBManager.DBLocation = "C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\dronereconportal\\db\\dronedata.sqlite";
		
        ArrayList<AreaGridTile> lstTiles.oDBManager.readAreadGridTiles(sArea_id);
		
        AreaGridTile GridTileRmax = lstTiles.get(0);
		
         AreaGridTile GridTileGmax = lstTiles.get(0);
		 
       
			lstTiles.forEach((rTile) -> {
				if (rTile.iR > GridTileRmax.iR{
				GridTileRmax = rTile;
				}
			}
			lstTiles.forEach((gTile) -> {
				if (gTile.iG > GridTileGmax.iG) {
				GridTileGmax = gTile;
				}
			}
		<h1> The highest Red value is: <%=GridTileRmax.iX%>, <%GridTileRmax.iY%> </h1>
		
		
		<h2> The highest Green value is: <%=GridTileGmax.iX%>, <%=GridTileGmax.iY%> </h2>
			
		%>
		
		
