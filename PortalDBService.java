package com.dronerecon.ws;

import java.io.*;
public class PortalDBService extends HttpServlet{
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=utf-8");
        response.addHeader("Access-Control-Allow-Origin", "*");
        PrintWriter out = response.getWriter();

// ############
// Get 5 parameter values from the request object (these are passed in
// from part 1 code).
// "area_id" : String type
// "tilex" : int type (Reference part 1 of Project 2 for converting
//        string to int).
// "tiley"
// "r"
// "g"
        String sArea_id = request.getParameter("area_id");
        String sTileX = request.getParameter("tilex");
        String sTileY = request.getParameter("tiley");
        int iTileX = Integer.parseInt(sTileX);
        int iTileY = Integer.parseInt(sTileY);
        String r =request.getParameter("r");
        String g =request.getParameter("g");
        int ir = Integer.parseInt(r);
        int ig = Integer.parseInt(g);

// ############


// ############
// Instantiate a DBManager instance.
        DBManager oDBManager = new DBManager();
// ############

        // Set DB location (Currently uses current DB file name and adds direct
        //path from C drive before it).
        oDBManager.DBLocation = "C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\dronereconportal\\db\\dronedata.sqlite";
        //*** IMPORTANT: For Mac Users, comment out the above and use below line:
        //oDBManager.DBLocation = System.getProperty("catalina.base") +
        //"/webapps/dronereconportal/db/" + oDBManager.DBLocation;

        // ############
// Call insertAreaGridTile on db manager object and pass the 5 values
        oDBManager.insertAreaGridTile(sArea_id,iTileX,iTileY,ir,ig);
        //from above.

        // ############
        // Response with confirmation of DB record written.
        out.println("{\"success\":true}");
    }
}
